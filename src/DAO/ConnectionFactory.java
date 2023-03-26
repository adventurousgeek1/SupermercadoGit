
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
    
    Connection conn = null;
    
    public Connection getConexao(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado?user=root&password=");        
        }catch(SQLException e){                   
            JOptionPane.showMessageDialog(null,"EXCEÇÃO:"+ e);
        }        
        return conn;
    }
}
