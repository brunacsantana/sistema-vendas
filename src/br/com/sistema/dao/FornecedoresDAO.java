/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Fornecedores;
import br.com.sistema.model.Funcionarios;
import br.com.sistema.model.WebServiceCep;
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
public class FornecedoresDAO {
    
    private Connection connection;

    public FornecedoresDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void cadastrarFornecedor(Fornecedores dadosFornecedores)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlInsertComand = "insert into tb_fornecedores(nome, cnpj, email, cep, telefone, celular, endereco, numero, complemento, bairro, cidade, estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(sqlInsertComand);
            
            stmt.setString(1, dadosFornecedores.getNome());
            stmt.setString(2, dadosFornecedores.getCnpj());
            stmt.setString(3, dadosFornecedores.getEmail());
            stmt.setString(4, dadosFornecedores.getCep());
            stmt.setString(5, dadosFornecedores.getTelefone());
            stmt.setString(6, dadosFornecedores.getCelular());
            stmt.setString(7, dadosFornecedores.getEndereco());
            stmt.setInt(8, dadosFornecedores.getNumero());
            stmt.setString(9, dadosFornecedores.getComplemento());
            stmt.setString(10, dadosFornecedores.getBairro());
            stmt.setString(11, dadosFornecedores.getCidade());
            stmt.setString(12, dadosFornecedores.getUf());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: " +erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public void alterarDadosFornecedor(Fornecedores dadosFornecedor)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlUpadateComand = "update tb_fornecedores set nome = ?, cnpj = ?, email = ?, cep = ?, telefone = ?,"
                    + "celular = ?, endereco = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, estado = ? where id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sqlUpadateComand);
            
            stmt.setString(1, dadosFornecedor.getNome());
            stmt.setString(2, dadosFornecedor.getCnpj());
            stmt.setString(3, dadosFornecedor.getEmail());
            stmt.setString(4, dadosFornecedor.getCep());
            stmt.setString(5, dadosFornecedor.getTelefone());
            stmt.setString(6, dadosFornecedor.getCelular());
            stmt.setString(7, dadosFornecedor.getEndereco());
            stmt.setInt(8, dadosFornecedor.getNumero());
            stmt.setString(9, dadosFornecedor.getComplemento());
            stmt.setString(10, dadosFornecedor.getBairro());
            stmt.setString(11, dadosFornecedor.getCidade());
            stmt.setString(12, dadosFornecedor.getUf());
            stmt.setInt(13, dadosFornecedor.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: " +erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public void excluirFornecedor(int id)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlDeleteComand = "delete from tb_fornecedores where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sqlDeleteComand);
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public List<Fornecedores> listaFornecedores()
    {
        try {

            //1 passo criar a lista
            List<Fornecedores> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select * from tb_fornecedores";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedores obj = new Fornecedores();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));             
                obj.setCnpj(rs.getString("cnpj"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }
        
    }
    public List<Fornecedores> buscarFornecedorPorNome(String nome)
    {
        try
        {
            List<Fornecedores> lista = new ArrayList<>();
            
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlComandSelect = "select * from tb_fornecedores where nome like ?";
            
            PreparedStatement stmt = connection.prepareStatement(sqlComandSelect);
            stmt.setString(1, nome);
            
            ResultSet res = stmt.executeQuery();
            
            while(res.next())
            {
                Fornecedores dadosFornecedores = new Fornecedores();
                
                dadosFornecedores.setBairro(res.getString("bairro"));
                dadosFornecedores.setCelular(res.getString("celular"));
                dadosFornecedores.setCep(res.getString("cep"));
                dadosFornecedores.setCidade(res.getString("cidade"));
                dadosFornecedores.setCnpj(res.getString("cnpj"));
                dadosFornecedores.setComplemento(res.getString("complemento"));
                dadosFornecedores.setEmail(res.getString("email"));
                dadosFornecedores.setEndereco(res.getString("endereco"));
                dadosFornecedores.setId(res.getInt("id"));
                dadosFornecedores.setNome(res.getString("nome"));
                dadosFornecedores.setNumero(res.getInt("numero"));
                dadosFornecedores.setTelefone(res.getString("telefone"));
                dadosFornecedores.setUf(res.getString("uf"));
                
                lista.add(dadosFornecedores);
            }
            return lista;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro, "ATENÇÂO!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    ////////////////////////////////////////////////////////////////////////////
    public Fornecedores buscaCep(String cep)
    {
        WebServiceCep wsc = WebServiceCep.searchCep(cep);
        Fornecedores dadosCep = new Fornecedores();
        
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
}
