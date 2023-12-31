/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.view;

import br.com.sistema.dao.FornecedoresDAO;
import br.com.sistema.dao.ProdutosDAO;
import br.com.sistema.model.Fornecedores;
import br.com.sistema.model.Produtos;
import br.com.sistema.model.Utilitarios;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class FrmCadastrarProdutos extends javax.swing.JFrame {
    
    public boolean isRegister = true;
    /**
     * Creates new form FrmCadastrarProdutos
     */
    public FrmCadastrarProdutos() {
       initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nomeTela = new javax.swing.JLabel();
        dadosPessoais = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtFornecedores = new javax.swing.JComboBox();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        nomeTela.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        nomeTela.setForeground(new java.awt.Color(255, 255, 255));
        nomeTela.setText("Cadastro Produtos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(nomeTela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(nomeTela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dadosPessoais.setBackground(new java.awt.Color(240, 245, 245));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Decrição");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Quantidade");

        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Preço");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Fornecedor");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setText("Código");

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.setText("0");

        txtPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecoKeyPressed(evt);
            }
        });

        txtFornecedores.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtFornecedoresAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFornecedoresMouseClicked(evt);
            }
        });
        txtFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornecedoresActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(147, 238, 57));
        botaoSalvar.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSalvarMouseClicked(evt);
            }
        });
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(153, 204, 255));
        botaoLimpar.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoLimparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dadosPessoaisLayout = new javax.swing.GroupLayout(dadosPessoais);
        dadosPessoais.setLayout(dadosPessoaisLayout);
        dadosPessoaisLayout.setHorizontalGroup(
            dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade)
                            .addComponent(txtPreco)))
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtFornecedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(545, 545, 545))
        );
        dadosPessoaisLayout.setVerticalGroup(
            dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dadosPessoais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void preencheCampos(JTable tabelaProdutos)
    {
        txtID.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
        txtDescricao.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
        txtQuantidade.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
        txtPreco.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());
        txtFornecedores.setSelectedItem(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 4));
    }
    private Produtos montaProduto()
    {
        Produtos dadosProdutos = new Produtos();
        
        dadosProdutos.setDescricao(txtDescricao.getText());
        dadosProdutos.setFornecedor((Fornecedores) txtFornecedores.getSelectedItem());
        dadosProdutos.setId(Integer.parseInt(txtID.getText()));
        dadosProdutos.setPreco(Double.parseDouble(txtPreco.getText()));
        dadosProdutos.setQtd_estoque(Integer.parseInt(txtQuantidade.getText()));
        
        return dadosProdutos;
    }
    private boolean verificaCampos()
    {
        boolean campoVazio = false;
        
        if(txtDescricao.getText().isBlank())
        {
            txtDescricao.setBackground(Color.red);
            campoVazio = true;
        }
        else
        {
            txtDescricao.setBackground(Color.LIGHT_GRAY);
        }
        
        if(txtQuantidade.getText().isBlank())
        {
            txtQuantidade.setBackground(Color.red);
            campoVazio = true;
        }
        else
        {
            txtQuantidade.setBackground(Color.LIGHT_GRAY);
        }
        
        if(txtPreco.getText().isBlank())
        {
            txtPreco.setBackground(Color.red);
            campoVazio = true;
        }
        else
        {
            txtPreco.setBackground(Color.LIGHT_GRAY);
        }
        return campoVazio;
    }
           
    private void botaoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMouseClicked

        ProdutosDAO dao = new ProdutosDAO();
        if(verificaCampos())
        {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos em vermelho!");
        }
        else
        {
            if(isRegister)
            {
                dao.cadastrarProdutos(montaProduto());
                Utilitarios.LimpaTela(dadosPessoais);
            }
            else
            {
                dao.editarCadastroProduto(montaProduto());
                this.dispose();
            }
        }
       
    }//GEN-LAST:event_botaoSalvarMouseClicked

    private void botaoLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLimparMouseClicked

        Utilitarios.LimpaTela(dadosPessoais);
    }//GEN-LAST:event_botaoLimparMouseClicked

    private void txtFornecedoresAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtFornecedoresAncestorAdded
        // Carregando combobox fornecedores
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> listadefornecedores = dao.listaFornecedores();
        txtFornecedores.removeAll();

        for (Fornecedores f : listadefornecedores) {
            txtFornecedores.addItem(f);
        }
    }//GEN-LAST:event_txtFornecedoresAncestorAdded

    private void txtFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFornecedoresMouseClicked
        FornecedoresDAO dao = new FornecedoresDAO();
        List<Fornecedores> listadefornecedores = dao.listaFornecedores();
        txtFornecedores.removeAllItems();

        for (Fornecedores f : listadefornecedores) {
            txtFornecedores.addItem(f);
        }
    }//GEN-LAST:event_txtFornecedoresMouseClicked

    private void txtFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornecedoresActionPerformed

    }//GEN-LAST:event_txtFornecedoresActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void txtQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            if(Utilitarios.matchesOnlyNumber(txtQuantidade.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Informe apenas números", "Aviso", JOptionPane.WARNING_MESSAGE);
                txtQuantidade.setText(null);
            }
        }
    }//GEN-LAST:event_txtQuantidadeKeyPressed

    private void txtPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            if(Utilitarios.matchesOnlyNumber(txtPreco.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Informe apenas números", "Aviso", JOptionPane.WARNING_MESSAGE);
                txtPreco.setText(null);
            }
        }
    }//GEN-LAST:event_txtPrecoKeyPressed

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
            java.util.logging.Logger.getLogger(FrmCadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JPanel dadosPessoais;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel nomeTela;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JComboBox txtFornecedores;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
