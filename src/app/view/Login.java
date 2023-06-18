package app.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import app.util.Common;

@SuppressWarnings("serial")
public class Login extends javax.swing.JFrame{

    public Login(Common common, Thread consumer) {
        initComponents();
        this.common = common;
        this.consumer = consumer;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        chatIcon = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Subtitle = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        openChat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHAT JMS");
        setBounds(new java.awt.Rectangle(850, 350, 380, 280));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Painel.setBackground(new java.awt.Color(243, 231, 223));
        Painel.setMaximumSize(new java.awt.Dimension(350, 320));
        Painel.setMinimumSize(new java.awt.Dimension(350, 320));
        Painel.setPreferredSize(new java.awt.Dimension(350, 320));
        
        ImageIcon img = new ImageIcon(getClass().getResource("chat-icon.png"));
        Image original = img.getImage();
        int desiredWidth = 100;  // Set the desired width
        int desiredHeight = 100; // Set the desired height
        Image scaledImage = original.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        chatIcon.setIcon(scaledIcon);
        chatIcon.setAlignmentX(44.0F);
        chatIcon.setAlignmentY(0.0F);

        Title.setFont(new java.awt.Font("Candara", 0, 30)); // NOI18N
        Title.setForeground(new java.awt.Color(27, 27, 27));
        Title.setText("CHAT JMS");

        Subtitle.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        Subtitle.setText("Bem-vindo");

        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setBorder(BorderFactory.createCompoundBorder(
    		new LineBorder(new Color(243, 231, 223), 0, true), new EmptyBorder(0, 5, 0, 5)
		));       
        username.setColumns(10);
        username.setMargin(new Insets(0, 5, 0, 5));
        
        //username.setMargin(new java.awt.Insets(0, 0, 0, 0));
        username.setMaximumSize(new java.awt.Dimension(250, 30));
        username.setMinimumSize(new java.awt.Dimension(250, 30));
        username.setName(""); // NOI18N
        username.setSelectionColor(new java.awt.Color(204, 204, 204));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
                interfaceMethods(evt);
            }
        });

        openChat.setBackground(new java.awt.Color(90, 191, 97));
        openChat.setForeground(new java.awt.Color(255, 255, 255));
        openChat.setText("ENTRAR");
        openChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openChatActionPerformed(evt);
                interfaceMethods(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chatIcon)
                    .addComponent(Title)
                    .addComponent(Subtitle)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openChat, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(chatIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subtitle)
                .addGap(30, 30, 30)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openChat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        username.getAccessibleContext().setAccessibleName("adw");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        
        setLocationRelativeTo(null);
    }// </editor-fold> 

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }                                        

    private void openChatActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        
    
    private void interfaceMethods(java.awt.event.ActionEvent evt) {
    	String usernameText = username.getText();
    	if (usernameText.isEmpty()) {
    		String message = "Escolha e insira o seu username para continuar!";
    		this.error.showMessage(message);
    	} else {
    		this.common.setProducerUsername(usernameText);
        	getRootPane().setDefaultButton(openChat);
        	this.setVisible(false);
        	this.common.openRoom(this.common);
        	this.consumer.start();
    	}
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Painel;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel chatIcon;
    private javax.swing.JButton openChat;
    private javax.swing.JTextField username;
    private Common common;
    private Error error = new Error();
    private Thread consumer;
    // End of variables declaration

}
