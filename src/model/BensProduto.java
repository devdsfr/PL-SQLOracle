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
public class BensProduto {

    
   
    
    private int ID_PRODUTO;
    private String Descricao;
    private double Valor;
    private int Total;
    private String Pesquisa;

    public BensProduto() {
     
    }
    
    public void produto(){
    
    }

    public BensProduto(int ID_PRODUTO, String Descricao, double Valor, int Total, String Pesquisa) {
        this.ID_PRODUTO = ID_PRODUTO;
        this.Descricao = Descricao;
        this.Valor = Valor;
        this.Total = Total;
        this.Pesquisa = Pesquisa;
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

    public void setTotal(int Total) {
        this.Total = Total;
    }
  public String getPesquisa() {
        return Pesquisa;
    }
    public void setPesquisa(String pesquisa) {
        this.Pesquisa = pesquisa;
    }
    

    public void setDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(BensProduto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
