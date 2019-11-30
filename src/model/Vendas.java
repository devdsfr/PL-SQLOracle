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
public class Vendas {
    
    private int Id_Vendas;
    private Double data_vendas;
    private int Id_produto;
    private double Total_Bruto;
    private double Desconto;
    private double Total_Liquido;

    public Vendas(int Id_Vendas, Double data_vendas, int Id_produto, double Total_Bruto, double Desconto, double Total_Liquido) {
        this.Id_Vendas = Id_Vendas;
        this.data_vendas = data_vendas;
        this.Id_produto = Id_produto;
        this.Total_Bruto = Total_Bruto;
        this.Desconto = Desconto;
        this.Total_Liquido = Total_Liquido;
    }

    public Vendas() {
       
    }
    public void Vendas(){
        
    }

    public int getId_Vendas() {
        return Id_Vendas;
    }

    public void setId_Vendas(int Id_Vendas) {
        this.Id_Vendas = Id_Vendas;
    }

    public Double getData_vendas() {
        return data_vendas;
    }

    public void setData_vendas(Double data_vendas) {
        this.data_vendas = data_vendas;
    }

    public int getId_produto() {
        return Id_produto;
    }

    public void setId_produto(int Id_produto) {
        this.Id_produto = Id_produto;
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

    public void add(Vendas vendas) {
       
    }

    public void setVisible(boolean b) {
       
    }
    
    
    
}
