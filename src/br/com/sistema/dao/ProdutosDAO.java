/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.Fornecedores;
import br.com.sistema.model.Produtos;
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
public class ProdutosDAO {
    
    private Connection connection;
    
    public void cadastrarProdutos(Produtos dadosProdutos)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlInsertComand = "insert into tb_produtos(descricao, preco, qtd_estoque, for_id) values (?,?,?,?)";            
            PreparedStatement stmt = connection.prepareStatement(sqlInsertComand);
            
            stmt.setString(1, dadosProdutos.getDescricao());
            stmt.setDouble(2, dadosProdutos.getPreco());
            stmt.setInt(3, dadosProdutos.getQtd_estoque());
            stmt.setInt(4, dadosProdutos.getFornecedor().getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro, "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    public void editarCadastroProduto(Produtos dadosProdutos)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlUpdateComand = "update tb_produtos set descricao = ?, preco = ?, qtd_estoque = ?, for_id = ? where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sqlUpdateComand);
            
            stmt.setString(1, dadosProdutos.getDescricao());
            stmt.setDouble(2, dadosProdutos.getPreco());
            stmt.setInt(3, dadosProdutos.getQtd_estoque());
            stmt.setInt(4, dadosProdutos.getFornecedor().getId());
            stmt.setInt(5, dadosProdutos.getId());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro, "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void excluirProduto(int id)
    {
        try
        {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlDeleteComand = "delete from tb_produtos where id = ?";
            PreparedStatement stmt = connection.prepareStatement(sqlDeleteComand);
            
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro, "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public List<Produtos> listarProdutos()
    {
        try
        {
            List<Produtos> lista = new ArrayList<>();
            
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlSelectComand = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from tb_produtos as p "
                    + "inner join tb_fornecedores as f on (p.for_id = f.id)";
            PreparedStatement stmt = connection.prepareStatement(sqlSelectComand);
            
            ResultSet res = stmt.executeQuery();
            
            while(res.next())
            {
                Produtos p = new Produtos();
                Fornecedores f = new Fornecedores();
                
                f.setNome(res.getString("f.nome"));
                p.setDescricao(res.getString("p.descricao"));
                p.setFornecedor(f);
                p.setId(res.getInt("p.id"));
                p.setPreco(res.getDouble("p.preco"));
                p.setQtd_estoque(res.getInt("p.qtd_estoque"));
                
                lista.add(p);
            }
            return lista;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro, "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public List<Produtos> buscarProdutosPorNome(String nome)
    {
        try
        {
            List<Produtos> lista = new ArrayList<>();
            
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sqlSelectComand = "select p.id, p.descricao, p.preco, p.qtd_estoque, f.nome from tb_produtos as p"
                    + "inner join tb_fornecedores as f on (p.for_id = f.id) where p.descricao like ?";
            PreparedStatement stmt = connection.prepareStatement(sqlSelectComand);
            stmt.setString(1, nome);
            
            ResultSet res = stmt.executeQuery();
            
            while(res.next())
            {
                Produtos p = new Produtos();
                Fornecedores f = new Fornecedores();
                
                f.setNome(res.getString("f.nome"));
                p.setDescricao(res.getString("p.descricao"));
                p.setFornecedor(f);
                p.setId(res.getInt("p.id"));
                p.setPreco(res.getDouble("p.preco"));
                p.setQtd_estoque(res.getInt("p.qtd_estoque"));
                
                lista.add(p);
            }
            return lista;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro: "+erro, "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    //metodo buscaProduto  por Codigo
    public Produtos buscaPorCodigo(int id) {
        try {
            //1 passo - criar o sql , organizar e executar.
            
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            String sql = "select * from tb_produtos where id =  ?";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();

            if (rs.next()) {

                obj.setId(rs.getInt("id"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setPreco(rs.getDouble("preco"));
                obj.setQtd_estoque(rs.getInt("qtd_estoque"));

            }

            return obj;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
            return null;
        }
    }

    //Metodo  que da baixa no estoque
    public void baixaEstoque(int id, int qtd_nova) {
        try {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();

            String sql = "update tb_produtos  set qtd_estoque= ?  where id=?";
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();

           // JOptionPane.showMessageDialog(null, "Produto Alterardo com Sucesso!");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro : " + erro);

        }

    }
    
       //Metodo  que da baixa no estoque
    public void adicionarEstoque(int id, int qtd_nova) {
        try {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();

            String sql = "update tb_produtos  set qtd_estoque= ?  where id=?";
            //2 passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, qtd_nova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();

           // JOptionPane.showMessageDialog(null, "Produto Alterardo com Sucesso!");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Erro : " + erro);

        }

    }
    
    //Metodo que retorna o estoque atual de um produto
    public int retornaEstoqueAtual(int id) {
        try {
            ConnectionFactory makeConnection = new ConnectionFactory();
            connection = makeConnection.getConnection();
            
            int qtd_estoque = 0;

            String sql = "SELECT qtd_estoque from tb_produtos where id = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {           
                qtd_estoque = (rs.getInt("qtd_estoque"));    
            }

            return qtd_estoque;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
}
