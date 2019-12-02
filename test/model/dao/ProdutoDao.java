/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import model.BensProduto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ProdutoDao {

    public ProdutoDao() {
    }

    @Test
    //@Ignore
    public void inserir() {

        BensProduto produto = new BensProduto("Roupas");
        ProdutoDao dao = new ProdutoDao();

        if (dao.save(produto)) {
            System.out.println("Salvo com sucesso");
        } else {
            fail("Erro ao salvar");
        }
    }

    //@Test
    @Ignore
    public void atualizar() {

        BensProduto pro = new BensProduto("Roupa");
        pro.setDescricao();
        ProdutoDao dao = new ProdutoDao();

        if (dao.update(pro)) {
            System.out.println("Atualização realizada com sucesso!");
        } else {
            fail("Erro ao salvar");
        }
    }

    //@Test
    @Ignore
    public void deletar() {

        BensProduto pro = new BensProduto("Roupa");
        pro.setID_PRODUTO(1);

        ProdutoDao dao = new ProdutoDao();

        if (dao.delete(pro)) {
            System.out.println("Deletado com sucesso!");
        } else {
            fail("Erro ao deletar");
        }
    }

    //@Test
    @Ignore
    public void listar() throws SQLException {
        ProdutoDao dao = new ProdutoDao();

        for (BensProduto p : dao.findAll()) {
            System.out.println("Descrição: " + p.getDescricao());
        }
    }

    private boolean save(BensProduto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fail(String erro_ao_salvar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean update(BensProduto pro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean delete(BensProduto pro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Iterable<BensProduto> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
