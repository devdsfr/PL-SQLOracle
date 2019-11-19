/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import model.Cliente;
import connection.ConnectionFactory;

/**
 *
 * @author thiago
 */
public class ClienteDao {
    public int incluirDao(Cliente cliente){
        ConnectionFactory c = new ConnectionFactory();
        
        try {
            c.conectar();
            String sql = "INSERT INTO TBL(NOME) VALUES (" + cliente.getNome_ou_razao_social() + ");";
            return c.insertSQL(sql);
        } catch (Exception e) {
            System.err.println(e);
            return 0;
        } finally{
            c.fecharConexao();
        }
        
    }
    
}
