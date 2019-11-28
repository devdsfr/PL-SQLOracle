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
public class Produto {
    private int ID_PRODUTO;
    private String Descricao;
    private double Valor;
    private double Total;

    public Produto() {
     
    }
    
    public void produto(){
    
    }

    public Produto(int ID_PRODUTO, String Descricao, double Valor) {
        this.ID_PRODUTO = ID_PRODUTO;
        this.Descricao = Descricao;
        this.Valor = Valor;
        this.Total = Total;
    }

    public int getID_PRODUTO() {
        return ID_PRODUTO;
    }

    public void setID_PRODUTO(int ID_PRODUTO) {
        this.ID_PRODUTO = ID_PRODUTO;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    

    public void setDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
