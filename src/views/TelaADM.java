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

public class TelaADM extends javax.swing.JFrame {

    FundoPanel fundo = new FundoPanel();

    public TelaADM() {
        this.setContentPane(fundo);
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //Iniciar em tela cheia
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Bt_voltar = new javax.swing.JButton();
        Bt_questoes = new javax.swing.JButton();
        Bt_grau = new javax.swing.JButton();
        Bt_sintomas = new javax.swing.JButton();
        Bt_pessoas = new javax.swing.JButton();
        Bt_sair = new javax.swing.JButton();
        Bt_cidade = new javax.swing.JButton();
        bt_estado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento");
        setMinimumSize(new java.awt.Dimension(1280, 722));
        setSize(new java.awt.Dimension(1280, 722));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("Escolha a opção desejada!");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 270, 480, 60);

        Bt_voltar.setBackground(new java.awt.Color(10, 140, 84));
        Bt_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_back_ios-24px.png"))); // NOI18N
        Bt_voltar.setBorderPainted(false);
        Bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_voltar);
        Bt_voltar.setBounds(30, 20, 50, 30);

        Bt_questoes.setBackground(new java.awt.Color(0, 135, 255));
        Bt_questoes.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Bt_questoes.setForeground(new java.awt.Color(255, 255, 255));
        Bt_questoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Shopping.png"))); // NOI18N
        Bt_questoes.setText("Questionario");
        Bt_questoes.setBorder(null);
        Bt_questoes.setPreferredSize(new java.awt.Dimension(250, 121));
        Bt_questoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_questoesActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_questoes);
        Bt_questoes.setBounds(540, 510, 210, 125);

        Bt_grau.setBackground(new java.awt.Color(0, 135, 255));
        Bt_grau.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Bt_grau.setForeground(new java.awt.Color(255, 255, 255));
        Bt_grau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Animal.png"))); // NOI18N
        Bt_grau.setText("Grau");
        Bt_grau.setBorder(null);
        Bt_grau.setPreferredSize(new java.awt.Dimension(250, 121));
        Bt_grau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_grauActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_grau);
        Bt_grau.setBounds(300, 510, 210, 125);

        Bt_sintomas.setBackground(new java.awt.Color(0, 135, 255));
        Bt_sintomas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Bt_sintomas.setForeground(new java.awt.Color(255, 255, 255));
        Bt_sintomas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Serviço.png"))); // NOI18N
        Bt_sintomas.setText("Sintomas");
        Bt_sintomas.setBorder(null);
        Bt_sintomas.setPreferredSize(new java.awt.Dimension(250, 121));
        Bt_sintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_sintomasActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_sintomas);
        Bt_sintomas.setBounds(30, 510, 220, 125);

        Bt_pessoas.setBackground(new java.awt.Color(0, 135, 255));
        Bt_pessoas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Bt_pessoas.setForeground(new java.awt.Color(255, 255, 255));
        Bt_pessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Funcionario.png"))); // NOI18N
        Bt_pessoas.setText("Pessoas");
        Bt_pessoas.setBorder(null);
        Bt_pessoas.setPreferredSize(new java.awt.Dimension(250, 121));
        Bt_pessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_pessoasActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_pessoas);
        Bt_pessoas.setBounds(30, 350, 220, 125);

        Bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Log-Out-icon.png"))); // NOI18N
        Bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_sairActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_sair);
        Bt_sair.setBounds(1220, 10, 40, 50);

        Bt_cidade.setBackground(new java.awt.Color(0, 135, 255));
        Bt_cidade.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Bt_cidade.setForeground(new java.awt.Color(255, 255, 255));
        Bt_cidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Shopping.png"))); // NOI18N
        Bt_cidade.setText("Cidade");
        Bt_cidade.setBorder(null);
        Bt_cidade.setPreferredSize(new java.awt.Dimension(250, 121));
        Bt_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_cidadeActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_cidade);
        Bt_cidade.setBounds(300, 350, 210, 125);

        bt_estado.setBackground(new java.awt.Color(0, 135, 255));
        bt_estado.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        bt_estado.setForeground(new java.awt.Color(255, 255, 255));
        bt_estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icone Shopping.png"))); // NOI18N
        bt_estado.setText("Estado");
        bt_estado.setBorder(null);
        bt_estado.setPreferredSize(new java.awt.Dimension(250, 121));
        bt_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_estadoActionPerformed(evt);
            }
        });
        getContentPane().add(bt_estado);
        bt_estado.setBounds(540, 350, 210, 125);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_pessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_pessoasActionPerformed
       new PessoasCadastrada().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bt_pessoasActionPerformed

    private void Bt_questoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_questoesActionPerformed
         new Crud_Questoes().setVisible(true);
        dispose();
    }//GEN-LAST:event_Bt_questoesActionPerformed

    private void Bt_sintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_sintomasActionPerformed
        new Crud_Sintomas().setVisible(true);
        dispose();
    }//GEN-LAST:event_Bt_sintomasActionPerformed

    private void Bt_grauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_grauActionPerformed
        new Crud_Grau().setVisible(true);
        dispose();

    }//GEN-LAST:event_Bt_grauActionPerformed

    private void Bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_voltarActionPerformed
        new TelaADM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bt_voltarActionPerformed

    private void Bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_sairActionPerformed
        JOptionPane.showMessageDialog(null, "Até mais!");
        new TelaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bt_sairActionPerformed

    private void Bt_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_cidadeActionPerformed
        new Crud_Cidade().setVisible(true);

        dispose();
    }//GEN-LAST:event_Bt_cidadeActionPerformed

    private void bt_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_estadoActionPerformed
        new Crud_Estado().setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_estadoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_cidade;
    private javax.swing.JButton Bt_grau;
    private javax.swing.JButton Bt_pessoas;
    private javax.swing.JButton Bt_questoes;
    private javax.swing.JButton Bt_sair;
    private javax.swing.JButton Bt_sintomas;
    private javax.swing.JButton Bt_voltar;
    private javax.swing.JButton bt_estado;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
class FundoPanel extends JPanel {

        private Image imagem;

        @Override
        public void paint(Graphics g) {

            imagem = new ImageIcon(getClass().getResource("/imagens/telaADM.jpg")).getImage();
            g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    }
}
