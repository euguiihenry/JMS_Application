package app.view;

public class Room extends javax.swing.JFrame {

    /**
     * Creates new form Room
     */
    public Room() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        sendMessageField = new javax.swing.JPanel();
        messageField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        roomMessagesPanel = new javax.swing.JScrollPane();
        roomMessages = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(850, 350, 380, 280));
        setResizable(false);

        Panel.setBackground(new java.awt.Color(243, 231, 223));
        Panel.setMaximumSize(new java.awt.Dimension(450, 550));
        Panel.setMinimumSize(new java.awt.Dimension(450, 550));
        Panel.setPreferredSize(new java.awt.Dimension(450, 550));

        Title.setBackground(new java.awt.Color(90, 191, 97));
        Title.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("CHAT");
        Title.setOpaque(true);

        sendMessageField.setBackground(new java.awt.Color(185, 217, 184));

        messageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageFieldActionPerformed(evt);
            }
        });

        sendButton.setBackground(new java.awt.Color(185, 217, 184));
        sendButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("toSend-icon.png"))); // NOI18N
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
                .addGap(12, 12, 12)
                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        sendMessageFieldLayout.setVerticalGroup(
            sendMessageFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendMessageFieldLayout.createSequentialGroup()
                .addGroup(sendMessageFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sendMessageFieldLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sendMessageFieldLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sendButton)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        roomMessages.setEditable(false);
        roomMessages.setBackground(new java.awt.Color(243, 231, 223));
        roomMessages.setBorder(null);
        roomMessagesPanel.setViewportView(roomMessages);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sendMessageField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roomMessagesPanel)
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roomMessagesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendMessageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>                        

    private void messageFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField messageField;
    private javax.swing.JTextPane roomMessages;
    private javax.swing.JScrollPane roomMessagesPanel;
    private javax.swing.JButton sendButton;
    private javax.swing.JPanel sendMessageField;
    private String[] msg = new String[14];
    // End of variables declaration                   

}