/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;

public class ProdutoDao {
       private Connection con = null;
       
       public ProdutoDao (){
           con = ConnectionFactory.getConnection();
           
       }
        public boolean save(Produto produto){
        
        String sql = "INSERT INTO PRODUTO (DESCRICAO, VALOR) VALUES (?,?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getValor());
            stmt.executeUpdate();
            //return true;
            JOptionPane.showMessageDialog(null ,  "Salvo com sucesso");
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
           
    }
        
    
    public List<Produto> findAll (){
        
        String sql = "SELECT * FROM PRODUTO WHERE ID_PRODUTO IN (?)";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Produto produto = new Produto();
                produto.setID_PRODUTO(rs.getInt("ID_PRODUTO"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
          System.err.println("Erro" +ex);  
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        return produtos;
    }
       public boolean update(Produto produto){
        
        String sql = "UPDATE PRODUTO SET descricao = ? WHERE id = ?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getValor());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    

       public boolean delete(Produto produto){
        
        String sql = "DELETE FROM PRODUTO WHERE id =  ?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,produto.getID_PRODUTO());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}



    

