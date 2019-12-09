/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author thiago
 */
public class Vendas {

    private int Id_Vendas;
    private String data_vendas;
    private int Id_Produto;
    private int Id_Cliente;
    private int CodigoCli;
    private double Total_Bruto;
    private double Desconto;
    private double Total_Liquido;
    private String CPF_CNPJ;

    public Vendas(int Id_Vendas, String data_vendas, int Id_Produto, int Id_Cliente, int CodigoCli, double Total_Bruto, double Desconto, double Total_Liquido, String CPF_CNPJ) {
        this.Id_Vendas = Id_Vendas;
        this.data_vendas = data_vendas;
        this.Id_Produto = Id_Produto;
        this.Id_Cliente = Id_Cliente;
        this.CodigoCli = CodigoCli;
        this.Total_Bruto = Total_Bruto;
        this.Desconto = Desconto;
        this.Total_Liquido = Total_Liquido;
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public Vendas() {

    }

    public void Vendas() {
    }

    public int getId_Vendas() {
        return Id_Vendas;
    }

    public void setId_Vendas(int Id_Vendas) {
        this.Id_Vendas = Id_Vendas;
    }

    public String getData_vendas() {
        return data_vendas;
    }

    public void setData_vendas(String data_vendas) {
        this.data_vendas = data_vendas;
    }

    public int getId_Produto() {
        return Id_Produto;
    }

    public void setId_Produto(int Id_Produto) {
        this.Id_Produto = Id_Produto;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }
     public int getCodigoCli() {
        return CodigoCli;
    }

    public void setCodigoCli(int CodigoCli) {
        this.CodigoCli = CodigoCli;
    }

    public double getTotal_Bruto() {
        return Total_Bruto;
    }

    public void setTotal_Bruto(double Total_Bruto) {
        this.Total_Bruto = Total_Bruto;
    }

    public double getDesconto() {
        return Desconto;
    }

    public void setDesconto(double Desconto) {
        this.Desconto = Desconto;
    }

    public double getTotal_Liquido() {
        return Total_Liquido;
    }

    public void setTotal_Liquido(double Total_Liquido) {
        this.Total_Liquido = Total_Liquido;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public void add(Vendas vendas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
