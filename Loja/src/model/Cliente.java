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
    private int Id_vendas;
    private String Nome_ou_razao_social;
    private String SobreNome_ou_NomeFantasia;
    private int Cpf_Cnpj;

    public Cliente(int Id_vendas, String Nome_ou_razao_social, String SobreNome_ou_NomeFantasia, int Cpf_Cnpj) {
        this.Id_vendas = Id_vendas;
        this.Nome_ou_razao_social = Nome_ou_razao_social;
        this.SobreNome_ou_NomeFantasia = SobreNome_ou_NomeFantasia;
        this.Cpf_Cnpj = Cpf_Cnpj;
    }

    public int getId_vendas() {
        return Id_vendas;
    }

    public void setId_vendas(int Id_vendas) {
        this.Id_vendas = Id_vendas;
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

    public int getCpf_Cnpj() {
        return Cpf_Cnpj;
    }

    public void setCpf_Cnpj(int Cpf_Cnpj) {
        this.Cpf_Cnpj = Cpf_Cnpj;
    }
    
    
    
}
