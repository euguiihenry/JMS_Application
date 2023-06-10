package app.util;

import javax.jms.*;
import org.apache.activemq.*;
import app.view.Error;

public class Link extends Error{
	/* Global Variables:
	=========================================================================================*/
		private final String protocol = "tcp";
		private final String address = "127.0.0.1";
		private final String port = "61616";
		private ConnectionFactory connectionFactory;
		private Connection connection;
		private Session session;
		private Error error;
		
	/* Constructor:
	=========================================================================================*/
		public Link() {
			this.error = new Error();
		}
	
	/* Methods:
	=========================================================================================*/
		public void connect() {
			this.startConnection();
			this.startSession();
		}
		
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
		
		public void startSession() {
			try {
				this.session = this.connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
				
			} catch (JMSException e) {
				this.error.showError(e);
				e.printStackTrace();
			}
		}
		
		public void specificConnection() {
			
		}
		
		public void setClient() {
			
		}
		
		public void getClients() {
			
		}
		
		public void getClient(String username) {
			
		}
}
