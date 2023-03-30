package estoquemais;

import estoquemais.Cliente.ClientePage;
import estoquemais.Fornecedor.FornecedorPage;
import estoquemais.Produto.ProdutoPage;
import estoquemais.Venda.VendaPage;
import estoquemais.bancodedados.Conexao;
import estoquemais.Compra.CompraPage;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.Connection;
import java.sql.DriverManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperCompileManager;
 
import net.sf.jasperreports.view.JasperViewer;

public class FrontPage extends javax.swing.JFrame {

    FornecedorPage fornecedorPage = new FornecedorPage();
    ClientePage clientePage = new ClientePage();
    ProdutoPage produtoPage = new ProdutoPage();
    VendaPage vendaPage = new VendaPage();
    CompraPage compraPage = new CompraPage();
    
    public FrontPage() {
        initComponents();
        Conexao.criaDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnFornecedor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estoque+");
        setMinimumSize(new java.awt.Dimension(700, 400));

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanel1.setName("Estoque+"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/fornecedoricon.png"))); // NOI18N
        btnFornecedor.setText("Fornecedores");
        btnFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFornecedor.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnFornecedor.setMaximumSize(new java.awt.Dimension(120, 100));
        btnFornecedor.setMinimumSize(new java.awt.Dimension(120, 100));
        btnFornecedor.setName("btnFornecedor"); // NOI18N
        btnFornecedor.setPreferredSize(new java.awt.Dimension(120, 100));
        btnFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/clienteicon.png"))); // NOI18N
        btnCliente.setText("Clientes");
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliente.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnCliente.setMaximumSize(new java.awt.Dimension(120, 100));
        btnCliente.setMinimumSize(new java.awt.Dimension(120, 100));
        btnCliente.setName("btnCliente"); // NOI18N
        btnCliente.setPreferredSize(new java.awt.Dimension(120, 100));
        btnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/produtoicon.png"))); // NOI18N
        btnProduto.setText("Produtos");
        btnProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProduto.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnProduto.setMaximumSize(new java.awt.Dimension(120, 100));
        btnProduto.setMinimumSize(new java.awt.Dimension(120, 100));
        btnProduto.setName("btnProduto"); // NOI18N
        btnProduto.setPreferredSize(new java.awt.Dimension(120, 100));
        btnProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/compraicon.png"))); // NOI18N
        btnCompra.setText("Compras");
        btnCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompra.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnCompra.setMaximumSize(new java.awt.Dimension(120, 100));
        btnCompra.setMinimumSize(new java.awt.Dimension(120, 100));
        btnCompra.setName("btnCompra"); // NOI18N
        btnCompra.setPreferredSize(new java.awt.Dimension(120, 100));
        btnCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/vendaicon.png"))); // NOI18N
        btnVenda.setText("Vendas");
        btnVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenda.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnVenda.setMaximumSize(new java.awt.Dimension(120, 100));
        btnVenda.setMinimumSize(new java.awt.Dimension(120, 100));
        btnVenda.setName("btnVenda"); // NOI18N
        btnVenda.setPreferredSize(new java.awt.Dimension(120, 100));
        btnVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/logo.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/relatorioicon.png"))); // NOI18N
        jButton1.setText("Relatório");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Estoque+");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        compraPage.setVisible(true);
    }//GEN-LAST:event_btnCompraActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        fornecedorPage.setVisible(true);
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        clientePage.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        produtoPage.setVisible(true);
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        vendaPage.setVisible(true);
    }//GEN-LAST:event_btnVendaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con =     DriverManager.getConnection("jdbc:mariadb://localhost:3306/controleestoque","root","asd");
            String reportPath = "src\\report\\Compra.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jr,null, con);
            JasperViewer.viewReport(jp);
            con.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Flat Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrontPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
