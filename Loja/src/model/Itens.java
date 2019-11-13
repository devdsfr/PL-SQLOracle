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
public class Itens {
    private int Id_itens;
    private int Id_vendas;
    private double Qtd_vendida;
    private int Id_produto;
    private double Desconto_do_item;
    private double Valor_vendas;
    private double Total_item;

    public Itens(int Id_itens, int Id_vendas, double Qtd_vendida, int Id_produto, double Desconto_do_item, double Valor_vendas, double Total_item) {
        this.Id_itens = Id_itens;
        this.Id_vendas = Id_vendas;
        this.Qtd_vendida = Qtd_vendida;
        this.Id_produto = Id_produto;
        this.Desconto_do_item = Desconto_do_item;
        this.Valor_vendas = Valor_vendas;
        this.Total_item = Total_item;
    }

    public int getId_itens() {
        return Id_itens;
    }

    public void setId_itens(int Id_itens) {
        this.Id_itens = Id_itens;
    }

    public int getId_vendas() {
        return Id_vendas;
    }

    public void setId_vendas(int Id_vendas) {
        this.Id_vendas = Id_vendas;
    }

    public double getQtd_vendida() {
        return Qtd_vendida;
    }

    public void setQtd_vendida(double Qtd_vendida) {
        this.Qtd_vendida = Qtd_vendida;
    }

    public int getId_produto() {
        return Id_produto;
    }

    public void setId_produto(int Id_produto) {
        this.Id_produto = Id_produto;
    }

    public double getDesconto_do_item() {
        return Desconto_do_item;
    }

    public void setDesconto_do_item(double Desconto_do_item) {
        this.Desconto_do_item = Desconto_do_item;
    }

    public double getValor_vendas() {
        return Valor_vendas;
    }

    public void setValor_vendas(double Valor_vendas) {
        this.Valor_vendas = Valor_vendas;
    }

    public double getTotal_item() {
        return Total_item;
    }

    public void setTotal_item(double Total_item) {
        this.Total_item = Total_item;
    }
    
    
    
}
