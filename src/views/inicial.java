/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class inicial extends javax.swing.JFrame {

    FundoPanel fundo = new FundoPanel();

    public inicial() {
        this.setContentPane(fundo);
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //Iniciar em tela cheia
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Realizar = new javax.swing.JButton();
        Acompanhar = new javax.swing.JButton();
        sairrr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento");
        setMinimumSize(new java.awt.Dimension(1280, 722));
        setSize(new java.awt.Dimension(1280, 722));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Escolha a opção desejada!");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(770, 330, 480, 60);

        Realizar.setBackground(new java.awt.Color(0, 135, 255));
        Realizar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Realizar.setForeground(new java.awt.Color(255, 255, 255));
        Realizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Serviço.png"))); // NOI18N
        Realizar.setText("Realizar sua consulta");
        Realizar.setBorder(null);
        Realizar.setPreferredSize(new java.awt.Dimension(250, 121));
        Realizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarActionPerformed(evt);
            }
        });
        getContentPane().add(Realizar);
        Realizar.setBounds(810, 520, 440, 80);

        Acompanhar.setBackground(new java.awt.Color(0, 135, 255));
        Acompanhar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Acompanhar.setForeground(new java.awt.Color(255, 255, 255));
        Acompanhar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Funcionario.png"))); // NOI18N
        Acompanhar.setText("Acompanhar sua consulta");
        Acompanhar.setBorder(null);
        Acompanhar.setPreferredSize(new java.awt.Dimension(250, 121));
        Acompanhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcompanharActionPerformed(evt);
            }
        });
        getContentPane().add(Acompanhar);
        Acompanhar.setBounds(810, 410, 440, 80);

        sairrr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Log-Out-icon.png"))); // NOI18N
        sairrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairrrActionPerformed(evt);
            }
        });
        getContentPane().add(sairrr);
        sairrr.setBounds(1220, 10, 40, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AcompanharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcompanharActionPerformed
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_AcompanharActionPerformed

    private void RealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarActionPerformed
        new TelaPessoas().setVisible(true);
        dispose();
    }//GEN-LAST:event_RealizarActionPerformed

    private void sairrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairrrActionPerformed
       JOptionPane.showMessageDialog(null, "Até mais!");
        System.exit(0);
    }//GEN-LAST:event_sairrrActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acompanhar;
    private javax.swing.JButton Realizar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sairrr;
    // End of variables declaration//GEN-END:variables
class FundoPanel extends JPanel {

        private Image imagem;

        @Override
        public void paint(Graphics g) {

            imagem = new ImageIcon(getClass().getResource("/imagens/inicial_0.jpg")).getImage();
            g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }
}
