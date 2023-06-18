package app.util;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import app.view.Room;
import app.view.Error;

public class Common {
	/* Variables:
	==================================================================================*/
		private String consumerUsername;
		private String producerUsername;
		private Producer producerClass;
		private Room room;
		private Error error;
		
	/* Constructor:
	=====================================================================*/
		public Common(Producer producer, Room room) {
			this.producerClass = producer;
			this.room = room;
			this.error = new Error();
		}
		
	/* Consumer Nickname Methods:
	==================================================================================*/
		/* Setter:
		==================================================================================*/
			public void setConsumerUsername(String message) {
				int firstSpaceIndex = message.indexOf(' ');
				
				
				if (firstSpaceIndex != -1) {
					String username = message.substring(1, firstSpaceIndex);
					this.consumerUsername = username;
					
				} else {
					// If there is no space, send like global message:
					producerClass.createMessage(message, this.getProducerUsername());
				}
			}
			
		/* Getter:
		==================================================================================*/
			public String getConsumerUsername() {
				return this.consumerUsername;
			}
			
	/* Producer Nickname Methods:
	==================================================================================*/
		/* Setter:
		==================================================================================*/
			public void setProducerUsername(String username) {
				this.producerUsername = username;
			}
			
		/* Getter:
		==================================================================================*/
			public String getProducerUsername() {
				return this.producerUsername;
			}
			
	/* Consumer Message Methods:
	==================================================================================*/			
			public void publishMessage(TextMessage message, String type) {
				try {
					String sender = message.getStringProperty("Sender");
					String messageTxt = message.getText();
					String showText = "";
					
					if(type == "global") {
						showText = "@" + sender + ":\n " + messageTxt;
					} 
					
					if(type == "private"){
						showText = "Mensagem privada de @" + sender + ":\n " + messageTxt;
					}
					
					this.room.showMessage(showText);
					
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	/* Send Message Method:
	==================================================================================*/
		public void sendMessage(String message) {
			if (!message.isEmpty()) {
				
				if (message.charAt(0) == '@') {
					// For Private Message:
					this.setConsumerUsername(message);
					producerClass.sendPrivately(message, this.getProducerUsername(), this.getConsumerUsername());
				} else {
					// For Global Message:
					producerClass.createMessage(message, this.getProducerUsername());
				}
				
			} else {
				String errorMsg = "Insira alguma mensagem antes de tentar enviar!";
				this.error.showMessage(errorMsg);
			}
			
			
		}
			
	/* Open Room:
	==================================================================================*/
		public void openRoom(Common common) {
			this.room.showInitialMessage(this.getProducerUsername());
			this.room.getCommon(common);
			this.room.setUsername(this.getProducerUsername());
			this.room.setVisible(true);
		}
}
