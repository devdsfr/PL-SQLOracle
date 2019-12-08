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
import model.BensProduto;
import connection.ConexaoBD;

public class ProdutoDao {
      
       ConexaoBD conex = new ConexaoBD();
       BensProduto mod = new BensProduto();
        private Connection con = null;
       public ProdutoDao (){
           con = ConnectionFactory.getConnection();
           
       }
        public boolean save(BensProduto produto){
        
        String sql = "INSERT INTO PRODUTO (DESCRICAO, VALOR, TOTAL) VALUES (?,?,?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getValor());
            stmt.setDouble(3, produto.getTotal());
            stmt.executeUpdate();
     
            JOptionPane.showMessageDialog(null ,  "Salvo com sucesso");
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
           
        }
        
    
    public  BensProduto buscarProduto (int ID_PRODUTO) throws SQLException{
        conex.conexao();
        PreparedStatement stmt = null;
        conex.executaSql("SELECT * FROM PRODUTO WHERE ID_PRODUTO VALUES (?)");
        stmt.setInt(1, ID_PRODUTO);
        try{
            
            
        
        conex.rs.first();
        mod.setID_PRODUTO(conex.rs.getInt("ID_PRODUTO"));
        mod.setDescricao(conex.rs.getString("DESCRICAO"));
        mod.setValor(conex.rs.getDouble("VALOR"));
        mod.setTotal(conex.rs.getInt("TOTAL"));
        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null ,  "Erro ao buscar produto."+ex);
        }
        conex.desconectar();
           return mod;
    
    }
    
       public void Editar (BensProduto mod){
        
        String sql = "UPDATE PRODUTO SET DESCRICAO=?, VALOR=?, TOTAL=? WHERE ID_PRODUTO=?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, mod.getDescricao());
            stmt.setDouble(2, mod.getValor());
            stmt.setDouble(3, mod.getTotal());
            stmt.setInt(4, mod.getID_PRODUTO());
            stmt.executeUpdate();
             JOptionPane.showMessageDialog(null ,  "Produto Alterado com sucesso!.");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null ,  "Erro ao Alterar Produto."+ex);
        }finally{
            //ConnectionFactory.closeConnection(con, stmt);
        }
           
        }
    

   
     public void delete(BensProduto produ){
        
        String sql = "DELETE FROM PRODUTO WHERE ID_PRODUTO IN (?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1,produ.getID_PRODUTO());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null , "Produto excluido com sucesso.");
           
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
          
        }finally{
          //  ConnectionFactory(con, stmt);
}
     }
      public void setID_PRODUTO(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



    

