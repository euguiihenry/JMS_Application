package app.util;

import app.util.Producer;

public class Common {
	private String consumerUsername;
	private String producerUsername;
	private String consumerMessage;
	private Producer producerClass;
	
	public void setConsumerUsername(String message) {
		String username = message.substring(0, message.indexOf(' '));
		this.consumerUsername = username;
	}
	
	public String getConsumerUsername() {
		return this.consumerUsername;
	}
	
	public void setConsumerMessage(String message) {
		this.consumerMessage = message;
	}
	
	public String getConsumerMessage() {
		return this.consumerMessage;
	}
	
	public void setProducerUsername(String username) {
		this.producerUsername = username;
	}
	
	public String getProducerUsername() {
		return this.producerUsername;
	}
	
	public void sendMessage(String message) {
		// For Global Message:
		producerClass.createMessage(message, this.getProducerUsername());
		
		// For Private Message:
		if (message.charAt(0) == '@') {
			this.setConsumerUsername(message);
			producerClass.sendPrivately(message, this.getProducerUsername(), this.getConsumerUsername());
		}
		
	}
}
