package br.com.sistema.view;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Cleiton Delta
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
        initComponents();
        Atalhos();
        
        
    }

    public void setUsuarioLogado(String nome) {
        usuarioLogado.setText(nome);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/d.jpg"));
        Image image = icon.getImage();
        painel_desktop = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0, getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        usuarioLogado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuDeOpcoes = new javax.swing.JMenuBar();
        opcaoClientes = new javax.swing.JMenu();
        cadastrarClientes = new javax.swing.JMenuItem();
        listarClientes = new javax.swing.JMenuItem();
        opcaoFuncionarios = new javax.swing.JMenu();
        cadastrarFuncionarios = new javax.swing.JMenuItem();
        listarFuncionarios = new javax.swing.JMenuItem();
        opcaoFornecedores = new javax.swing.JMenu();
        cadastrarFornecedores = new javax.swing.JMenuItem();
        listarFornecedores = new javax.swing.JMenuItem();
        opcaoProdutos = new javax.swing.JMenu();
        cadastrarProdutos = new javax.swing.JMenuItem();
        listarProdutos = new javax.swing.JMenuItem();
        opcaoVendas = new javax.swing.JMenu();
        abrirPVD = new javax.swing.JMenuItem();
        posicaoDoDia = new javax.swing.JMenuItem();
        controleDeVendas = new javax.swing.JMenuItem();
        opcaoConfiguracoes = new javax.swing.JMenu();
        trocarUsuario = new javax.swing.JMenuItem();
        atalhos = new javax.swing.JMenuItem();
        opcaoSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        painel_desktop.setBackground(new java.awt.Color(255, 255, 255));
        painel_desktop.setToolTipText("");
        painel_desktop.setPreferredSize(new java.awt.Dimension(860, 515));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Bem vindo ao Sistema C▲");

        usuarioLogado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel2.setText("Desenvolvido por Cleiton Delta SIstemas");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setText("Usuário Logado: ");

        painel_desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel_desktop.setLayer(usuarioLogado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel_desktop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painel_desktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
        painel_desktop.setLayout(painel_desktopLayout);
        painel_desktopLayout.setHorizontalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_desktopLayout.createSequentialGroup()
                .addGroup(painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_desktopLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_desktopLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(484, Short.MAX_VALUE))
            .addGroup(painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_desktopLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel3)
                    .addContainerGap(740, Short.MAX_VALUE)))
        );
        painel_desktopLayout.setVerticalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_desktopLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_desktopLayout.createSequentialGroup()
                    .addContainerGap(502, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap()))
        );

        menuDeOpcoes.setBackground(new java.awt.Color(102, 153, 255));
        menuDeOpcoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        opcaoClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/01.png"))); // NOI18N
        opcaoClientes.setText("Clientes");
        opcaoClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        opcaoClientes.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        opcaoClientes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        cadastrarClientes.setText("Cadastrar Clientes");
        cadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClientesActionPerformed(evt);
            }
        });
        opcaoClientes.add(cadastrarClientes);

        listarClientes.setText("Listar Clientes");
        listarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarClientesActionPerformed(evt);
            }
        });
        opcaoClientes.add(listarClientes);

        menuDeOpcoes.add(opcaoClientes);

        opcaoFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/02.png"))); // NOI18N
        opcaoFuncionarios.setText("Funcionários");
        opcaoFuncionarios.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N

        cadastrarFuncionarios.setText("Cadastrar Funcionários");
        cadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionariosActionPerformed(evt);
            }
        });
        opcaoFuncionarios.add(cadastrarFuncionarios);

        listarFuncionarios.setText("Listar Funcionários");
        listarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFuncionariosActionPerformed(evt);
            }
        });
        opcaoFuncionarios.add(listarFuncionarios);

        menuDeOpcoes.add(opcaoFuncionarios);

        opcaoFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/03.png"))); // NOI18N
        opcaoFornecedores.setText("Fornecedores");
        opcaoFornecedores.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N

        cadastrarFornecedores.setText("Cadastrar Fornecedores");
        cadastrarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFornecedoresActionPerformed(evt);
            }
        });
        opcaoFornecedores.add(cadastrarFornecedores);

        listarFornecedores.setText("Listar Fornecedores");
        listarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarFornecedoresActionPerformed(evt);
            }
        });
        opcaoFornecedores.add(listarFornecedores);

        menuDeOpcoes.add(opcaoFornecedores);

        opcaoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/04.png"))); // NOI18N
        opcaoProdutos.setText("Produtos");
        opcaoProdutos.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N

        cadastrarProdutos.setText("Cadastrar Produtos");
        cadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutosActionPerformed(evt);
            }
        });
        opcaoProdutos.add(cadastrarProdutos);

        listarProdutos.setText("Listar Produtos");
        listarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProdutosActionPerformed(evt);
            }
        });
        opcaoProdutos.add(listarProdutos);

        menuDeOpcoes.add(opcaoProdutos);

        opcaoVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/05.png"))); // NOI18N
        opcaoVendas.setText("Vendas");
        opcaoVendas.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        opcaoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoVendasActionPerformed(evt);
            }
        });

        abrirPVD.setText("Abrir PVD");
        abrirPVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirPVDActionPerformed(evt);
            }
        });
        opcaoVendas.add(abrirPVD);

        posicaoDoDia.setText("Posição do dia");
        posicaoDoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicaoDoDiaActionPerformed(evt);
            }
        });
        opcaoVendas.add(posicaoDoDia);

        controleDeVendas.setText("Controle de vendas");
        controleDeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleDeVendasActionPerformed(evt);
            }
        });
        opcaoVendas.add(controleDeVendas);

        menuDeOpcoes.add(opcaoVendas);

        opcaoConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/06.png"))); // NOI18N
        opcaoConfiguracoes.setText("Configurações");
        opcaoConfiguracoes.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        opcaoConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoConfiguracoesActionPerformed(evt);
            }
        });

        trocarUsuario.setText("Trocar de Usuário");
        trocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocarUsuarioActionPerformed(evt);
            }
        });
        opcaoConfiguracoes.add(trocarUsuario);

        atalhos.setText("Atalhos");
        atalhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atalhosActionPerformed(evt);
            }
        });
        opcaoConfiguracoes.add(atalhos);

        menuDeOpcoes.add(opcaoConfiguracoes);

        opcaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/07.png"))); // NOI18N
        opcaoSair.setText("Sair");
        opcaoSair.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        opcaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcaoSairMouseClicked(evt);
            }
        });
        menuDeOpcoes.add(opcaoSair);

        setJMenuBar(menuDeOpcoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoSairMouseClicked
        //Efetua logout
        int op;
        Object[] options = { "Sim", "Não" };
        op = JOptionPane.showOptionDialog(null, "Tem certeza que deseja sair?", "Saída", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(op == 0)
        {
            FrmLogin telaLogin = new FrmLogin();
            
            telaLogin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_opcaoSairMouseClicked

    private void cadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClientesActionPerformed
        //cadastro cliente
        FrmCadastrarClientes telaClientes = new FrmCadastrarClientes();
        telaClientes.setVisible(true);
    }//GEN-LAST:event_cadastrarClientesActionPerformed

    private void cadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionariosActionPerformed
        //cadastro funcionário
        FrmCadastrarFuncionarios telaFuncionarios = new FrmCadastrarFuncionarios();
        telaFuncionarios.setVisible(true);
    }//GEN-LAST:event_cadastrarFuncionariosActionPerformed

    private void cadastrarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFornecedoresActionPerformed
        //cadastro fornecedor
        FrmCadastrarFornecedores telaFornecedores = new FrmCadastrarFornecedores();
        telaFornecedores.setVisible(true);
    }//GEN-LAST:event_cadastrarFornecedoresActionPerformed

    private void listarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarClientesActionPerformed
        //listar cliente
        FrmListarClientes telaListarClientes = new FrmListarClientes();
        telaListarClientes.setVisible(true);
    }//GEN-LAST:event_listarClientesActionPerformed

    private void listarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarFuncionariosActionPerformed
        //listar funcionário
        FrmListarFuncionarios telaListarFuncionarios = new FrmListarFuncionarios();
        telaListarFuncionarios.setVisible(true);
    }//GEN-LAST:event_listarFuncionariosActionPerformed

    private void listarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarFornecedoresActionPerformed
        //listar fornecedor
        FrmListarFornecedores telaListarFornecedores = new FrmListarFornecedores();
        telaListarFornecedores.setVisible(true);
    }//GEN-LAST:event_listarFornecedoresActionPerformed

    private void cadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutosActionPerformed
        //cadastrar produto
        FrmCadastrarProdutos telaCadastrarProdutos = new FrmCadastrarProdutos();
        telaCadastrarProdutos.setVisible(true);
    }//GEN-LAST:event_cadastrarProdutosActionPerformed

    private void listarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProdutosActionPerformed
        //listar produto
        FrmListarProdutos telaListarProdutos = new FrmListarProdutos();
        telaListarProdutos.setVisible(true);
    }//GEN-LAST:event_listarProdutosActionPerformed

    private void opcaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoVendasActionPerformed
        
       
    }//GEN-LAST:event_opcaoVendasActionPerformed

    private void abrirPVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirPVDActionPerformed
        //tela PDV
        new FrmVendas().setVisible(true);
        
    }//GEN-LAST:event_abrirPVDActionPerformed

    private void trocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocarUsuarioActionPerformed
        // Efetuar logout
        FrmLogin telalogin = new FrmLogin();

        this.dispose();

        telalogin.setVisible(true);
    }//GEN-LAST:event_trocarUsuarioActionPerformed

    private void posicaoDoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicaoDoDiaActionPerformed
        //total vendas
        FrmTotalVendas tela = new FrmTotalVendas();
        tela.setVisible(true);
    }//GEN-LAST:event_posicaoDoDiaActionPerformed

    private void controleDeVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleDeVendasActionPerformed
        //histórico de vendas
        FrmRelatorioVendas tela = new FrmRelatorioVendas();
        tela.setVisible(true);
    }//GEN-LAST:event_controleDeVendasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Deixar maximizado
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void opcaoConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoConfiguracoesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_opcaoConfiguracoesActionPerformed

    private void atalhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atalhosActionPerformed
        // TODO add your handling code here:
        FrmAtalhos telaAtalhos = new FrmAtalhos();
        telaAtalhos.setVisible(true);
    }//GEN-LAST:event_atalhosActionPerformed
    private void Atalhos() {
        KeyboardFocusManager keyManager;

        keyManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        keyManager.addKeyEventDispatcher(new KeyEventDispatcher() {

            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED && e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    
                    FrmMenu.getFrames()[FrmMenu.getFrames().length-1].dispose();
                            
                    //for(int i=0;i<Frmclientes.getFrames().length;i++) {
                    //    System.out.println(">>" + Frmclientes.getFrames()[i].getTitle());
                    //}
                    
                    return true;
                }
                else if(e.getID() == KeyEvent.KEY_PRESSED && e.isControlDown())
                {
                    switch(e.getKeyCode())
                    {
                        case KeyEvent.VK_C -> 
                        {
                            if(FrmMenu.getFrames().length == 1)
                            {
                                FrmCadastrarClientes telaCadastrarClientes  = new FrmCadastrarClientes();
                                telaCadastrarClientes.setVisible(true);
                            }
                            else
                            {
                                FrmMenu.getFrames()[FrmMenu.getFrames().length-1].dispose();
                                FrmCadastrarClientes telaCadastrarClientes  = new FrmCadastrarClientes();
                                telaCadastrarClientes.setVisible(true);
                                telaCadastrarClientes.setAlwaysOnTop(true);
                            }
                        }
                        case KeyEvent.VK_F ->                         
                        {
                            if(FrmMenu.getFrames().length == 1)
                            {
                                FrmCadastrarFornecedores telaCadastrarFornecedores  = new  FrmCadastrarFornecedores();
                                telaCadastrarFornecedores.setVisible(true);
                            }
                            else
                            {
                                FrmMenu.getFrames()[FrmMenu.getFrames().length-1].dispose();
                                FrmCadastrarFornecedores telaCadastrarFornecedores  = new FrmCadastrarFornecedores ();
                                telaCadastrarFornecedores.setVisible(true);
                                telaCadastrarFornecedores.setAlwaysOnTop(true);
                            }                                
                        }
                        case KeyEvent.VK_U ->                         
                        {
                            if(FrmMenu.getFrames().length == 1)
                            {
                                FrmCadastrarFuncionarios telaCadastrarFuncionarios  = new  FrmCadastrarFuncionarios();
                                telaCadastrarFuncionarios.setVisible(true);
                            }
                            else
                            {
                                FrmMenu.getFrames()[FrmMenu.getFrames().length-1].dispose();
                                FrmCadastrarFuncionarios telaCadastrarFuncionarios  = new  FrmCadastrarFuncionarios();
                                telaCadastrarFuncionarios.setVisible(true);
                                telaCadastrarFuncionarios.setAlwaysOnTop(true);
                            }                                
                        }
                        case KeyEvent.VK_P ->                         
                        {
                            if(FrmMenu.getFrames().length == 1)
                            {
                                FrmCadastrarProdutos telaCadastrarProdutos  = new FrmCadastrarProdutos();
                                telaCadastrarProdutos.setVisible(true);
                            }
                            else
                            {
                                FrmMenu.getFrames()[FrmMenu.getFrames().length-1].dispose();
                                FrmCadastrarProdutos telaCadastrarProdutos  = new FrmCadastrarProdutos();
                                telaCadastrarProdutos.setVisible(true);
                                telaCadastrarProdutos.setAlwaysOnTop(true);
                            }                                
                        }
                        case KeyEvent.VK_D ->                         
                        {
                            if(FrmMenu.getFrames().length == 1)
                            {
                                FrmDetalheVendas telaDetalheVendas  = new FrmDetalheVendas();
                                telaDetalheVendas.setVisible(true);
                            }
                            else
                            {
                                FrmMenu.getFrames()[FrmMenu.getFrames().length-1].dispose();
                                FrmCadastrarProdutos telaCadastrarProdutos  = new FrmCadastrarProdutos();
                                telaCadastrarProdutos.setVisible(true);
                                telaCadastrarProdutos.setAlwaysOnTop(true);
                            }                                
                        }
                    }
                }
                return false;
            }

        });
    }
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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirPVD;
    private javax.swing.JMenuItem atalhos;
    private javax.swing.JMenuItem cadastrarClientes;
    private javax.swing.JMenuItem cadastrarFornecedores;
    private javax.swing.JMenuItem cadastrarFuncionarios;
    private javax.swing.JMenuItem cadastrarProdutos;
    public javax.swing.JMenuItem controleDeVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem listarClientes;
    private javax.swing.JMenuItem listarFornecedores;
    private javax.swing.JMenuItem listarFuncionarios;
    private javax.swing.JMenuItem listarProdutos;
    private javax.swing.JMenuBar menuDeOpcoes;
    private javax.swing.JMenu opcaoClientes;
    private javax.swing.JMenu opcaoConfiguracoes;
    private javax.swing.JMenu opcaoFornecedores;
    private javax.swing.JMenu opcaoFuncionarios;
    private javax.swing.JMenu opcaoProdutos;
    private javax.swing.JMenu opcaoSair;
    private javax.swing.JMenu opcaoVendas;
    private javax.swing.JDesktopPane painel_desktop;
    public javax.swing.JMenuItem posicaoDoDia;
    private javax.swing.JMenuItem trocarUsuario;
    private javax.swing.JLabel usuarioLogado;
    // End of variables declaration//GEN-END:variables

    
}
