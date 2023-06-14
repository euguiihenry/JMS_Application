package app.util;

import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.TextMessage;
import javax.jms.Topic;

import app.view.Error;

public class Producer extends Link implements Runnable {
	/* Global Variables:
	=====================================================================*/
		Link linkObj;
		Topic topic;
		MessageProducer producer;
		Error errorObj;
		
	/* Constructor:
	=====================================================================*/
		public Producer(Link linkObj) {
			this.linkObj = linkObj;
			this.topic = this.linkObj.getTopic();
			this.producer = this.createProducer();
		}
		
	/* Methods:
	=====================================================================*/
		/* Method Create Producer:
		=================================================================*/
			private MessageProducer createProducer() {
				try {
					return this.linkObj.getSession().createProducer(this.topic);
					
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
					return null;
				}
			}
			
		/* Method to Create Message:
		=================================================================*/
			public TextMessage createMessage(String messageTxt, String username) {
				TextMessage message = null;
				
				try {
					message = this.linkObj.getSession().createTextMessage();
					message.setText(messageTxt);
					//message.setStringProperty("Type", "Global");
					message.setStringProperty("Sender", username);
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
				/*String message = "Hello, world!";
				try {
					TextMessage textMessage = this.linkObj.getSession().createTextMessage(message);
					producer.send(textMessage);
					System.out.println("The message has been send");
					
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
				}*/
				
			}
	
}