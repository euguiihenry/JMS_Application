package app.view;

import javax.swing.*;

import app.util.Producer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemporaryInterface extends JFrame {
    private JTextArea textArea;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton sendButton;
    private JLabel producer;
    private JLabel consumer;
    private JLabel message;
    private static final long serialVersionUID = 1L;
    
    private Producer producerClass;

    public TemporaryInterface(Producer producer) {
        initializeComponents();
        createLayout();
        setListeners();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Temporary Interface");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        this.producerClass = producer;
    }

    private void initializeComponents() {
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);
        sendButton = new JButton("Send");

        producer = new JLabel("Producer");
        consumer = new JLabel("Consumer");
        message = new JLabel("Message Text");
    }

    private void createLayout() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        inputPanel.add(producer);
        inputPanel.add(textField1);
        inputPanel.add(consumer);
        inputPanel.add(textField2);
        inputPanel.add(message);
        inputPanel.add(textField3);

        JPanel sendPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        sendPanel.add(sendButton);

        panel.add(inputPanel, BorderLayout.PAGE_START);
        panel.add(sendPanel, BorderLayout.LINE_END);

        add(panel);
    }

    private void setListeners() {
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String producer = textField1.getText();
                String consumer = textField2.getText();
                String message = textField3.getText();
                
                if(consumer.isEmpty()) {
                	//Should send a global message.
                	producerClass.createMessage(message, producer);
                } else {
                	// It is necessary to implement the method to send a message to queue list.
                	producerClass.sendPrivately(message, producer, consumer);
                	//Then it should clean the field.
                	textField2.setText("");
                }
                
                textField3.setText("");
            }
        });
    }
    
    public void showMessage(String message) {
    	String printText = message + "\n";
    	textArea.append(printText);
    }
}
