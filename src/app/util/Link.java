package app.util;

import javax.jms.*;
import org.apache.activemq.*;
import app.view.Error;

public class Link extends Error{
	/* Global Variables: (The final variables displayed below should be inserted in an TXT file to be change when need without the need to restart the system.) 
	=========================================================================================*/
		private final String protocol = "tcp";
		private final String address = "127.0.0.1";
		private final String port = "61616";
		private ConnectionFactory connectionFactory;
		private Connection connection;
		private Session session;
		private Topic topic;
		private Error error;
		
	/* Constructor:
	=========================================================================================*/
		public Link() {
			this.error = new Error();
		}
	
	/* Methods:
	=========================================================================================*/
		/* Main Method to Run Connections:
		=====================================================================================*/
			public void connect() {
				this.startConnection();
				this.startSession();
				this.startTopic();
			}
		
		/* Connection Factory:
		=====================================================================================*/
			public void startConnection() {
				// Create a connection factory (Check docs for more info):
					this.connectionFactory = new ActiveMQConnectionFactory(protocol + "://" + address + ":" + port);
				
				// Create a connection and starting it (Check docs for more info):
					try {
						this.connection = this.connectionFactory.createConnection();
						connection.start();
						
					} catch (JMSException e) {
						this.error.showError(e);
						e.printStackTrace();
					}
					
			}
			
		/* Starting Session:
		=====================================================================================*/
			public void startSession() {
				try {
					this.session = this.connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
					
				} catch (JMSException e) {
					this.error.showError(e);
					e.printStackTrace();
				}
			}
		/* Starting Topic:
		=====================================================================================*/
			public void startTopic() {
				try {
					this.topic = this.session.createTopic("mainRoom");
					
				} catch (JMSException e) {
					this.error.showError(e);
					e.printStackTrace();
				}
			}
		
		/* Starting Queue for Specific Destination:
		=====================================================================================*/
			public Queue specificConnection() {
				try {
					Queue specificDestination = this.session.createQueue("specificDest");
					return specificDestination;
					
				} catch (JMSException e) {
					this.error.showError(e);
					e.printStackTrace();
					return null;
				}
			}
			
		/* Get Session:
		=====================================================================================*/
			public Session getSession() {
				return this.session;
			}
			
		/* Get Topic Destination:
		=====================================================================================*/
			public Topic getTopic() {
				return this.topic;
			}
		
		/* Probably The Methods Below Will Not Be Necessary in Here:
		=====================================================================================*/
			public void setClient() {
				
			}
			
			public void getClients() {
				
			}
			
			public void getClient(String username) {
				
			}
}
