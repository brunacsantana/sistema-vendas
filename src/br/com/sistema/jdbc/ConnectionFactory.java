package br.com.sistema.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class ConnectionFactory {
    
    public Connection getConnection() {

        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bdv", "cleiton", "1234");

        } catch (SQLException erro) {
            System.err.println(erro);
            throw new RuntimeException(erro);
        }

    }
    
}
