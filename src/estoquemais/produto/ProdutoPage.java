package estoquemais.Produto;

import estoquemais.bancodedados.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ProdutoPage extends javax.swing.JFrame {

    ProdutoNovoPage novoPage = new ProdutoNovoPage();
    ProdutoEditarPage editarPage = new ProdutoEditarPage();
    
    public ProdutoPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        campoBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Produtos");
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/newicon.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setPreferredSize(new java.awt.Dimension(80, 35));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/editicon.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(80, 35));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/deletedbicon.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setPreferredSize(new java.awt.Dimension(80, 35));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Fornecedor", "Valor Unitário", "Valor Venda", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabelaFocusGained(evt);
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(35);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(35);
            tabela.getColumnModel().getColumn(0).setMaxWidth(35);
            tabela.getColumnModel().getColumn(1).setMinWidth(200);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabela.getColumnModel().getColumn(1).setMaxWidth(200);
            tabela.getColumnModel().getColumn(2).setMinWidth(76);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(76);
            tabela.getColumnModel().getColumn(2).setMaxWidth(76);
            tabela.getColumnModel().getColumn(3).setMinWidth(125);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(125);
            tabela.getColumnModel().getColumn(3).setMaxWidth(125);
            tabela.getColumnModel().getColumn(4).setMinWidth(85);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(85);
            tabela.getColumnModel().getColumn(4).setMaxWidth(85);
            tabela.getColumnModel().getColumn(5).setMinWidth(75);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(75);
            tabela.getColumnModel().getColumn(5).setMaxWidth(75);
            tabela.getColumnModel().getColumn(6).setMinWidth(77);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(77);
            tabela.getColumnModel().getColumn(6).setMaxWidth(77);
        }

        campoBusca.setText("Buscar...");
        campoBusca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoBuscaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoBuscaFocusLost(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/buscaicon.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoBusca)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tabela.getSelectedRow();
        int coluna = 1;
       
        if(linha != -1){
            String valor = tabela.getModel().getValueAt(linha, coluna).toString();
            editarPage.setVisible(true);
            editar(valor);
            
        } else {
            JOptionPane.showMessageDialog(null,"Selecione um produto para edição!", "Seleção Invalida", 1);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novoPage.setVisible(true);
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tabela();
    }//GEN-LAST:event_formWindowOpened

    private void tabelaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaFocusGained
        
    }//GEN-LAST:event_tabelaFocusGained

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabela.getSelectedRow();
        int coluna = 0;
        
        if(linha != -1){
            String valor = tabela.getModel().getValueAt(linha, coluna).toString();
            
            String[] options = {"Sim", "Não"};
            int x = JOptionPane.showOptionDialog(null, "Voce deseja excluir este produto?","Atenção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(x == 0){
                String sql = "DELETE from produto where id = " + valor + ";";
                Conexao.executaSQL(sql);
                tabela();
                JOptionPane.showMessageDialog(null,"Produto excluido com sucesso.", "Sucesso",2);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Selecione um produto para exclusão!", "Seleção Invalida", 1);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void campoBuscaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoBuscaFocusGained
        campoBusca.setText("");
    }//GEN-LAST:event_campoBuscaFocusGained

    private void campoBuscaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoBuscaFocusLost
        if ("".equals(campoBusca.getText())){
            campoBusca.setText("Buscar...");
        }
    }//GEN-LAST:event_campoBuscaFocusLost

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if("Buscar...".equals(campoBusca.getText())){
            tabela();
            
        }else{
            pesquisar(campoBusca.getText());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        tabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        tabela();
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        tabela();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        tabela();
    }//GEN-LAST:event_formWindowClosing
    
    public static void pesquisar(String texto){
        DefaultTableModel tblModel = (DefaultTableModel) tabela.getModel();
        String sql = "SELECT * from produto WHERE nome LIKE '"+texto+"%';";
        try{
            
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            tblModel.setRowCount(0);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String nome = rs.getString("nome");
                String quantidade = rs.getString("quantidade");
                String fornecedor = rs.getString("fornecedor");
                
                
                String tbData[] = {id, nome, quantidade, fornecedor};  
                
                tblModel.addRow(tbData);
                
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public static void tabela(){
        DefaultTableModel tblModel = (DefaultTableModel) tabela.getModel();
        String sql = "SELECT * from produto;";
        try{
            
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            tblModel.setRowCount(0);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String nome = rs.getString("nome");
                int quantidade = rs.getInt("quantidade");
                String fornecedor = rs.getString("fornecedor");
                float valorUnt = rs.getFloat("valorUnt");
                float valorVenda = rs.getFloat("valorVenda");
                
                float valorTotal = quantidade * valorUnt;
               
                Object tbData[] = {id, nome, quantidade, fornecedor, valorUnt, valorVenda, valorTotal};  
                
                tblModel.addRow(tbData);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void editar(String texto){
        String sql = "SELECT * from produto WHERE nome LIKE '"+texto+"%';";
        try{
            
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String fornecedor = rs.getString("fornecedor");
                float valorUnt = rs.getFloat("valorUnt");
                float valorVenda = rs.getFloat("valorVenda");
                
                String campoValorUnt = String.valueOf(valorUnt);
                String campoValorVenda = String.valueOf(valorVenda);
   
                editarPage.idT = id;
                editarPage.txtNome.setText(nome);
                editarPage.nomeFornecedor = fornecedor;
                editarPage.campoValorUnt.setText(campoValorUnt);
                editarPage.campoValorVenda.setText(campoValorVenda);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
