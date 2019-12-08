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
   private String CPF;
   private String Senha;
  
   
   
   public Usuario(){
       
   }
   public void usuario(){
       
   }

    public Usuario(int ID_USUARIO, String Usuario, String Email, String CPF, String Senha) {
        this.ID_USUARIO = ID_USUARIO;
        this.Usuario = Usuario;
        this.Email = Email;
        this.CPF = CPF;
        this.Senha = Senha;
   
    }

    public int getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(int ID_USUARIO) {
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
     public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
   //public void add(Usuario usuario){
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

}
