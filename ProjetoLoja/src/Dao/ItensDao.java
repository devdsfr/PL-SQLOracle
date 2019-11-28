/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Itens;
public class ItensDao {
     private Connection con = null;

    public ItensDao() {
        con = ConnectionFactory.getConnection();
    
}
 public boolean save(Itens itens){
        
        String sql = "INSERT INTO ITENS (QTD_VENDIDA, DESCONTO_DO_ITEM, VALOR_VENDAS, TOTAL_ITEM) VALUES (?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setDouble(1, itens.getQtd_vendida());
            stmt.setDouble(2, itens.getDesconto_do_item());
            stmt.setDouble(3, itens.getValor_vendas());
            stmt.setDouble(4, itens.getTotal_item());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public List<Itens> findAll (List<Itens> Itens){
        
        String sql = "SELECT * FROM ITENS";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Itens> Id_itens = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Itens TelaItens = new Itens();
                TelaItens.setId_itens(rs.getInt("ITENS"));
                Itens.add(TelaItens);
            }
        } catch (SQLException ex) {
          System.err.println("Erro" +ex);  
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        return Itens;
    }
       public boolean update(Itens itens){
        
        String sql = "UPDATE ITENS SET QTD_VENDIDA = ?, DESCONTO_DO_ITEM = ?, VALOR_VENDAS = ?, TOTAL_ITEM = ?, WHERE id = ?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
             stmt.setDouble(1, itens.getQtd_vendida());
            stmt.setDouble(2, itens.getDesconto_do_item());
            stmt.setDouble(3, itens.getValor_vendas());
            stmt.setDouble(4, itens.getTotal_item());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    

       public boolean delete(Itens itens){
        
        String sql = "DELETE FROM ITENS WHERE id =  ?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setDouble(1, itens.getId_itens());
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