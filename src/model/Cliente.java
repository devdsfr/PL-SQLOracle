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
public class Cliente {
    private int Id_cliente;
    private String Nome_ou_razao_social;
    private String SobreNome_ou_NomeFantasia;
    private String Cpf;
    private String Cnpj;
    private String Nome;
    private String Sobre_Nome;
    private String Pesquisa;


    public Cliente(int Id_cliente,String Nome_ou_razao_social, String SobreNome_ou_NomeFantasia, String Cpf, String Cnpj,
            String Nome, String Sobre_Nome, String Pesquisa) {
       this.Id_cliente = Id_cliente;
        this.Nome_ou_razao_social = Nome_ou_razao_social;
        this.SobreNome_ou_NomeFantasia = SobreNome_ou_NomeFantasia;
        this.Cpf = Cpf;
        this.Cnpj = Cnpj;
        this.Nome = Nome;
        this.Sobre_Nome = Sobre_Nome;
        this.Pesquisa = Pesquisa;
    }

    public Cliente() {
      
    }
    public int getId_cliente(){
        return Id_cliente;
    }
    public void setId_cliente(int Id_cliente){
        this.Id_cliente = Id_cliente;
    }

    public String getNome_ou_razao_social() {
        return Nome_ou_razao_social;
    }

    public void setNome_ou_razao_social(String Nome_ou_razao_social) {
        this.Nome_ou_razao_social = Nome_ou_razao_social;
    }

    public String getSobreNome_ou_NomeFantasia() {
        return SobreNome_ou_NomeFantasia;
    }

    public void setSobreNome_ou_NomeFantasia(String SobreNome_ou_NomeFantasia) {
        this.SobreNome_ou_NomeFantasia = SobreNome_ou_NomeFantasia;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
     public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }
       public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobre_Nome() {
        return Sobre_Nome;
    }

    public void setSobre_Nome(String Sobre_Nome) {
        this.Sobre_Nome = Sobre_Nome;
    }
    public String getPesquisa() {
        return Pesquisa;
    }

    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }
    
}
