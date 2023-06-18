package app.util;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.TextMessage;

import app.view.Error;

public class Producer extends Link implements Runnable {
	/* Global Variables:
	=====================================================================*/
		Link linkObj;
		Error errorObj;
		
		MessageProducer producer;
		
	/* Constructor:
	=====================================================================*/
		public Producer(Link linkObj) {
			this.linkObj = linkObj;
		}
		
	/* Methods:
	=====================================================================*/
		/* Method Create Producer:
		=================================================================*/
			private void createProducer(Destination dest) {
				try {
					this.producer = this.linkObj.getSession().createProducer(dest);
					
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
				}
			}
			
		/* Method to Create Message:
		=================================================================*/
			public TextMessage createMessage(String messageTxt, String username) {
				createProducer(this.linkObj.getTopic());
				TextMessage message = null;
				
				try {
					message = this.linkObj.getSession().createTextMessage();
					message.setText(messageTxt);
					message.setStringProperty("Sender", username);
					producer.send(message);
					
				} catch (Exception e) {
					this.errorObj.showError((JMSException) e);
					System.exit(1);
				}
				
				return message;
				
			}
			
		/* Method to Create Message to a Private Consumer:
		=================================================================*/
			public TextMessage sendPrivately(String messageText, String sendBy, String destUsername) {
				createProducer(this.linkObj.getQueue());
				TextMessage message = null;
				
				try {
					message = this.linkObj.getSession().createTextMessage();
					message.setText(messageText);
					message.setStringProperty("Sender", sendBy);
					message.setStringProperty("Destination", destUsername);					
					System.out.println(message);
					producer.send(message);
					
					
				} catch (Exception e) {
					this.errorObj.showError((JMSException) e);
					System.exit(1);
				}
				
				return message;
			}
			
		/* Method Run:
		=================================================================*/
			public void run() {
				
			}
	
}