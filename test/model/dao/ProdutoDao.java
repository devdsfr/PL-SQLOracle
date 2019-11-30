/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.SQLException;
import model.Produto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ProdutoDao {

    public ProdutoDao() {
    }

    @Test
    //@Ignore
    public void inserir() {

        Produto produto = new Produto("Roupas");
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

        Produto pro = new Produto("Roupa");
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

        Produto pro = new Produto("Roupa");
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

        for (Produto p : dao.findAll()) {
            System.out.println("Descrição: " + p.getDescricao());
        }
    }

    private boolean save(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fail(String erro_ao_salvar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean update(Produto pro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean delete(Produto pro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Iterable<Produto> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
