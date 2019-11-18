/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*   
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/LOJA";
    private static final String USER = "root";
    private static final String PASS = "Thiago1990@";
    
 */    

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectionFactory {
    private Connection connection;
    private ResultSet resultSet;
    private Statement statement;
    private String servidor = "localhost";
    private String nomeDoBanco = "LOJA";
    private String url = "jdbc:mysql://";
    private String porta = "3366";
    private String usuario ="root" ;
    private String senha = "1234567";
   
    
    public ConnectionFactory(){
        
    }
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            url = url + servidor + "/" + nomeDoBanco;
            setConnection((Connection)DriverManager.getConnection(url, usuario, senha));
        } catch (ClassNotFoundException | InstantiationException| IllegalAccessException |
                SQLException e) {
            System.err.print(e);
        }
        return getConnection();
            
    }
    
    public void fecharConexao(){
        try {
            getResultSet().close();
            getStatement().close();
            getConnection().close();
        } catch (SQLException e) {
             System.err.println(e);
        }
    }
    
    public int insertSQL(String sql){
        int status = 0;
        try {
            setStatement(getConnection().createStatement());
            getStatement().executeUpdate(sql);            
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        return 1;
        
    }
    
    public Connection getConnection(){
        return this.connection;
    }
    public void setConnection(Connection connection){
        this.connection = connection;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
    
    
 }


    