package estoquemais.Produto;

import estoquemais.bancodedados.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ProdutoNovoPage extends javax.swing.JFrame {

    public ProdutoNovoPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoValorVenda = new javax.swing.JTextField();
        campoValorUnt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboFornecedor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(500, 195));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
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

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 195));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 195));

        jLabel1.setText("Nome:");

        jLabel4.setText("Fornecedor:");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/newicon.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(100, 40));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/deletedbicon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 40));
        btnCancelar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor Custo Uni.:");

        jLabel3.setText("Valor de Venda:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboFornecedor, 0, 350, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoValorUnt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(campoValorVenda))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoNome))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoValorUnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        ProdutoPage.tabela();
        limpaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        verificaCampos();
        ProdutoPage.tabela();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizaComboForn();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        atualizaComboForn();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizaComboForn();
    }//GEN-LAST:event_formWindowActivated
    
    public void atualizaComboForn(){
        String sql = "SELECT * from fornecedor;";
        
        try{
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            comboFornecedor.removeAllItems();
            while(rs.next()){
                String razaoSocial = rs.getString("razaoSocial");
                comboFornecedor.addItem(razaoSocial);
                comboFornecedor.setSelectedIndex(-1);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } 
    }
    
    public void limpaCampos(){
        campoNome.setText("");
        comboFornecedor.setSelectedIndex(-1);
        campoNome.requestFocus();
        campoValorUnt.setText("");
        campoValorVenda.setText("");
    }
    
    public void cadastraCampos() {
        String sql = "INSERT INTO produto (`nome`, `fornecedor`, `quantidade`, `valorUnt`, `valorVenda`) VALUES ('"+
                campoNome.getText().trim()+"', '"+
                comboFornecedor.getSelectedItem().toString()+"', 0,'"+
                Float.parseFloat(campoValorUnt.getText())+"', '" +
                Float.parseFloat(campoValorVenda.getText()) + "');";
        Conexao.executaSQL(sql);
        JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Sucesso", 1);
    }
    
    public void verificaCampos(){
        if(campoNome.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um nome para o produto", "Campo Obrigatório", 0);
        }
        else if(comboFornecedor.getSelectedIndex() == -1){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um fornecedor para o produto", "Campo Obrigatório", 0);
        }
        else if(campoValorUnt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira um valor de compra para o produto", "Campo Obrigatório", 0);  
        }
        else if(campoValorVenda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insira um valor de venda para o produto", "Campo Obrigatório", 0); 
        } else {
            cadastraCampos();
            limpaCampos();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoNovoPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoValorUnt;
    private javax.swing.JTextField campoValorVenda;
    private javax.swing.JComboBox<String> comboFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
