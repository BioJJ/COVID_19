package views;

import Model.bean.Pergunta;
import Model.dao.PerguntaDao;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Crud_Questoes extends javax.swing.JFrame {

    FundoPanel fundo = new FundoPanel();

    Pergunta pp = new Pergunta();
    PerguntaDao ppdao = new PerguntaDao();

    public Crud_Questoes() {

        this.setContentPane(fundo);
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabela_pergunta.getModel();
        tabela_pergunta.setRowSorter(new TableRowSorter(modelo));

        readJTable();
        setExtendedState(MAXIMIZED_BOTH); //Iniciar em tela cheia
    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_pergunta.getModel();
        modelo.setNumRows(0);

        for (Pergunta per : ppdao.read()) {
            modelo.addRow(new Object[]{
                per.getId(),
                per.getPergunta(),});
        }
    }

    public void readJTableForNome(String nome) {
        DefaultTableModel modelo = (DefaultTableModel) tabela_pergunta.getModel();
        modelo.setNumRows(0);

        for (Pergunta per : ppdao.read()) {
            modelo.addRow(new Object[]{
                per.getId(),
                per.getPergunta(),});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pergunta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_pergunta = new javax.swing.JTable();
        bt_voltar = new javax.swing.JButton();
        txtpesquisar = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        id = new javax.swing.JFormattedTextField();
        Bt_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 722));
        setSize(new java.awt.Dimension(1280, 722));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Preencha os campos das Questões");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 70, 570, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Pergunta:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 190, 120, 40);

        pergunta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pergunta.setToolTipText("");
        pergunta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pergunta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                perguntaKeyReleased(evt);
            }
        });
        getContentPane().add(pergunta);
        pergunta.setBounds(170, 190, 420, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 120, 40);

        tabela_pergunta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Pergunta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_pergunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_perguntaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_pergunta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 400, 540, 230);

        bt_voltar.setBackground(new java.awt.Color(10, 140, 84));
        bt_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_back_ios-24px.png"))); // NOI18N
        bt_voltar.setBorderPainted(false);
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_voltar);
        bt_voltar.setBounds(40, 20, 50, 40);

        txtpesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(txtpesquisar);
        txtpesquisar.setBounds(180, 340, 330, 40);

        btCadastrar.setBackground(new java.awt.Color(0, 0, 153));
        btCadastrar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save-icon.png"))); // NOI18N
        btCadastrar.setBorder(null);
        btCadastrar.setPreferredSize(new java.awt.Dimension(250, 121));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrar);
        btCadastrar.setBounds(540, 250, 50, 50);

        btExcluir.setBackground(new java.awt.Color(0, 0, 153));
        btExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-file-icon.png"))); // NOI18N
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(180, 250, 50, 50);

        btAlterar.setBackground(new java.awt.Color(0, 0, 153));
        btAlterar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4directions-SZ-icon.png"))); // NOI18N
        btAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAlterarMouseClicked(evt);
            }
        });
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterar);
        btAlterar.setBounds(240, 250, 50, 50);

        btPesquisar.setBackground(new java.awt.Color(0, 0, 153));
        btPesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/zoom-seach-icon.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(540, 340, 50, 40);

        id.setEditable(false);
        try {
            id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(id);
        id.setBounds(170, 130, 150, 40);

        Bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Log-Out-icon.png"))); // NOI18N
        Bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_sairActionPerformed(evt);
            }
        });
        getContentPane().add(Bt_sair);
        Bt_sair.setBounds(1220, 10, 40, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed

        new TelaADM().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_bt_voltarActionPerformed

    private void perguntaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perguntaKeyReleased
        pergunta.setText(pergunta.getText().toUpperCase().replaceAll("[^A-Z | ^a-z | ^ç |^ã | ^ |^? ]", ""));
    }//GEN-LAST:event_perguntaKeyReleased

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        salvar();
    }//GEN-LAST:event_btCadastrarActionPerformed
    public void salvar() {
        if (pergunta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO, preencha todos os campos");
        } else {

            pp.setPergunta(pergunta.getText());
            ppdao.create(pp);
            readJTable();
            id.setText("");
            pergunta.setText("");
            pergunta.requestFocus();
        }
    }
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed
    public void excluir() {
        if (tabela_pergunta.getSelectedRow() != -1) {

            pp.setId((int) tabela_pergunta.getValueAt(tabela_pergunta.getSelectedRow(), 0));
            ppdao.delete(pp);
            readJTable();
            id.setText("");
            pergunta.setText("");
            pergunta.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um estado para excluir!");
        }
    }
    private void btAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseClicked
        if (tabela_pergunta.getSelectedRow() != -1) {
            pergunta.setText(tabela_pergunta.getValueAt(tabela_pergunta.getSelectedRow(), 1).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um estado para alterar!");
        }
    }//GEN-LAST:event_btAlterarMouseClicked

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btAlterarActionPerformed
    public void alterar() {
        if (pergunta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO, preencha os campos do nome e cargo!");
            id.setEnabled(false);
        } else if (tabela_pergunta.getSelectedRow() != -1) {
           

            pp.setPergunta(pergunta.getText());
            pp.setId((int) tabela_pergunta.getValueAt(tabela_pergunta.getSelectedRow(), 0));

            ppdao.update(pp);
            readJTable();

            id.setText("");
            pergunta.setText("");
            pergunta.requestFocus();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma matrícula para alterar nome e cargo!");
        }
    }
    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        readJTableForNome(txtpesquisar.getText());
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void txtpesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            readJTableForNome(txtpesquisar.getText());
        }
    }//GEN-LAST:event_txtpesquisarKeyPressed

    private void Bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_sairActionPerformed
        JOptionPane.showMessageDialog(null, "Até mais!");
        new inicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bt_sairActionPerformed

    private void txtpesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisarKeyReleased
        if (txtpesquisar.getText().equals("")) {
            readJTable();
        }
    }//GEN-LAST:event_txtpesquisarKeyReleased

    private void tabela_perguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_perguntaMouseClicked
        if (tabela_pergunta.getSelectedRow() != -1) {
            id.setText(tabela_pergunta.getValueAt(tabela_pergunta.getSelectedRow(), 0).toString());
            pergunta.setText(tabela_pergunta.getValueAt(tabela_pergunta.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tabela_perguntaMouseClicked

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
            java.util.logging.Logger.getLogger(Crud_Questoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Questoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Questoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Questoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Questoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_sair;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JFormattedTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pergunta;
    private javax.swing.JTable tabela_pergunta;
    private javax.swing.JTextField txtpesquisar;
    // End of variables declaration//GEN-END:variables
class FundoPanel extends JPanel {

        private Image imagem;

        @Override
        public void paint(Graphics g) {

            imagem = new ImageIcon(getClass().getResource("/imagens/FUNDO.jpg")).getImage();
            g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }

    } // Para maximizar a imagem junto com a tela
}
