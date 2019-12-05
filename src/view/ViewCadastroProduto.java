/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.ProdutoDao;
import connection.ConnectionFactory;
import static java.awt.SystemColor.control;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.scene.control.Control;
import javax.swing.JOptionPane;
import model.ModeloTabela;
import model.BensProduto;
import model.ModelTabela;
import connection.ConexaoBD;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class ViewCadastroProduto extends javax.swing.JFrame {
    ConexaoBD conex = new ConexaoBD();
    BensProduto mod = new BensProduto();
    ProdutoDao dao = new ProdutoDao();
    
    int resposta =0;

    private static void setModel(ModeloTabela tableModel) {
      
    }

    //ModeloTabela TableModel = new ModeloTabela();
    private Connection stmt;
    private String sql;
    
    public ViewCadastroProduto() {
        initComponents();
        preencherTabela ("SELECT * FROM PRODUTO ORDER BY ID_PRODUTO");
       // edtListaProduto.setModel(TableModel);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtListaProduto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        edtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtTotal = new javax.swing.JTextField();
        edtConsultar = new javax.swing.JButton();
        edtPesquisa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        edtSalvar = new javax.swing.JButton();
        edtEditar = new javax.swing.JButton();
        edtExcluir = new javax.swing.JButton();
        edtCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        jLabel1.setText("Codigo:");

        edtListaProduto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        edtListaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        edtListaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtListaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(edtListaProduto);

        jLabel2.setText("Descrição:");

        edtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor:");

        jLabel4.setText("Total:");

        edtConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/incons/loupe.png"))); // NOI18N
        edtConsultar.setText("Consultar");
        edtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(edtConsultar)
                                    .addGap(18, 18, 18)
                                    .addComponent(edtPesquisa))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(edtDescricao))
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtConsultar)
                    .addComponent(edtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));

        edtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/incons/btn-salvar.png"))); // NOI18N
        edtSalvar.setText("SALVAR");
        edtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtSalvarActionPerformed(evt);
            }
        });

        edtEditar.setText("INCLUIR");
        edtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEditarActionPerformed(evt);
            }
        });

        edtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/incons/btn-excluir.png"))); // NOI18N
        edtExcluir.setText("EXCLUIR");
        edtExcluir.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                edtExcluirComponentRemoved(evt);
            }
        });
        edtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtExcluirActionPerformed(evt);
            }
        });

        edtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/incons/sair-menu-2.png"))); // NOI18N
        edtCancelar.setText("SAIR");
        edtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edtEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(edtSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(edtSalvar)
                .addGap(18, 18, 18)
                .addComponent(edtExcluir)
                .addGap(18, 18, 18)
                .addComponent(edtEditar)
                .addGap(18, 18, 18)
                .addComponent(edtCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    
            
    private void edtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEditarActionPerformed
        // :
        
    }//GEN-LAST:event_edtEditarActionPerformed

    private void edtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_edtCancelarActionPerformed

    private void edtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtExcluirActionPerformed
        //Metodo excluir dados.
      resposta = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente excluir ?");
       if (resposta == JOptionPane.YES_OPTION) {
      mod.setID_PRODUTO(Integer.parseInt(edtCodigo.getText()));
      dao.delete(mod);
      
      //Metodo Limpar campo
      edtValor.setText("");
      edtDescricao.setText("");
      edtTotal.setText("");
      edtCodigo.setText("");
       }
        
    }//GEN-LAST:event_edtExcluirActionPerformed

    private void edtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtSalvarActionPerformed
      //Salvar os dados do produto.
      
        BensProduto produto = new BensProduto();
      ProdutoDao produtos = new ProdutoDao();
      //ModeloTabela p = new ModeloTabela();
      
      //produto.setID_PRODUTO(Integer.parseInt(edtCodigo.getText()));
      produto.setDescricao(edtDescricao.getText());
      produto.setValor(Double.parseDouble(edtValor.getText()));
      produto.setTotal(Integer.parseInt(edtTotal.getText()));
      produtos.save(produto);
      
      //Metodo Limpar campo
      edtValor.setText("");
      edtDescricao.setText("");
      edtTotal.setText("");
      preencherTabela ("SELECT * FROM PRODUTO ORDER BY ID_PRODUTO");
      
     // ProdutoTableModel.addRow();

    }//GEN-LAST:event_edtSalvarActionPerformed

    private void edtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDescricaoActionPerformed

    private void edtExcluirComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_edtExcluirComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_edtExcluirComponentRemoved

    public void preencherTabela (String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String [] {"Codigo","Descrição","Valor","Total"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("ID_PRODUTO"),conex.rs.getString("DESCRICAO"),conex.rs.getDouble("VALOR"),conex.rs.getDouble("TOTAL")});
                
            }while(conex.rs.next());
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane,"Erro ao preencher o ArrayList"+ex);
            }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        edtListaProduto.setModel(modelo);
        edtListaProduto.getColumnModel().getColumn(0).setPreferredWidth(150);
        edtListaProduto.getColumnModel().getColumn(0).setResizable(false);
        
        edtListaProduto.getColumnModel().getColumn(1).setPreferredWidth(160);
        edtListaProduto.getColumnModel().getColumn(1).setResizable(false);
        
        edtListaProduto.getColumnModel().getColumn(2).setPreferredWidth(150);
        edtListaProduto.getColumnModel().getColumn(2).setResizable(false);
        
        edtListaProduto.getColumnModel().getColumn(3).setPreferredWidth(150);
        edtListaProduto.getColumnModel().getColumn(3).setResizable(false);
        
        edtListaProduto.getTableHeader().setReorderingAllowed(false);
        edtListaProduto.setAutoResizeMode(edtListaProduto.AUTO_RESIZE_OFF);
        edtListaProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        conex.desconectar();
    }
    private void edtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtConsultarActionPerformed
        //Metodo de Consultar.
      //ProdutoDao dao = new ProdutoDao();
        //BensProduto mod = new BensProduto();
        //mod.setPesquisa(edtPesquisa.getText());
        //edtConsultar
        //edtCodigo.setText(String.valueOf(model.getID_PRODUTO()));
        //edtDescricao.setText(model.getDescricao());
        //edtValor.setText(String.valueOf(model.getValor()));
        //edtTotal.setText(String.valueOf(model.getValor()));
    }//GEN-LAST:event_edtConsultarActionPerformed

    private void edtListaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtListaProdutoMouseClicked
        //Metodo de selecionar os dados.
        String ID_PRODUTO = ""+ edtListaProduto.getValueAt(edtListaProduto.getSelectedRow(), 1);
        //conex.conexao();
        //conex.executaSql("SELECT * FROM  PRODUTO WHERE ID_PRODUTO='" + ID_PRODUTO + "'");
        //try{
            //conex.rs.first();
            //edtCodigo.setText(String.valueOf(conex.rs.getInt("ID_PRODUTO")));
            //edtDescricao.setText(conex.rs.getString("DESCRICAO"));
            //edtValor.setText(String.valueOf(conex.rs.getDouble("VALOR")));
          //  edtTotal.setText(String.valueOf(conex.rs.getDouble("TOTAL")));
        //}catch(SQLException ex){
          //  JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados" +ex);
        //}
        
        
        //conex.desconectar();

// Metodo para selecionar produto dentro tabela produt para excluir.
   if (edtListaProduto.getSelectedRow() != -1){
        
     edtCodigo.setText(edtListaProduto.getValueAt(edtListaProduto.getSelectedRow(), 0).toString());
     edtDescricao.setText(edtListaProduto.getValueAt(edtListaProduto.getSelectedRow(), 1).toString());
     edtValor.setText(edtListaProduto.getValueAt(edtListaProduto.getSelectedRow(), 2).toString());
     edtTotal.setText(edtListaProduto.getValueAt(edtListaProduto.getSelectedRow(), 3).toString());
      
    
       }
    
    }//GEN-LAST:event_edtListaProdutoMouseClicked
    //Metodo para excluir cadastro.
    //private void excluir cadastro();

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BensProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BensProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BensProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BensProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edtCancelar;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JButton edtConsultar;
    private javax.swing.JTextField edtDescricao;
    private javax.swing.JButton edtEditar;
    private javax.swing.JButton edtExcluir;
    private javax.swing.JTable edtListaProduto;
    private javax.swing.JTextField edtPesquisa;
    private javax.swing.JButton edtSalvar;
    private javax.swing.JTextField edtTotal;
    private javax.swing.JTextField edtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void readJTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //private static class jTProdutos {

      //  private static void setModel(ProdutoTableModel tableModel) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        //public jTProdutos() {
        
    

