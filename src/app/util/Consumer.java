package app.util;

import javax.jms.*;
import app.view.Error;

public class Consumer extends Link implements Runnable {
	/* Global Variables:
	=====================================================================*/
		Link linkObj;
		Topic topic;
		MessageConsumer consumer;
		Error errorObj;
		
	/* Constructor:
	=====================================================================*/
		public Consumer() {
			this.topic = this.linkObj.getTopic();
			try {
				this.consumer = this.linkObj.getSession().createConsumer(this.topic);
				
			} catch (JMSException e) {
				this.errorObj.showError(e);
				e.printStackTrace();
			}
		}
		
	/* Methods:
	=====================================================================*/
		/* Create Consumer:
		=================================================================*/
			public MessageConsumer createConsumer() {
				try {
					this.consumer = this.linkObj.getSession().createConsumer(this.topic);
					return this.consumer;
					
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
					return null;
				}
			}
		
		/* Message Listener:
		=================================================================*/
			public void run() {
				
				/*try {
					this.consumer.setMessageListener(new MessageListener() {
						
						public void onMessage(Message message) {
							if (message instanceof TextMessage) {
	                            TextMessage textMessage = (TextMessage) message;
	                            String text;
	                            text = textMessage.getText();
								System.out.println("Received message: " + text);
	                            
	                        }
						}
					});
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
				}*/
			}
			
}