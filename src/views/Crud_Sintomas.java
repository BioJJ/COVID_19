package views;

import Model.bean.Grau_Risco;
import Model.bean.Sintomas;
import Model.dao.Grau_RiscoDao;
import Model.dao.SintomasDao;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Crud_Sintomas extends javax.swing.JFrame {

    FundoPanel fundo = new FundoPanel();

    Grau_Risco grau = new Grau_Risco();
    Grau_RiscoDao grauDao = new Grau_RiscoDao();

    Sintomas s = new Sintomas();
    SintomasDao sDao = new SintomasDao();

    public Crud_Sintomas() {

        this.setContentPane(fundo);
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabela_sintomas.getModel();
        tabela_sintomas.setRowSorter(new TableRowSorter(modelo));

        readJTable();


        setExtendedState(MAXIMIZED_BOTH); //Iniciar em tela cheia
    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tabela_sintomas.getModel();
        modelo.setNumRows(0);

        for (Sintomas ss : sDao.read()) {
            modelo.addRow(new Object[]{
                ss.getId(),
                ss.getDescricao(),
              //  ss.getTipo().getDescricao(),
            });
        }
    }

    public void readJTableForNome(String nome) {
        DefaultTableModel modelo = (DefaultTableModel) tabela_sintomas.getModel();
        modelo.setNumRows(0);

        for (Sintomas ss : sDao.read()) {
            modelo.addRow(new Object[]{
                ss.getId(),
                ss.getDescricao(),
              //  ss.getTipo().getDescricao(),
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_sintomas = new javax.swing.JTable();
        bt_voltar = new javax.swing.JButton();
        txtpesquisar = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        id = new javax.swing.JFormattedTextField();
        Bt_sair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionários");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 722));
        setSize(new java.awt.Dimension(1280, 722));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Preencha os campos do Sintoma");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 70, 570, 50);

        descricao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        descricao.setToolTipText("");
        descricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        descricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descricaoKeyReleased(evt);
            }
        });
        getContentPane().add(descricao);
        descricao.setBounds(170, 190, 420, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 120, 40);

        tabela_sintomas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_sintomas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_sintomasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_sintomas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 470, 540, 230);

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
        txtpesquisar.setBounds(180, 410, 330, 40);

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
        btCadastrar.setBounds(540, 320, 50, 50);

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
        btExcluir.setBounds(180, 320, 50, 50);

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
        btAlterar.setBounds(240, 320, 50, 50);

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
        btPesquisar.setBounds(540, 410, 50, 40);

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

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("Descrição");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 190, 120, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed

        new TelaADM().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_bt_voltarActionPerformed

    private void descricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descricaoKeyReleased
        descricao.setText(descricao.getText().toUpperCase().replaceAll("[^A-Z | ^a-z | ^ç |^ã | ^ ]", ""));
    }//GEN-LAST:event_descricaoKeyReleased

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        salvar();
    }//GEN-LAST:event_btCadastrarActionPerformed
    public void salvar() {
        if (descricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO, preencha todos os campos");
        } else {

            s.setDescricao(descricao.getText());

//            Grau_Risco grauu = (Grau_Risco) cb_tipo.getSelectedItem();
//            s.setTipo(grauu);

            sDao.create(s);
            readJTable();
            id.setText("");
            descricao.setText("");
            //cb_tipo.setSelectedIndex(0);
            descricao.requestFocus();
        }
    }
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed
    public void excluir() {
        if (tabela_sintomas.getSelectedRow() != -1) {

            s.setId((int) tabela_sintomas.getValueAt(tabela_sintomas.getSelectedRow(), 0));
            sDao.delete(s);
            readJTable();
            id.setText("");
            descricao.setText("");
//            cb_tipo.setSelectedIndex(0);
            descricao.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um estado para excluir!");
        }
    }
    private void btAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarMouseClicked
        if (tabela_sintomas.getSelectedRow() != -1) {
            descricao.setText(tabela_sintomas.getValueAt(tabela_sintomas.getSelectedRow(), 1).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um estado para alterar!");
        }
    }//GEN-LAST:event_btAlterarMouseClicked

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btAlterarActionPerformed
    public void alterar() {
        if (descricao.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "ATENÇÃO, preencha os campos do nome e cargo!");
            id.setEnabled(false);
        } else if (tabela_sintomas.getSelectedRow() != -1) {

            s.setDescricao(descricao.getText());
            s.setId((int) tabela_sintomas.getValueAt(tabela_sintomas.getSelectedRow(), 0));
           // Grau_Risco grauuu = (Grau_Risco) cb_tipo.getSelectedItem();
          //  s.setTipo(grauuu);

            sDao.update(s);
            readJTable();

            id.setText("");
            descricao.setText("");
           // cb_tipo.setSelectedIndex(0);
            descricao.requestFocus();

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

    private void tabela_sintomasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_sintomasMouseClicked
        if (tabela_sintomas.getSelectedRow() != -1) {
            id.setText(tabela_sintomas.getValueAt(tabela_sintomas.getSelectedRow(), 0).toString());
            descricao.setText(tabela_sintomas.getValueAt(tabela_sintomas.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tabela_sintomasMouseClicked

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
            java.util.logging.Logger.getLogger(Crud_Sintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Sintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Sintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Sintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Crud_Sintomas().setVisible(true);
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
    private javax.swing.JTextField descricao;
    private javax.swing.JFormattedTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_sintomas;
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
