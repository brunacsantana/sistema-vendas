/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Funcionarios;
import br.com.sistema.model.WebServiceCep;
import br.com.sistema.view.FrmLogin;
import br.com.sistema.view.FrmMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class FuncionariosDAO {
    
    private Connection connection;
    
    public void cadastrarFuncionario(Funcionarios dadosFuncionario)
    {
        try
        {   //Solicita uma conexao com o banco de dados
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlInsertComand = "insert into tb_funcionarios(nome, rg, cpf, email, senha, cargo, nivel_acesso, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(sqlInsertComand);
            
            stmt.setString(1, dadosFuncionario.getNome());
            stmt.setString(2, dadosFuncionario.getRg());
            stmt.setString(3, dadosFuncionario.getCpf());
            stmt.setString(4, dadosFuncionario.getEmail());
            stmt.setString(5, dadosFuncionario.getSenha());
            stmt.setString(6, dadosFuncionario.getCargo());
            stmt.setString(7, dadosFuncionario.getNivelAcesso());
            stmt.setString(8, dadosFuncionario.getTelefone());
            stmt.setString(9, dadosFuncionario.getCelular());
            stmt.setString(10, dadosFuncionario.getCep());
            stmt.setString(11, dadosFuncionario.getEndereco());
            stmt.setInt(12, dadosFuncionario.getNumero());
            stmt.setString(13, dadosFuncionario.getComplemento());
            stmt.setString(14, dadosFuncionario.getBairro());
            stmt.setString(15, dadosFuncionario.getCidade());
            stmt.setString(16, dadosFuncionario.getUf());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro);
        }    
    }
    ////////////////////////////////////////////////////////////////////////////
    public void alterarFuncionarios(Funcionarios dadosFuncionario)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlComandUpdate = "update tb_funcionarios set nome = ?, rg = ?, cpf = ?, email = ?, senha = ?, cargo = ?,"
                    + "nivel_acesso = ?, telefone = ?, celular = ?, cep = ?, endereco = ?, numero = ?, complemento =?,"
                    + "bairro = ?, cidade = ?, estado = ? where id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sqlComandUpdate);
            
            stmt.setString(1, dadosFuncionario.getNome());
            stmt.setString(2, dadosFuncionario.getRg());
            stmt.setString(3, dadosFuncionario.getCpf());
            stmt.setString(4, dadosFuncionario.getEmail());
            stmt.setString(5, dadosFuncionario.getSenha());
            stmt.setString(6, dadosFuncionario.getCargo());
            stmt.setString(7, dadosFuncionario.getNivelAcesso());
            stmt.setString(8, dadosFuncionario.getTelefone());
            stmt.setString(9, dadosFuncionario.getCelular());
            stmt.setString(10, dadosFuncionario.getCep());
            stmt.setString(11, dadosFuncionario.getEndereco());
            stmt.setInt(12, dadosFuncionario.getNumero());
            stmt.setString(13, dadosFuncionario.getComplemento());
            stmt.setString(14, dadosFuncionario.getBairro());
            stmt.setString(15, dadosFuncionario.getCidade());
            stmt.setString(16, dadosFuncionario.getUf());
            stmt.setInt(17, dadosFuncionario.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");     
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public void excluirFuncionario(int id)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlComandDelete = "delete from tb_funcionarios where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sqlComandDelete);
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
                
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro: "+erro);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public List<Funcionarios> listarFuncionarios()
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            List<Funcionarios> lista = new ArrayList<>();
            String sqlComandSelect = "select * from tb_funcionarios";

            PreparedStatement stmt = connection.prepareStatement(sqlComandSelect);
            ResultSet res = stmt.executeQuery();
            
            while(res.next())
            {
                Funcionarios dadosFuncionario = new Funcionarios();
                
                dadosFuncionario.setBairro(res.getString("bairro"));
                dadosFuncionario.setCargo(res.getString("cargo"));
                dadosFuncionario.setCelular(res.getString("celular"));
                dadosFuncionario.setCep(res.getString("cep"));
                dadosFuncionario.setCidade(res.getString("cidade"));
                dadosFuncionario.setComplemento(res.getString("complemento"));
                dadosFuncionario.setCpf(res.getString("cpf"));
                dadosFuncionario.setEmail(res.getString("email"));
                dadosFuncionario.setEndereco(res.getString("endereco"));
                dadosFuncionario.setId(res.getInt("id"));
                dadosFuncionario.setNivelAcesso(res.getString("nivel_acesso"));
                dadosFuncionario.setNome(res.getString("nome"));
                dadosFuncionario.setNumero(res.getInt("numero"));
                dadosFuncionario.setRg(res.getString("rg"));
                dadosFuncionario.setSenha(res.getString("senha"));
                dadosFuncionario.setTelefone(res.getString("telefone"));
                dadosFuncionario.setUf(res.getString("estado"));
                dadosFuncionario.setId(res.getInt("id"));
                
                lista.add(dadosFuncionario);
            }
            return lista;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro);
            return null;
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public List<Funcionarios> buscarFuncionarioPorNome(String nome)
    {
        try
        {
            List<Funcionarios> lista = new ArrayList<>();
            
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection  = makeConnection.getConnection();
            
            String sqlComandSelect = "select * from tb_funcionarios where nome like ?";
            
            PreparedStatement stmt = connection.prepareStatement(sqlComandSelect);
            stmt.setString(1, nome);
            
            ResultSet res = stmt.executeQuery();
            
            while(res.next())
            {
                Funcionarios dadosFuncionario = new Funcionarios();
                
                dadosFuncionario.setBairro(res.getString("bairro"));
                dadosFuncionario.setCargo(res.getString("cargo"));
                dadosFuncionario.setCelular(res.getString("celular"));
                dadosFuncionario.setCep(res.getString("cep"));
                dadosFuncionario.setCidade(res.getString("cidade"));
                dadosFuncionario.setComplemento(res.getString("complemento"));
                dadosFuncionario.setCpf(res.getString("cpf"));
                dadosFuncionario.setEmail(res.getString("email"));
                dadosFuncionario.setEndereco(res.getString("endereco"));
                dadosFuncionario.setId(res.getInt("id"));
                dadosFuncionario.setNivelAcesso(res.getString("nivel_acesso"));
                dadosFuncionario.setNome(res.getString("nome"));
                dadosFuncionario.setNumero(res.getInt("numero"));
                dadosFuncionario.setRg(res.getString("rg"));
                dadosFuncionario.setSenha(res.getString("senha"));
                dadosFuncionario.setTelefone(res.getString("telefone"));
                dadosFuncionario.setUf(res.getString("estado"));
                
                lista.add(dadosFuncionario);
            }
            return lista;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: " +erro);
            return null;
        }         
    }
    ////////////////////////////////////////////////////////////////////////////
    public Funcionarios buscaCep(String cep)
    {
        WebServiceCep wsc = WebServiceCep.searchCep(cep);
        Funcionarios dadosCep = new Funcionarios();
        
        if(wsc.wasSuccessful())
        {
            dadosCep.setBairro(wsc.getBairro());
            dadosCep.setCidade(wsc.getCidade());
            dadosCep.setEndereco(wsc.getLogradouroFull());
            dadosCep.setUf(wsc.getUf());
            
            return dadosCep;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Erro numero: " +wsc.getResulCode());
            JOptionPane.showMessageDialog(null, "Descrição do erro: " +wsc.getResultText());
            
            return null;
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public void efetuarLogin(String email, String senha)
    {
        try
        {
            String sqlComandSelect = "select * from tb_funcionarios where email = ? and senha = ?";
            
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sqlComandSelect);
  
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            ResultSet res = stmt.executeQuery();
            if(res.next())
            {
                switch (res.getString("nivel_acesso")) 
                {
                    case "ADMINISTRADOR" ->                         
                    {
                        JOptionPane.showMessageDialog(null, "Bem Vindo!");
                        FrmMenu menuTela = new FrmMenu();
                        menuTela.setUsuarioLogado(res.getString("nome"));
                        menuTela.setVisible(true);    
                    }
                    case "USUÁRIO MASTER" ->                       
                    {
                        JOptionPane.showMessageDialog(null, "Bem Vindo!");
                        FrmMenu menuTela = new FrmMenu();
                        menuTela.setUsuarioLogado(res.getString("nome"));
                        menuTela.setVisible(true);
                        menuTela.controleDeVendas.setEnabled(false);
                        menuTela.posicaoDoDia.setEnabled(false);
                        menuTela.setVisible(true);
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Dados Incorretos");
                new FrmLogin().setVisible(true);
            }
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro);
        }             
    }          
}
