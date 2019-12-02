/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/LOJA";
    private static final String USER = "root";
    private static final String PASS = "Thiago1990@";
    public Connection con;
    
    public void conexao(){ //Metodo responsavel por realizar conexão com o banco de dados.
        try {
             System.setProperty("jdbc.Drivers", DRIVER);
            
            con = DriverManager.getConnection(URL, USER, PASS);
        
        }catch(SQLException ex) {
          
            JOptionPane.showMessageDialog(null,"Erro na conexão" +ex.getMessage());
        }
        
    }
    public void executaSql (String sql){
        try{
        stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
        rs = stm.executeQuery(sql);
        }catch (SQLException ex){
            
        JOptionPane.showMessageDialog(null,"Erro na conexão" + ex.getMessage());
    }
    }
    public void desconectar(){
        try {
        con.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro na conexão" +ex.getMessage());
        }
    
    }  
        
            
        }
    
    
    
    

