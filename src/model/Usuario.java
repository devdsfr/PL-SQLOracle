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
   private int CPF_CNPJ;

    public Usuario(int Id_usuario, String Usuario, String Email, int CPF_CNPJ) {
        this.Id_usuario = Id_usuario;
        this.Usuario = Usuario;
        this.Email = Email;
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(int CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }
   
   
    
}
