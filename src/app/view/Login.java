package app.view;

public class Login extends javax.swing.JFrame{

    public Login() {
        initComponents();
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
        setPreferredSize(new java.awt.Dimension(350, 320));
        setResizable(false);

        Painel.setBackground(new java.awt.Color(243, 231, 223));
        Painel.setMaximumSize(new java.awt.Dimension(350, 320));
        Painel.setMinimumSize(new java.awt.Dimension(350, 320));
        Painel.setPreferredSize(new java.awt.Dimension(350, 320));

        chatIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("chat-icon.png"))); // NOI18N
        chatIcon.setAlignmentX(50.0F);
        chatIcon.setAlignmentY(0.0F);

        Title.setFont(new java.awt.Font("Candara", 0, 30)); // NOI18N
        Title.setForeground(new java.awt.Color(27, 27, 27));
        Title.setText("CHAT JMS");

        Subtitle.setText("Bem-vindo 🙂");

        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        username.setMargin(new java.awt.Insets(0, 0, 0, 0));
        username.setMaximumSize(new java.awt.Dimension(250, 30));
        username.setMinimumSize(new java.awt.Dimension(250, 30));
        username.setName(""); // NOI18N
        username.setSelectionColor(new java.awt.Color(204, 204, 204));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        openChat.setBackground(new java.awt.Color(90, 191, 97));
        openChat.setForeground(new java.awt.Color(255, 255, 255));
        openChat.setText("ENTRAR");
        openChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openChatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chatIcon)
                    .addComponent(Title)
                    .addComponent(Subtitle)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openChat, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(chatIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subtitle)
                .addGap(28, 28, 28)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openChat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
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
    }// </editor-fold>                        

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void openChatActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	this.setVisible(false);
    	new Room().setVisible(true);
    }                                        
    
    /*Main de teste*/
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Painel;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel chatIcon;
    private javax.swing.JButton openChat;
    private javax.swing.JTextField username;
    // End of variables declaration

}
