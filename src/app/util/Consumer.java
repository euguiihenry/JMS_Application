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
		public Consumer(Link linkObj) {
			this.linkObj = linkObj;
			this.topic = this.linkObj.getTopic();
			this.consumer = this.createConsumer();
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
			                    if (message instanceof TextMessage) {
			                        TextMessage textMessage = (TextMessage) message;
			                        String text = textMessage.getText();
			                        System.out.println("Received message: " + text);
			                    }
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