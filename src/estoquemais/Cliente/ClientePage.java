package estoquemais.Cliente;

import estoquemais.bancodedados.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ClientePage extends javax.swing.JFrame {

    ClienteNovoPage novoPage = new ClienteNovoPage();
    ClienteEditarPage editarPage = new ClienteEditarPage();
    
    public ClientePage() {
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
        setTitle("Lista de Clientes");
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
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
                "ID", "Nome", "Telefone", "E-mail", "Endereço", "Cidade", "UF", "CEP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(35);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(300);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(300);
            tabela.getColumnModel().getColumn(5).setResizable(false);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(6).setResizable(false);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(7).setResizable(false);
            tabela.getColumnModel().getColumn(7).setPreferredWidth(100);
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
        campoBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoBuscaKeyPressed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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
            JOptionPane.showMessageDialog(null,"Selecione um cliente para edição!", "Seleção Invalida", 1);
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
            int x = JOptionPane.showOptionDialog(null, "Voce deseja excluir este cliente?","Atenção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(x == 0){
                String sql = "DELETE from cliente where id = " + valor + ";";
                Conexao.executaSQL(sql);
                tabela();
                JOptionPane.showMessageDialog(null,"Cliente excluido com sucesso.", "Sucesso",2);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Selecione um cliente para exclusão!", "Seleção Invalida", 1);
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

    private void campoBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscaKeyPressed
        if(evt.getKeyCode() == 10){
            pesquisar(campoBusca.getText().trim());
        }
    }//GEN-LAST:event_campoBuscaKeyPressed
    
    public static void pesquisar(String texto){
        DefaultTableModel tblModel = (DefaultTableModel) tabela.getModel();
        String sql = "SELECT * from cliente WHERE nome LIKE '"+texto+"%';";
        try{
            
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            tblModel.setRowCount(0);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                String cidade = rs.getString("cidade");
                String uf = rs.getString("uf");
                String cep = rs.getString("cep");
                
                String tbData[] = {id, nome, telefone, email, endereco, cidade, uf, cep};  
                
                tblModel.addRow(tbData);
                
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public static void tabela(){
        DefaultTableModel tblModel = (DefaultTableModel) tabela.getModel();
        String sql = "SELECT * from cliente;";
        try{
            
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            tblModel.setRowCount(0);
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                String cidade = rs.getString("cidade");
                String uf = rs.getString("uf");
                String cep = rs.getString("cep");
                
                String tbData[] = {id, nome, telefone, email, endereco, cidade, uf, cep};  
                
                tblModel.addRow(tbData);
                
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void editar(String texto){
        
        String sql = "SELECT * from cliente WHERE nome LIKE '"+texto+"%';";
        try{
            
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");
                String cidade = rs.getString("cidade");
                String uf = rs.getString("uf");
                String cep = rs.getString("cep");
                
                editarPage.idT = id;
                editarPage.textFieldNome.setText(nome);
                editarPage.textFieldTelefone.setText(telefone);
                editarPage.textFieldCidade.setText(cidade);
                editarPage.textFieldEmail.setText(email);
                editarPage.textFieldCep.setText(cep);
                editarPage.textFieldEndereco.setText(endereco);
                editarPage.comboBoxUf.setSelectedItem(uf);
               
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(ClientePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientePage().setVisible(true);
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
