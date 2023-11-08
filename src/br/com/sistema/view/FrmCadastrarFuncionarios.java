/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.view;

import br.com.sistema.dao.FuncionariosDAO;
import br.com.sistema.model.Funcionarios;
import br.com.sistema.model.Utilitarios;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author User
 */
public class FrmCadastrarFuncionarios extends javax.swing.JFrame {

    boolean isRegister = true;

    /**
     * Creates new form Frmclientes
     */
    public FrmCadastrarFuncionarios() {
        initComponents();
    }  
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Verifica se há campos em branco e retorna verdadeiro ou falso
    private boolean verificaCampos()
    {   
        boolean campoVazio = false;
        
        if(txtNome.getText().isBlank())
        {
            txtNome.setBackground(Color.red);
            campoVazio = true;
        }
        else
        {
            txtNome.setBackground(Color.LIGHT_GRAY);
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if((txtCelular.getText().equals("+55 (  )       -    ")))
        {
            txtCelular.setBackground(Color.red);
            campoVazio = true;
        }
        else
        {
            txtCelular.setBackground(Color.LIGHT_GRAY);
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(txtRG.getText().equals("  .   .   - "))
        {
            txtRG.setBackground(Color.red);
            campoVazio = true;
        }
        else
        {
            txtRG.setBackground(Color.LIGHT_GRAY);
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(txtCPF.getText().equals("   .   .   -  "))
        {
            txtCPF.setBackground(Color.red);
            campoVazio = true;
        }
        else
        {
            txtCPF.setBackground(Color.LIGHT_GRAY);
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(txtCEP.getText().equals("  .   .   "))
        {
            txtCEP.setBackground(Color.red);
            campoVazio = true;
        }
        else
        {
            txtCEP.setBackground(Color.LIGHT_GRAY);
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(txtPassword.getText().isBlank())
        {
            txtPassword.setBackground(Color.red);
            campoVazio = true;
        }
        else
        {
            txtPassword.setBackground(Color.LIGHT_GRAY);  
        }
        return campoVazio;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Preenche os campo da tela de cadastro com as informações do cadastro selecionado 
    void preencheCampos(JTable tabelaFuncionarios) 
    {
        txtID.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 0).toString());
        txtNome.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 1).toString());
        txtRG.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 2).toString());
        txtCPF.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 3).toString());
        txtEmail.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 4).toString());
        txtTelefone.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 5).toString());
        txtCelular.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 6).toString());
        txtCEP.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 7).toString());
        txtEndereco.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 8).toString());
        txtNumero.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 9).toString());
        txtComplemento.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 10).toString());
        txtBairro.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 11).toString());
        txtCidade.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 12).toString());
        txtUF.setSelectedItem(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 13));   
        txtNivelAcesso.setSelectedItem(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 14)); 
        txtCargo.setSelectedItem(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 15));
        txtPassword.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 16).toString());
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Pega as informações dos campos da tela de cadastro cria um novo objeto do funcionário
    private Funcionarios montaFuncionario()
    {
        Funcionarios dadosFuncionario = new Funcionarios();
        
        dadosFuncionario.setNome(txtNome.getText());
        dadosFuncionario.setRg(txtRG.getText());
        dadosFuncionario.setCpf(txtCPF.getText());
        dadosFuncionario.setBairro(txtBairro.getText());
        dadosFuncionario.setEmail(txtEmail.getText());
        dadosFuncionario.setCargo(txtCargo.getSelectedItem().toString());
        dadosFuncionario.setCelular(txtCelular.getText());
        dadosFuncionario.setCep(txtCEP.getText());
        dadosFuncionario.setCidade(txtCidade.getText());
        dadosFuncionario.setComplemento(txtComplemento.getText());
        dadosFuncionario.setEndereco(txtEndereco.getText());
        dadosFuncionario.setId(Integer.parseInt(txtID.getText()));
        dadosFuncionario.setNivelAcesso(txtNivelAcesso.getSelectedItem().toString());
        dadosFuncionario.setNumero(Integer.parseInt(txtNumero.getText()));
        dadosFuncionario.setSenha((new String(txtPassword.getPassword())));
        dadosFuncionario.setTelefone(txtTelefone.getText());
        dadosFuncionario.setUf(txtUF.getSelectedItem().toString());
        
        //verificação de senha
         
        if(Utilitarios.validarSenha(txtPassword.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Senha inválida.\nSua senha deve conter no mínimo 8 caracteres, entre eles letras e números", "Aviso", JOptionPane.WARNING_MESSAGE);
            txtPassword.setText(null);
        }     
        
        return dadosFuncionario;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     /*
     * This method is called from within the constructor to initialize the form.WARNING: Do NOT modify this code.The content of this method is always
     * regenerated by the Form Editor.
     * @param list
     * @return 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nomeTela = new javax.swing.JLabel();
        dadosPessoais = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtUF = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtNivelAcesso = new javax.swing.JComboBox<>();
        txtRG = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        nomeTela.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        nomeTela.setForeground(new java.awt.Color(255, 255, 255));
        nomeTela.setText("Cadastro Funcionário");

        dadosPessoais.setBackground(new java.awt.Color(240, 245, 245));
        dadosPessoais.setMaximumSize(new java.awt.Dimension(800, 800));
        dadosPessoais.setPreferredSize(new java.awt.Dimension(800, 530));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("E-mail");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Celular");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("Telefone");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("Complemento");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setText("Cidade");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setText("Bairro");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel13.setText("CEP");

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(204, 204, 204));
        txtID.setText("0");
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel14.setText("CPF");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel15.setText("Nº");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel16.setText("UF");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setText("Endereço");

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroKeyPressed(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtUF.setBackground(java.awt.Color.lightGray);
        txtUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "", "" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Cargo");

        txtCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Senha");

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel19.setText("Nível de acesso");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEPFocusLost(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setText("");
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPFKeyPressed(evt);
            }
        });

        txtNivelAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "USUÁRIO" }));

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel18.setText("RG");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        botaoSalvar.setBackground(new java.awt.Color(147, 238, 57));
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
        botaoLimpar.setMaximumSize(new java.awt.Dimension(75, 22));
        botaoLimpar.setMinimumSize(new java.awt.Dimension(75, 22));
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
                .addGap(40, 40, 40)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel13)
                                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel8))
                                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                                    .addGap(19, 19, 19)
                                                    .addComponent(txtCEP))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dadosPessoaisLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisLayout.createSequentialGroup()
                                                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel14))
                                                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel9)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisLayout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisLayout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(23, 23, 23)
                                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNivelAcesso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(603, 603, 603))
                    .addGroup(dadosPessoaisLayout.createSequentialGroup()
                        .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(703, 703, 703))))
            .addGroup(dadosPessoaisLayout.createSequentialGroup()
                .addGap(542, 542, 542)
                .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dadosPessoaisLayout.setVerticalGroup(
            dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadosPessoaisLayout.createSequentialGroup()
                .addGap(23, 28, Short.MAX_VALUE)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(12, 12, 12)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(15, 15, 15)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(nomeTela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(nomeTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 665));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Verifica se a operação é um novo cadastro ou uma edição de cadastro e então salva as informações no banco
    private void botaoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSalvarMouseClicked
        
        FuncionariosDAO dao = new FuncionariosDAO();
        
        if(verificaCampos())
        {
           JOptionPane.showMessageDialog(null, "Preencha todos os campos em vermelho!");
        }
        else
        {
            if(isRegister)
            {
                dao.cadastrarFuncionario(montaFuncionario());
                Utilitarios.LimpaTela(dadosPessoais);
            }
            else
            {
                dao.alterarFuncionarios(montaFuncionario());
                this.dispose();
            }
        }
    }//GEN-LAST:event_botaoSalvarMouseClicked
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Limpa todos os campos da tela de cadastro
    private void botaoLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoLimparMouseClicked
        
        Utilitarios.LimpaTela(dadosPessoais);
    }//GEN-LAST:event_botaoLimparMouseClicked

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed

        // valida CPF ao clicar na tecla TAB ou enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            if(Utilitarios.isCPF(txtCPF.getText()) == false) {
                JOptionPane.showMessageDialog(null, "CPF Inválido", "Aviso", JOptionPane.WARNING_MESSAGE);
                txtCPF.setText(null);
            }
        }
    }//GEN-LAST:event_txtCPFKeyPressed

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Vefica se o cep digitado é válido e então preenche automaticamente determinados campos
    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost

        FuncionariosDAO dao = new FuncionariosDAO();
        Funcionarios dadosCep = dao.buscaCep(txtCEP.getText());

        if(dadosCep != null)
        {
            txtEndereco.setText(dadosCep.getEndereco());
            txtBairro.setText(dadosCep.getBairro());
            txtUF.setSelectedItem(dadosCep.getUf());
            txtCidade.setText(dadosCep.getCidade());
        }
    }//GEN-LAST:event_txtCEPFocusLost

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
/*
        //verificação de senha
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            if(Utilitarios.validarSenha(txtPassword.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Senha inválida.\nSua senha deve conter no mínimo 8 caracteres, entre eles letras e números", "Aviso", JOptionPane.WARNING_MESSAGE);
                txtPassword.setText(null);
            }
        } */
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            if(Utilitarios.matchesOnlyText(txtNome.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Informe apenas letras", "Aviso", JOptionPane.WARNING_MESSAGE);
                txtNome.setText(null);
            }
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            if(Utilitarios.matchesOnlyNumber(txtNome.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Informe apenas números", "Aviso", JOptionPane.WARNING_MESSAGE);
                txtNumero.setText(null);
            }
        }
    }//GEN-LAST:event_txtNumeroKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        
        if(Utilitarios.validarSenha(new String(txtPassword.getPassword())) == false) {
                JOptionPane.showMessageDialog(null, "Senha inválida. Sua senha deve conter no mínimo 8 caracteres", "Aviso", JOptionPane.WARNING_MESSAGE);
                
            }
        
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            if(Utilitarios.isValidEmailAddressRegex(txtEmail.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Informe um e-mail válido", "Aviso", JOptionPane.WARNING_MESSAGE);
                txtEmail.setText(null);
            }
        }
    }//GEN-LAST:event_txtEmailKeyPressed
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(FrmCadastrarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmCadastrarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JPanel dadosPessoais;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel nomeTela;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JComboBox<String> txtCargo;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtID;
    private javax.swing.JComboBox<String> txtNivelAcesso;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JComboBox<String> txtUF;
    // End of variables declaration//GEN-END:variables

}
