/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Model.bean.Consulta;
import Model.dao.ConsultaDao;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bio_j
 */
public class PessoasCadastrada extends javax.swing.JFrame {

    Consulta cc = new Consulta();
    ConsultaDao ccdao = new ConsultaDao();

    String covid = null;

    public PessoasCadastrada() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //Iniciar em tela cheia

        Tabela_pendentess();
        Tabela_positivo();
        Tabela_negativo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pendentes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_pendentes = new javax.swing.JTable();
        bt_voltar = new javax.swing.JButton();
        br_verificar = new javax.swing.JButton();
        ComCorona = new javax.swing.JPanel();
        bt_voltar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela_positivo = new javax.swing.JTable();
        SemCorona = new javax.swing.JPanel();
        bt_voltar2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela_negativo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Lista de pessoas");

        tabela_pendentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_pendentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_pendentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_pendentes);

        bt_voltar.setBackground(new java.awt.Color(10, 140, 84));
        bt_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_back_ios-24px.png"))); // NOI18N
        bt_voltar.setBorderPainted(false);
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        br_verificar.setText("Verificar");
        br_verificar.setEnabled(false);
        br_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_verificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pendentesLayout = new javax.swing.GroupLayout(pendentes);
        pendentes.setLayout(pendentesLayout);
        pendentesLayout.setHorizontalGroup(
            pendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendentesLayout.createSequentialGroup()
                .addGroup(pendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pendentesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(pendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pendentesLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(br_verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        pendentesLayout.setVerticalGroup(
            pendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendentesLayout.createSequentialGroup()
                .addGroup(pendentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pendentesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pendentesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(br_verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pessoas Pendentes", pendentes);

        bt_voltar1.setBackground(new java.awt.Color(10, 140, 84));
        bt_voltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_back_ios-24px.png"))); // NOI18N
        bt_voltar1.setBorderPainted(false);
        bt_voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Pessoas Positivo p/ Corona Virus");

        tabela_positivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_positivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_positivoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabela_positivo);

        javax.swing.GroupLayout ComCoronaLayout = new javax.swing.GroupLayout(ComCorona);
        ComCorona.setLayout(ComCoronaLayout);
        ComCoronaLayout.setHorizontalGroup(
            ComCoronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComCoronaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(ComCoronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        ComCoronaLayout.setVerticalGroup(
            ComCoronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComCoronaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ComCoronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ComCoronaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_voltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(429, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Com Corona", ComCorona);

        bt_voltar2.setBackground(new java.awt.Color(10, 140, 84));
        bt_voltar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_back_ios-24px.png"))); // NOI18N
        bt_voltar2.setBorderPainted(false);
        bt_voltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltar2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Pessoas Negativo p/ Corona Virus");

        tabela_negativo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_negativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_negativoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela_negativo);

        javax.swing.GroupLayout SemCoronaLayout = new javax.swing.GroupLayout(SemCorona);
        SemCorona.setLayout(SemCoronaLayout);
        SemCoronaLayout.setHorizontalGroup(
            SemCoronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SemCoronaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(SemCoronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        SemCoronaLayout.setVerticalGroup(
            SemCoronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SemCoronaLayout.createSequentialGroup()
                .addGroup(SemCoronaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SemCoronaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_voltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SemCoronaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(417, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sem Corona", SemCorona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed

        new TelaADM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void br_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_verificarActionPerformed

        new TelaDetalhes(covid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_br_verificarActionPerformed

    private void tabela_pendentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_pendentesMouseClicked
        if (tabela_pendentes.getSelectedRow() != -1) {

            covid = (tabela_pendentes.getValueAt(tabela_pendentes.getSelectedRow(), 1).toString());

            br_verificar.setEnabled(true);
        }
    }//GEN-LAST:event_tabela_pendentesMouseClicked

    private void bt_voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_voltar1ActionPerformed

    private void bt_voltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_voltar2ActionPerformed

    private void tabela_positivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_positivoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_positivoMouseClicked

    private void tabela_negativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_negativoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela_negativoMouseClicked

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
            java.util.logging.Logger.getLogger(PessoasCadastrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoasCadastrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoasCadastrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoasCadastrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoasCadastrada().setVisible(true);
            }
        });
    }

    public void Tabela_pendentess() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_pendentes.getModel();
        modelo.setNumRows(0);

       
         String teste = "PENDENTE";
        for (Consulta pesq : ccdao.read(teste)) {
            modelo.addRow(new Object[]{
                pesq.getId(),
                pesq.getPessoa().getNome(),
                pesq.getPessoa().getCpf(),
                pesq.getStatuss(),
            });
        }
    }

    public void Tabela_positivo() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_positivo.getModel();
        modelo.setNumRows(0);

        String teste="POSITIVO";

        for (Consulta pesq : ccdao.read(teste)) {
            modelo.addRow(new Object[]{
                pesq.getId(),
                pesq.getPessoa().getNome(),
                pesq.getPessoa().getCpf(),
                pesq.getStatuss(),
            });
        }
    }

    public void Tabela_negativo() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_negativo.getModel();
        modelo.setNumRows(0);
        
        String teste = "NEGATIVO";
        for (Consulta pesq : ccdao.read(teste)) {
            modelo.addRow(new Object[]{
                pesq.getId(),
                pesq.getPessoa().getNome(),
                pesq.getPessoa().getCpf(),
                pesq.getStatuss(),
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComCorona;
    private javax.swing.JPanel SemCorona;
    private javax.swing.JButton br_verificar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton bt_voltar1;
    private javax.swing.JButton bt_voltar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pendentes;
    private javax.swing.JTable tabela_negativo;
    private javax.swing.JTable tabela_pendentes;
    private javax.swing.JTable tabela_positivo;
    // End of variables declaration//GEN-END:variables
}
