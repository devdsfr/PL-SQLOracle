/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thiago
 */
public class Usuario {
   private int Id_usuario;
   private String Usuario;
   private String Email;
   private String CPF_CNPJ;
   
   public Usuario(){
       
   }

    public Usuario(int Id_usuario, String Usuario, String Email, String CPF_CNPJ) {
        this.Id_usuario = Id_usuario;
        this.Usuario = Usuario;
        this.Email = Email;
        this.CPF_CNPJ = CPF_CNPJ;
   
    }

    public int getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(int Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }
   public void add(Usuario usuario){
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
}
}
