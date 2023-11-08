package br.com.sistema.dao;

import br.com.sistema.jdbc.ConnectionFactory;
import br.com.sistema.model.ItemVenda;
import br.com.sistema.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ItemVendaDAO {
      private Connection con;

    public ItemVendaDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void cadastraItem(ItemVenda obj){
        
        try {
            String sql = "insert into tb_itensvendas (venda_id, produto_id,qtd,subtotal) values (?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());;
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());

            stmt.execute();
            stmt.close();

        }
        catch(Exception erro)
        {
            JOptionPane.showMessageDialog(null, "Erro : " + erro);
        }
    }
    
    public List<ItemVenda> listaItensPorVenda(int venda_id) {
        
        List<ItemVenda> lista = new ArrayList<>();
        try {
            String query = "select p.descricao, i.qtd, p.preco, i.subtotal from tb_itensvendas as i "
                                 + " inner join tb_produtos as p on(i.produto_id = p.id) where i.venda_id = ? ";
       
            PreparedStatement ps = con.prepareStatement(query);         
            ps.setInt(1, venda_id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                ItemVenda item = new ItemVenda();
                Produtos prod = new Produtos();
                
                prod.setDescricao(rs.getString("p.descricao"));
                item.setQtd(rs.getInt("i.qtd"));
                prod.setPreco(rs.getDouble("p.preco"));
                item.setSubtotal(rs.getDouble("i.subtotal"));
                item.setProduto(prod);         
                lista.add(item);
            }
            return lista;
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}