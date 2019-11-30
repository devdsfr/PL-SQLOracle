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
import javax.swing.JOptionPane;
import model.Vendas;
public class VendasDao {
    
    
    private Connection con = null;

    public VendasDao() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Vendas vendas){
        
        String sql = "INSERT INTO VENDAS (DATA_VENDAS, TOTAL_BRUTO, DESCONTO, TOTAL_LIQUIDO, CPF_CNPJ) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setDate(1, vendas.getData_vendas());
            stmt.setDouble(2, vendas.getTotal_Bruto());
           stmt.setDouble(3, vendas.getDesconto());
            stmt.setDouble(4, vendas.getTotal_Liquido());
            stmt.setString(5, vendas.getCPF_CNPJ());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public List<Vendas> findAll (){
        
        String sql = "SELECT * FROM VENDAS";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Vendas> Vendas = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Vendas vendas = new Vendas();
                vendas.setData_vendas(rs.getDate("VENDAS"));
                vendas.add(vendas);
            }
        } catch (SQLException ex) {
          System.err.println("Erro" +ex);  
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        return Vendas;
    }
       public boolean update(Vendas vendas){
        
        String sql = "UPDATE VENDAS SET descricao = ? WHERE id = ?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, vendas.getId_Vendas());            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    

       public boolean delete(Vendas vendas){
        
        String sql = "DELETE FROM VENDAS WHERE id =  ?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, vendas.getId_Vendas());
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


