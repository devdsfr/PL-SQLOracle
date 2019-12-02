/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author thiago
 */
public class ModeloTabela extends AbstractTableModel{

    
    
    
    private List<BensProduto> dados = new ArrayList<>();
    private String[] colunas = {"Descrição","Valor","Total"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getDescricao();
            case 1:
                return dados.get(linha).getValor();
            case 2:
                return dados.get(linha).getTotal();
        }
        return null;
    }
    
    public void addRow (BensProduto p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    public void removeRow (int linha){
      this.dados.remove(linha);
      this.fireTableRowsDeleted(linha, linha);
    }
    
    
} 