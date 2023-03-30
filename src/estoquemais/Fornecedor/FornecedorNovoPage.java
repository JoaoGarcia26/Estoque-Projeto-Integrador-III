package estoquemais.Fornecedor;

import estoquemais.bancodedados.Conexao;
import javax.swing.JOptionPane;

public class FornecedorNovoPage extends javax.swing.JFrame {

    public FornecedorNovoPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoRazao = new javax.swing.JTextField();
        comboUf = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoCnpj = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoCep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setMinimumSize(new java.awt.Dimension(512, 295));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setMinimumSize(new java.awt.Dimension(512, 295));
        jPanel1.setPreferredSize(new java.awt.Dimension(512, 295));

        jLabel1.setText("Razão Social:");

        campoRazao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRazaoActionPerformed(evt);
            }
        });

        comboUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Escolha o estado>", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        comboUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUfActionPerformed(evt);
            }
        });

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/newicon.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(100, 40));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/deletedbicon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCancelar.setMinimumSize(new java.awt.Dimension(100, 40));
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel3.setText("CNPJ:");

        campoCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCnpjActionPerformed(evt);
            }
        });

        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço:");

        campoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBairroActionPerformed(evt);
            }
        });

        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });

        campoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCidadeActionPerformed(evt);
            }
        });

        jLabel5.setText("Bairro:");

        jLabel6.setText("Cidade:");

        jLabel7.setText("UF:");

        campoCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCepActionPerformed(evt);
            }
        });

        jLabel8.setText("CEP:");

        jLabel9.setText("Telefone:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboUf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoTelefone))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        FornecedorPage.tabela();
        limpaCampos();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void comboUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUfActionPerformed

    private void campoRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRazaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRazaoActionPerformed

    private void campoCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCnpjActionPerformed

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed

    private void campoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBairroActionPerformed

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCidadeActionPerformed

    private void campoCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCepActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        verificaCampos();
        FornecedorPage.tabela();
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    public void limpaCampos(){
        campoRazao.setText("");
        campoCnpj.setText("");
        campoBairro.setText("");
        campoEndereco.setText("");
        campoCidade.setText("");
        campoCep.setText("");
        comboUf.setSelectedIndex(0);
        campoTelefone.setText("");
        campoRazao.requestFocus();
    }
    
    public void cadastraCampos() {
        String sql = "INSERT INTO fornecedor (`razaosocial`, `cnpj`, `endereco`, `bairro`, `cidade`, `uf`, `cep`, `telefone`) VALUES ('"+
                campoRazao.getText().trim()+"', '"+
                campoCnpj.getText().trim()+"', '"+
                campoEndereco.getText()+"', '"+
                campoBairro.getText()+"', '"+
                campoCidade.getText()+"', '"+
                comboUf.getSelectedItem().toString().trim()+"', '"+
                campoCep.getText()+"', '"+
                campoTelefone.getText()+ "');";
        Conexao.executaSQL(sql);
        JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!", "Sucesso", 1);
    }
    
    public void verificaCampos(){
        if(campoRazao.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira uma razão social para o fornecedor", "Campo Obrigatório", 0);
        }
        else if(campoCidade.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira uma cidade para o fornecedor", "Campo Obrigatório", 0);
        }
        else if(campoTelefone.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um telefone para o fornecedor", "Campo Obrigatório", 0);
        }
        else if(campoCnpj.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um cnpj para o fornecedor", "Campo Obrigatório", 0);
        }
        else if(campoEndereco.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um endereço para o fornecedor", "Campo Obrigatório", 0);
        }
        else if(campoCidade.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira uma cidade para o fornecedor", "Campo Obrigatório", 0);
        }
        else if(campoBairro.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira uma bairro para o fornecedor", "Campo Obrigatório", 0);
        }
        else if("<Escolha o estado>".equals(comboUf.getSelectedItem().toString().trim())){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um estado(UF) para o fornecedor", "Campo Obrigatório", 0);
        }
        else if(campoCep.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um CEP para o fornecedor", "Campo Obrigatório", 0);
        } else {
            cadastraCampos();
            limpaCampos();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornecedorNovoPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campoBairro;
    private javax.swing.JTextField campoCep;
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoCnpj;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoRazao;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JComboBox<String> comboUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
