package DAO;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/atividadefinalpoo1";
        
        try {
            Class.forName(driver);
            
            conexao = DriverManager.getConnection(url, user , password);
            
            return conexao;
        }catch (Exception e){
             //JOptionPane.showMessegeDialog(null, "Falha na conexão " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Falha na conexao " + e.getMessage());
             return null;
        }
    }
}
