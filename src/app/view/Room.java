package app.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import app.util.Common;

public class Room extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1198313697755943822L;
	/**
     * Creates new form Room
     */
    public Room() {
        initComponents();        
    }

 // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

     Panel = new javax.swing.JPanel();
     Title = new javax.swing.JLabel();
     nickname = new javax.swing.JLabel(); // Add the nickname label
     sendMessageField = new javax.swing.JPanel();
     messageField = new javax.swing.JTextField();
     sendButton = new javax.swing.JButton();
     roomMessagesPanel = new javax.swing.JScrollPane();
     roomMessages = new javax.swing.JTextArea();

     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     setBounds(new java.awt.Rectangle(750, 250, 380, 380));
     setResizable(false);

     Panel.setBackground(new java.awt.Color(243, 231, 223));
     Panel.setMaximumSize(new java.awt.Dimension(450, 570));
     Panel.setMinimumSize(new java.awt.Dimension(450, 570));
     Panel.setPreferredSize(new java.awt.Dimension(450, 570));    

     Title.setBackground(new java.awt.Color(90, 191, 97));
     Title.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
     Title.setForeground(new java.awt.Color(255, 255, 255));
     Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
     Title.setText("CHAT");
     Title.setOpaque(true);
     
     nickname.setBackground(new java.awt.Color(90, 191, 97));
     nickname.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
     nickname.setForeground(new java.awt.Color(255, 255, 255));
     nickname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
     
     nickname.setOpaque(true);

     sendMessageField.setBackground(new java.awt.Color(185, 217, 184));

     messageField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             messageFieldActionPerformed(evt);
         }
     });

     sendButton.setBackground(new java.awt.Color(185, 217, 184));
     sendButton.setBorder(null);
     
     ImageIcon img = new ImageIcon(getClass().getResource("toSend-icon.png"));
     Image original = img.getImage();
     Image scaledImage = original.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
     ImageIcon scaledIcon = new ImageIcon(scaledImage);
     
     sendButton.setIcon(scaledIcon); // NOI18N
     
     sendButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             sendButtonActionPerformed(evt);
         }
     });

     javax.swing.GroupLayout sendMessageFieldLayout = new javax.swing.GroupLayout(sendMessageField);
     sendMessageField.setLayout(sendMessageFieldLayout);
     sendMessageFieldLayout.setHorizontalGroup(
         sendMessageFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(sendMessageFieldLayout.createSequentialGroup()
             .addGap(18, 18, 18)
             .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
             .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addContainerGap())
     );
     sendMessageFieldLayout.setVerticalGroup(
         sendMessageFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(sendMessageFieldLayout.createSequentialGroup()
             .addGap(26, 26, 26)
             .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addContainerGap(20, Short.MAX_VALUE))
         .addGroup(sendMessageFieldLayout.createSequentialGroup()
             .addGap(15, 15, 15)
             .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             .addContainerGap())
     );

     messageField.getAccessibleContext().setAccessibleDescription("");

     roomMessagesPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

     roomMessages.setEditable(false);
     roomMessages.setBackground(new java.awt.Color(243, 231, 223));
     roomMessages.setColumns(20);
     roomMessages.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
     roomMessages.setRows(5);
     roomMessages.setToolTipText("");
     roomMessages.setLineWrap(true);
     roomMessages.setWrapStyleWord(true);
     roomMessages.setBorder(BorderFactory.createCompoundBorder(
             new LineBorder(new Color(243, 231, 223), 0, true), new EmptyBorder(0, 5, 0, 5)
     )); ;
     roomMessagesPanel.setViewportView(roomMessages);

     javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
     Panel.setLayout(PanelLayout);
     PanelLayout.setHorizontalGroup(
         PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(nickname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) // Add the nickname label
         .addComponent(sendMessageField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(PanelLayout.createSequentialGroup()
             .addGap(20, 20, 20)
             .addComponent(roomMessagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     );
     PanelLayout.setVerticalGroup(
         PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(PanelLayout.createSequentialGroup()
             .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addComponent(nickname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE) // Add the nickname label
             .addGap(18, 18, 18)
             .addComponent(roomMessagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
             .addGap(18, 18, 18)
             .addComponent(sendMessageField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
     );

     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
     getContentPane().setLayout(layout);
     layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     );
     layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
     );

     getAccessibleContext().setAccessibleName("CHAT JMS");

     pack();
     setLocationRelativeTo(null);
 }// </editor-fold> 
                       
    
    private void messageFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    	getRootPane().setDefaultButton(sendButton);
    }                                            

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	getRootPane().setDefaultButton(sendButton);
    	this.common.sendMessage(this.messageField.getText());
    	messageField.setText("");
    }        
    
    public void showMessage(String message) {
    	String printText = message + "\n";
    	roomMessages.append(printText);
    }
    
    public void getCommon(Common common) {
    	this.common = common;
    }
    
    public void setUsername(String nickname) {
    	this.nickname.setText("@" + nickname);
    }
    
    public void showInitialMessage(String nickname) {
    	String message1 = "\tBem-vindo ao JMS Application @" + nickname + "\n";
    	String message2 = "Observação: Para enviar mensagens privadas a um remetente basta inserir @ e o username do remetente seguido de um espaço.\n\n";
    	
    	roomMessages.append(message1);
    	roomMessages.append(message2);
    }


 // Variables declaration - do not modify                     
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField messageField;
    private javax.swing.JTextArea roomMessages;
    private javax.swing.JScrollPane roomMessagesPanel;
    private javax.swing.JButton sendButton;
    private javax.swing.JPanel sendMessageField;
    private javax.swing.JLabel nickname;
    private Common common;
    // End of variables declaration                   

    
    
    
}