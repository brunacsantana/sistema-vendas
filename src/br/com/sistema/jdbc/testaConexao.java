package br.com.sistema.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class testaConexao {
    
    public static void main(String[] args) {
        
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!"); 

        } catch (HeadlessException erro) {
            JOptionPane.showMessageDialog(null, "Ops aconteceu o erro: "  + erro);    
        }
         
    }

}