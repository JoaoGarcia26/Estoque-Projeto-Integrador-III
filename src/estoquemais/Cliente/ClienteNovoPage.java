package estoquemais.Cliente;

import estoquemais.bancodedados.Conexao;
import javax.swing.JOptionPane;

public class ClienteNovoPage extends javax.swing.JFrame {

    public ClienteNovoPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldCidade = new javax.swing.JTextField();
        textFieldEndereco = new javax.swing.JTextField();
        labelCEP = new javax.swing.JLabel();
        labelUF = new javax.swing.JLabel();
        textFieldCep = new javax.swing.JTextField();
        comboBoxUf = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cliente");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        labelNome.setText("Nome:");
        labelNome.setPreferredSize(new java.awt.Dimension(52, 22));

        labelEmail.setText("E-mail:");
        labelEmail.setPreferredSize(new java.awt.Dimension(52, 22));

        labelTelefone.setText("Telefone:");
        labelTelefone.setPreferredSize(new java.awt.Dimension(52, 22));

        labelCidade.setText("Cidade:");
        labelCidade.setPreferredSize(new java.awt.Dimension(52, 22));

        labelEndereco.setText("Endereço:");
        labelEndereco.setPreferredSize(new java.awt.Dimension(52, 22));

        textFieldNome.setPreferredSize(new java.awt.Dimension(400, 22));

        textFieldEmail.setPreferredSize(new java.awt.Dimension(400, 22));

        textFieldTelefone.setPreferredSize(new java.awt.Dimension(180, 22));

        textFieldCidade.setPreferredSize(new java.awt.Dimension(180, 22));

        textFieldEndereco.setPreferredSize(new java.awt.Dimension(400, 22));

        labelCEP.setText("CEP:");
        labelCEP.setPreferredSize(new java.awt.Dimension(35, 22));

        labelUF.setText("UF:");
        labelUF.setPreferredSize(new java.awt.Dimension(35, 22));

        textFieldCep.setPreferredSize(new java.awt.Dimension(155, 22));

        comboBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Escolha o estado>", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        comboBoxUf.setPreferredSize(new java.awt.Dimension(155, 22));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/newicon.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/deletedbicon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(textFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(comboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        ClientePage.tabela();
        limpaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        verificaCampos();
        ClientePage.tabela();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public void limpaCampos(){
        textFieldNome.setText("");
        textFieldEmail.setText("");
        textFieldEndereco.setText("");
        textFieldCidade.setText("");
        textFieldCep.setText("");
        comboBoxUf.setSelectedIndex(0);
        textFieldTelefone.setText("");
        textFieldNome.requestFocus();
    }
    
    public void cadastraCampos() {
        String sql = "INSERT INTO cliente (`nome`, `email`, `endereco`, `cidade`, `cep`, `uf`, `telefone`) VALUES ('"+
                textFieldNome.getText().trim()+"', '"+
                textFieldEmail.getText().trim()+"', '"+
                textFieldEndereco.getText()+"', '"+
                textFieldCidade.getText()+"', '"+
                textFieldCep.getText()+"', '"+
                comboBoxUf.getSelectedItem().toString().trim()+"', '"+
                textFieldTelefone.getText()+ "');";
        Conexao.executaSQL(sql);
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", 1);
    }
    
    public void verificaCampos(){
        if(textFieldNome.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um nome para o cliente", "Campo Obrigatório", 0);
        }
        else if(textFieldCidade.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira uma cidade para o cliente", "Campo Obrigatório", 0);
        }
        else if(textFieldTelefone.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um telefone para o cliente", "Campo Obrigatório", 0);
        }
        else if(textFieldEmail.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um e-mail para o cliente", "Campo Obrigatório", 0);
        }
        else if(textFieldEndereco.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um endereço para o cliente", "Campo Obrigatório", 0);
        }
        else if(textFieldCidade.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira uma cidade para o cliente", "Campo Obrigatório", 0);
        }
        else if("<Escolha o estado>".equals(comboBoxUf.getSelectedItem().toString().trim())){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um estado(UF) para o cliente", "Campo Obrigatório", 0);
        }
        else if(textFieldCep.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um CEP para o cliente", "Campo Obrigatório", 0);
        } else {
            cadastraCampos();
            limpaCampos();
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
            java.util.logging.Logger.getLogger(ClienteNovoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteNovoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteNovoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteNovoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteNovoPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboBoxUf;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUF;
    private javax.swing.JTextField textFieldCep;
    private javax.swing.JTextField textFieldCidade;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
