package app.test;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsConsumer {
    public static void main(String[] args) {
        try {
            // Create a connection factory
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");

            // Create a connection
            Connection connection = connectionFactory.createConnection();
            connection.start();

            // Create a session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // Create a destination (queue or topic)
            Destination destination = session.createQueue("myQueue");

            // Create a message consumer
            MessageConsumer consumer = session.createConsumer(destination);

            // Start listening for messages
            consumer.setMessageListener(new MessageListener() {
                public void onMessage(Message message) {
                    try {
                        // Handle the received message
                        if (message instanceof TextMessage) {
                            TextMessage textMessage = (TextMessage) message;
                            System.out.println("Received message: " + textMessage.getText());
                        }
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            });

            // Wait for messages
            Thread.sleep(5000);

            // Clean up resources
            consumer.close();
            session.close();
            connection.close();
        } catch (JMSException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
