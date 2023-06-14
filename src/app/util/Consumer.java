package app.util;

import javax.jms.*;
import app.view.TemporaryInterface;
import app.view.Error;

public class Consumer extends Link implements Runnable {
	/* Global Variables:
	=====================================================================*/
		Link linkObj;
		Topic topic;
		MessageConsumer consumer;
		Error errorObj;
		TemporaryInterface face;
		
	/* Constructor:
	=====================================================================*/
		public Consumer(Link linkObj, TemporaryInterface face) {
			this.linkObj = linkObj;
			this.topic = this.linkObj.getTopic();
			this.consumer = this.createConsumer();
			this.face = face;
		}
		
	/* Methods:
	=====================================================================*/
		/* Create Consumer:
		=================================================================*/
			public MessageConsumer createConsumer() {
				try {
					return this.linkObj.getSession().createConsumer(this.topic);
					
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
					return null;
				}
			}
		
		/* Message Listener:
		=================================================================*/
			public void run() {
			    try {
			        this.consumer.setMessageListener(new MessageListener() {
			        	Error error;
			            public void onMessage(Message message) {			            	
			                try {
			                	TextMessage textMessage = (TextMessage) message;
			                	String sender = textMessage.getStringProperty("Sender");
			                	
			                	String text = textMessage.getText();
			                	String messageBody = "@" + sender + ":\n" + text;
		                        
			                	// Here it should call the method to show the message:
			                	face.showMessage(messageBody);
		                        
			                } catch (JMSException e) {
			                    this.error.showError(e);
			                    e.printStackTrace();
			                }
			            }
			        });
			    } catch (JMSException e) {
			        this.errorObj.showError(e);
			        e.printStackTrace();
			    }
			}

			
}