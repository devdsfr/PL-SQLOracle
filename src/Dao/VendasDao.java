/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.BensProduto;
import connection.ConexaoBD;
import model.Vendas;
import model.Cliente;

public class VendasDao {

    Cliente cli = new Cliente();
    ConexaoBD conex = new ConexaoBD();
    BensProduto mod = new BensProduto();
    private Connection con = null;

    public VendasDao() {
        con = ConnectionFactory.getConnection();
    }

    public void save(Vendas vendas) {

        String sql = "INSERT INTO VENDAS (DATA_VENDAS, ID_CLIENTE, ID_PRODUTO, TOTAL_BRUTO, DESCONTO, TOTAL_LIQUIDO, CPF_CNPJ) VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, vendas.getData_vendas());
            stmt.setInt(2, vendas.getId_Cliente());
            stmt.setInt(3, vendas.getId_Produto());
            stmt.setDouble(4, vendas.getTotal_Bruto());
            stmt.setDouble(5, vendas.getDesconto());
            stmt.setDouble(6, vendas.getTotal_Liquido());
            stmt.setString(7, vendas.getCPF_CNPJ());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar Compra" + ex);
        } finally {
            //ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Vendas> findAll() {

        String sql = "SELECT * FROM VENDAS";

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Vendas> Vendas = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Vendas vendas = new Vendas();
                vendas.setData_vendas(rs.getString("VENDAS"));
                vendas.add(vendas);
            }
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return Vendas;
    }

    public boolean update(Vendas vendas) {

        String sql = "UPDATE VENDAS SET descricao = ? WHERE id = ?";

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, vendas.getId_Vendas());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public boolean delete(Vendas vendas) {

        String sql = "DELETE FROM VENDAS WHERE id =  ?";

        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, vendas.getId_Vendas());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void buscarCliente(Cliente mod) {
        conex.conexao();
        PreparedStatement stmt = null;
        conex.executaSql("SELECT * FROM CLIENTE WHERE NOME_OU_RAZAO_SOCIAL=?, NOME=?");

        try {

            conex.rs.first();
            cli.setId_cliente(conex.rs.getInt("ID_CLIENTE"));
            cli.setNome_ou_razao_social(conex.rs.getString("NOME_OU_RAZAO_SOCIAL"));
            cli.setSobreNome_ou_NomeFantasia(conex.rs.getString("SOBRENOME_NOME_FANTASIA"));
            cli.setCnpj(conex.rs.getString("CNPJ"));
            cli.setNome(conex.rs.getString("NOME"));
            cli.setSobre_Nome(conex.rs.getString("SOBRE_NOME"));
            cli.setCpf(conex.rs.getString("CPF"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto." + ex);
        }
        //conex.desconectar();

    }

}
