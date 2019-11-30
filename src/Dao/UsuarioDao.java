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
import model.Usuario;


public class UsuarioDao {
    
      private Connection con = null;
       
       public UsuarioDao (){
           con = ConnectionFactory.getConnection();
    
}
public boolean save(Usuario usuario){
             
  String sql = "INSERT INTO USUARIO (NOME, EMAIL, CPF_CNPJ) VALUES (?, ?, ?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getEmail());
            stmt.setInt(3, usuario.getCPF_CNPJ());
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
    
    
    public List<Usuario> findAll (){
        
        String sql = "SELECT * FROM USUARIO";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Usuario usuario = new Usuario();
                usuario.setUsuario(rs.getString("CLIENTE"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
          System.err.println("Erro" +ex);  
        }finally{
        ConnectionFactory.closeConnection(con, stmt, rs);
    }
        return usuarios;
    }
       public boolean update(Usuario usuario){
        
        String sql = "UPDATE USUARIO SET NOME = ? WHERE id = ?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getEmail());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    

       public boolean delete(Usuario usuario){
        
        String sql = "DELETE FROM USUARIO WHERE id =  ?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, usuario.getId_usuario());
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
