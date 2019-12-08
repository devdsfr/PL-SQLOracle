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
import model.Usuario;


public class UsuarioDao {
    ConexaoBD conex = new ConexaoBD();
    Usuario us = new Usuario();
    private Connection con = null;
       
       public UsuarioDao (){
           con = ConnectionFactory.getConnection();
    
}
public boolean save(Usuario usuario){
             
  String sql = "INSERT INTO USUARIO (NOME, EMAIL, CPF, SENHA) VALUES (?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getCPF());
            stmt.setString(4, usuario.getSenha());
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
       public boolean Editar (Usuario usua){
        
        String sql = "UPDATE USUARIO SET NOME =?, EMAIL=?, CPF=?, WHERE ID_USUARIO =?";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usua.getUsuario());
            stmt.setString(2, usua.getEmail());
            stmt.setString(2, usua.getCPF());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null ,"Erro ao  Editar usuario." +ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    

       public void delete(Usuario usu){
        
        String sql = "DELETE FROM USUARIO WHERE ID_USUARIO IN (?)";
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, usu.getID_USUARIO());
            stmt.executeUpdate();
             JOptionPane.showMessageDialog(null ,"Usuario excluido com sucesso.");
            
        } catch (SQLException ex) {
            System.err.println("Erro" +ex);
            
        }finally{
           // ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void setID_USUARIO(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}
}