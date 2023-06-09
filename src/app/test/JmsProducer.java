package app.test;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsProducer {
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

            // Create a message producer
            MessageProducer producer = session.createProducer(destination);

            // Create a text message
            TextMessage message = session.createTextMessage("Hello, JMS!");

            // Send the message
            producer.send(message);

            // Clean up resources
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
