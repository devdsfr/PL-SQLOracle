/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import connection.ConexaoBD;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;


public class ClienteDao {
      private Connection con = null;
      ConexaoBD conex = new ConexaoBD();
      Cliente mod = new Cliente();
      
       public ClienteDao (){
           con = ConnectionFactory.getConnection();
           
       }
         public boolean save(Cliente cliente){
             
  String sql = "INSERT INTO CLIENTE (NOME_OU_RAZAO_SOCIAL, SOBRENOME_NOME_FANTASIA, CPF, CNPJ, NOME, SOBRE_NOME) VALUES (?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome_ou_razao_social());
            stmt.setString(2, cliente.getSobreNome_ou_NomeFantasia());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getCnpj());
            stmt.setString(5, cliente.getNome());
            stmt.setString(6, cliente.getSobre_Nome());
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
    
    
    public List<Cliente> findAll (){
        
        String sql = "SELECT * FROM CLIENTE";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> Cliente = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Cliente TelaCliente = new Cliente();
                TelaCliente.setId_cliente(rs.getInt("CLIENTE"));
                Cliente.add(TelaCliente);
            }
        } catch (SQLException ex) {
          System.err.println("Erro" +ex);  
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        return Cliente;
    }
       public boolean update(Cliente cliente){
        
        String sql = "UPDATE CLIENTE SET descricao = ? WHERE id = ?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome_ou_razao_social());
            stmt.setString(2, cliente.getSobreNome_ou_NomeFantasia());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getCnpj());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    

       public void delete(Cliente cli){
        
        String sql = "DELETE FROM CLIENTE WHERE ID_CLIENTE IN (?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, cli.getId_cliente());
            stmt.executeUpdate();
             JOptionPane.showMessageDialog(null ,"Cliente excluido com sucesso.");
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            
        }finally{
            //ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
