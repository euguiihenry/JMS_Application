package app.util;

import javax.jms.*;
import app.view.TemporaryInterface;
import app.view.Error;

public class Consumer extends Link implements Runnable, MessageListener {
	/* Global Variables:
	=====================================================================*/
		Link linkObj;
		Error errorObj;
		Common common;
		
	/* Constructor:
	=====================================================================*/
		public Consumer(Link linkObj, Common common) {
			this.linkObj = linkObj;
			this.common = common;
		}
		
	/* Methods:
	=====================================================================*/
		/* Create Global Consumer:
		=================================================================*/
			public MessageConsumer createGlobalConsumer() {
				try {
					return this.linkObj.getSession().createConsumer(this.linkObj.getTopic());
					
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
					return null;
				}
			}
			
		/* Create Private Consumer:
		=================================================================*/
			public MessageConsumer createPrivateConsumer() {
				try {
					String username = this.common.getProducerUsername(); // This is because it should be my username and since I'm a producer too.
					return this.linkObj.getSession().createConsumer(this.linkObj.getQueue(), "Destination = '" + username + "'");
					
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
					return null;
				}
			}
			
		/* Message Listeners:
		=================================================================*/
			public void listenGlobal() {
				try {
					MessageConsumer consumer = this.createGlobalConsumer();
					
					consumer.setMessageListener(new Consumer(this.linkObj, this.common));
					
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
				}
			}
			
			public void listenPrivately() {
				try {
					MessageConsumer consumer = this.createPrivateConsumer();
					
					consumer.setMessageListener(new Consumer(this.linkObj, this.common));
					
				} catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
				}
			}
		
		/* Run Methods:
		=================================================================*/
			public void run() {
			    this.listenGlobal();
			    this.listenPrivately();
			}

			@Override
			public void onMessage(Message message) {
				try {
		            if (message instanceof TextMessage) {
		                TextMessage textMessage = (TextMessage) message;
		                this.common.setConsumerMessage(textMessage.getText());
		            }
		        } catch (JMSException e) {
					this.errorObj.showError(e);
					e.printStackTrace();
				}
				
			}

			
}