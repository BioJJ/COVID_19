package views;

import Model.bean.Pessoas;
import Model.dao.PessoasDao;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    PessoasDao pdao = new PessoasDao();

    public TelaLogin() {
        initComponents();

        this.setDefaultCloseOperation(0); //Não deixar fechar a tela
    }

    @SuppressWarnings("unchecked")

//btentrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Entrar.png")));

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btentrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        txtlogin = new javax.swing.JFormattedTextField();
        txtsenha = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATA NASCIMENTO");

        btentrar.setBackground(new java.awt.Color(0, 0, 0));
        btentrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btentrar.setForeground(new java.awt.Color(255, 255, 255));
        btentrar.setText("ENTRAR");
        btentrar.setMaximumSize(new java.awt.Dimension(115, 37));
        btentrar.setMinimumSize(new java.awt.Dimension(115, 37));
        btentrar.setPreferredSize(new java.awt.Dimension(115, 37));
        btentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btentrarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Acompanhe sua Consulta");

        sair.setBackground(new java.awt.Color(0, 0, 0));
        sair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        try {
            txtlogin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtsenha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(btentrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtlogin)
                            .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sair)
                    .addComponent(btentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        btentrar.getAccessibleContext().setAccessibleParent(btentrar);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(250, 150, 320, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loginnn.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-1, 0, 890, 470);

        setSize(new java.awt.Dimension(890, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkLogin(String login, String senha) {

        return login.equals("000.000.000-00") && senha.equals("00/00/0000");
    }

    public Pessoas checkLogin2(String login, String senha) {

      //  Pessoas teste = (Pessoas) pdao.Verificar_Login(login, senha);
        
        for(Pessoas tt: pdao.Verificar_Login(login, senha) ){
            return tt;
        }
        return null;
    }


    private void btentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btentrarActionPerformed

        if (this.checkLogin(txtlogin.getText(), new String(txtsenha.getText()))) {
            JOptionPane.showMessageDialog(null, "Seja Bem vindo ao Administrador");
            new TelaADM().setVisible(true);
            dispose();

        } else if ((checkLogin2(txtlogin.getText(), txtsenha.getText())) == null) {
            JOptionPane.showMessageDialog(null, "Dados inválidos");
        } else {
            
            Pessoas pesq = checkLogin2(txtlogin.getText(), txtsenha.getText());
            
            JOptionPane.showMessageDialog(null, "Seja Bem vindo SR(a) "+pesq.getNome());
            new TelaLogada(pesq).setVisible(true);
            dispose();

        }


    }//GEN-LAST:event_btentrarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        new inicial().setVisible(true);
        dispose();

    }//GEN-LAST:event_sairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btentrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sair;
    private javax.swing.JFormattedTextField txtlogin;
    private javax.swing.JFormattedTextField txtsenha;
    // End of variables declaration//GEN-END:variables

    private ImageIcon setIconImage(String imagensEntrarpng) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
