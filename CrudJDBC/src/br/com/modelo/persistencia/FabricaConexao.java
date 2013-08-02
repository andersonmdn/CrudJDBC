/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anderson_feliciano
 */
public class FabricaConexao {
    public static Connection getConnection() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.
                    getConnection
                    ("jdbc:mysql://localhost:/3306/revenda", "root", "");
        }catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    }
}
