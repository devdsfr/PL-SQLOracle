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
   private int ID_USUARIO;
   private String Usuario;
   private String Email;
   private String CPF_CNPJ;
   
   public Usuario(){
       
   }
   public void usuario(){
       
   }

    public Usuario(int Id_USUARIO, String Usuario, String Email, String CPF_CNPJ) {
        this.ID_USUARIO = ID_USUARIO;
        this.Usuario = Usuario;
        this.Email = Email;
        this.CPF_CNPJ = CPF_CNPJ;
   
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int Id_usuario) {
        this.ID_USUARIO = ID_USUARIO;
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
