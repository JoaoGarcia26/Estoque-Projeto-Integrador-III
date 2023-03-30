package estoquemais.Compra;

import estoquemais.bancodedados.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CompraPage extends javax.swing.JFrame {

    public CompraPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        labelVFTxt = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JLabel();
        campoProduto = new javax.swing.JTextField();
        labelFornecedor = new javax.swing.JLabel();
        labelCodProduto = new javax.swing.JLabel();
        labelProduto = new javax.swing.JLabel();
        comboBoxProduto = new javax.swing.JComboBox<>();
        textFieldQuantidade = new javax.swing.JTextField();
        labelQuantidade = new javax.swing.JLabel();
        labelDataCompra = new javax.swing.JLabel();
        txtNf = new javax.swing.JTextField();
        labelNumCompra = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        txtFornecedor = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compras");
        setMinimumSize(new java.awt.Dimension(700, 400));
        setResizable(false);
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

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/saveicon.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(120, 35));
        btnSalvar.setMinimumSize(new java.awt.Dimension(120, 35));
        btnSalvar.setPreferredSize(new java.awt.Dimension(120, 35));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/newicon.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setMaximumSize(new java.awt.Dimension(120, 60));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(120, 60));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(120, 50));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Prod.", "Nome Produto", "Quantidade", "Valor Unit.", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
        }

        labelVFTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelVFTxt.setText("Valor Final:  R$");
        labelVFTxt.setMaximumSize(new java.awt.Dimension(70, 35));
        labelVFTxt.setMinimumSize(new java.awt.Dimension(70, 35));
        labelVFTxt.setPreferredSize(new java.awt.Dimension(70, 35));

        txtValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtValorTotal.setText("0,00");
        txtValorTotal.setMaximumSize(new java.awt.Dimension(150, 35));
        txtValorTotal.setMinimumSize(new java.awt.Dimension(150, 35));
        txtValorTotal.setPreferredSize(new java.awt.Dimension(150, 35));

        campoProduto.setMinimumSize(new java.awt.Dimension(100, 25));
        campoProduto.setPreferredSize(new java.awt.Dimension(100, 25));
        campoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoProdutoKeyPressed(evt);
            }
        });

        labelFornecedor.setText("Fornecedor:");
        labelFornecedor.setMaximumSize(new java.awt.Dimension(70, 20));
        labelFornecedor.setMinimumSize(new java.awt.Dimension(70, 20));
        labelFornecedor.setPreferredSize(new java.awt.Dimension(70, 20));

        labelCodProduto.setText("Cód. Produto:");
        labelCodProduto.setMaximumSize(new java.awt.Dimension(80, 20));
        labelCodProduto.setMinimumSize(new java.awt.Dimension(80, 20));
        labelCodProduto.setPreferredSize(new java.awt.Dimension(80, 20));

        labelProduto.setText("Produto:");
        labelProduto.setMaximumSize(new java.awt.Dimension(90, 20));
        labelProduto.setMinimumSize(new java.awt.Dimension(90, 20));
        labelProduto.setPreferredSize(new java.awt.Dimension(90, 20));

        comboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        comboBoxProduto.setMinimumSize(new java.awt.Dimension(300, 25));
        comboBoxProduto.setPreferredSize(new java.awt.Dimension(300, 25));
        comboBoxProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxProdutoItemStateChanged(evt);
            }
        });

        textFieldQuantidade.setMinimumSize(new java.awt.Dimension(100, 25));
        textFieldQuantidade.setPreferredSize(new java.awt.Dimension(100, 25));

        labelQuantidade.setText("Quantidade:");
        labelQuantidade.setMaximumSize(new java.awt.Dimension(90, 20));
        labelQuantidade.setMinimumSize(new java.awt.Dimension(90, 20));
        labelQuantidade.setPreferredSize(new java.awt.Dimension(90, 20));

        labelDataCompra.setText("Data Compra:");
        labelDataCompra.setMaximumSize(new java.awt.Dimension(90, 20));
        labelDataCompra.setMinimumSize(new java.awt.Dimension(90, 20));
        labelDataCompra.setPreferredSize(new java.awt.Dimension(90, 20));

        txtNf.setMinimumSize(new java.awt.Dimension(100, 25));
        txtNf.setPreferredSize(new java.awt.Dimension(100, 25));
        txtNf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNfActionPerformed(evt);
            }
        });

        labelNumCompra.setText("Nº da Nota Fiscal:");
        labelNumCompra.setMaximumSize(new java.awt.Dimension(120, 20));
        labelNumCompra.setMinimumSize(new java.awt.Dimension(120, 20));
        labelNumCompra.setPreferredSize(new java.awt.Dimension(120, 20));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estoquemais/img/deletedbicon.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(120, 60));
        btnExcluir.setMinimumSize(new java.awt.Dimension(120, 60));
        btnExcluir.setPreferredSize(new java.awt.Dimension(120, 50));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtFornecedor.setText("<Selecione um produto>");
        txtFornecedor.setMaximumSize(new java.awt.Dimension(250, 25));
        txtFornecedor.setMinimumSize(new java.awt.Dimension(250, 25));
        txtFornecedor.setPreferredSize(new java.awt.Dimension(250, 25));

        txtData.setMaximumSize(new java.awt.Dimension(150, 25));
        txtData.setMinimumSize(new java.awt.Dimension(150, 25));
        txtData.setPreferredSize(new java.awt.Dimension(150, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelVFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(labelQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNumCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNumCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVFTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizaComboProd();
        limpaTabela();
        limpaCampos();
        setData();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizaComboProd();
        setData();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        atualizaComboProd();
        limpaTabela();
        setData();
    }//GEN-LAST:event_formWindowClosing

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tabela.getSelectedRow();
        int coluna = 0;
        DefaultTableModel tblModel = (DefaultTableModel) tabela.getModel();

        if(linha != -1){
            String valor = tabela.getModel().getValueAt(linha, coluna).toString();
            String[] options = {"Sim", "Não"};
            int x = JOptionPane.showOptionDialog(null, "Voce deseja excluir este produto?","Atenção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(x == 0){
                tblModel.removeRow(tabela.getSelectedRow());
                JOptionPane.showMessageDialog(null,"Produto excluido com sucesso.", "Sucesso",2);

                if(calculaTotal() == null){
                    txtValorTotal.setText("0,00");
                } else {
                    txtValorTotal.setText(calculaTotal());
                }
            } else {
                JOptionPane.showMessageDialog(null,"Selecione um cliente para exclusão!", "Seleção Invalida", 1);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void comboBoxProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxProdutoItemStateChanged
        comboCampoProd(evt.getItem().toString());
    }//GEN-LAST:event_comboBoxProdutoItemStateChanged

    private void campoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoProdutoKeyPressed
        if(evt.getKeyCode() == 10 && campoProduto.getText().isEmpty() == false){
            campoComboProd(campoProduto.getText().trim());
        } else {
            comboBoxProduto.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_campoProdutoKeyPressed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        verificaCampos();
        txtValorTotal.setText(calculaTotal());
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        int numeroLinhas = tabela.getRowCount();
        
        if(numeroLinhas == 0){
            JOptionPane.showMessageDialog(null, "Não há produtos cadastrados.", "Erro", 1);
        } else {
            setEstoque();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNfActionPerformed
    
    public void setData(){
        txtData.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }
    
    public String calculaTotal(){
        float valorFinal = 0;
        int totalLinha = tabela.getRowCount();
        int colunaValorTotal = 4;
        float temp = 0;
        
        String resultado = null;
        
        for(int contador=0; totalLinha > contador; contador++){
            temp = Float.parseFloat(tabela.getValueAt(contador, colunaValorTotal).toString());
            valorFinal = valorFinal+temp;
            resultado = new DecimalFormat("#.00").format(valorFinal);
        }
        
        return resultado;
    }  
    
    public int getEstoque(String nomeProduto){
        String sql = "SELECT * from produto WHERE nome LIKE '"+nomeProduto+"';";
        int qtdEstoqueTotal = 0;
        try{
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                qtdEstoqueTotal = rs.getInt("quantidade");
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return qtdEstoqueTotal;
    }
    
    public void setEstoque(){
        int totalLinha = tabela.getRowCount();
        int colunaNome = 1;
        int colunaQtd = 2;
        
        for(int contador=0; totalLinha > contador; contador++){
            String nomeProduto = tabela.getValueAt(contador, colunaNome).toString();
            int qtdProduto = Integer.parseInt(tabela.getValueAt(contador, colunaQtd).toString());
            String nomeFornecedor = retornaFornecedor(nomeProduto);
            String valorTotal = tabela.getValueAt(contador, 4).toString();
            String data = txtData.getText();
 
            int qtdProdutoFinal = getEstoque(nomeProduto) + qtdProduto;
            
            String sql = "UPDATE produto SET quantidade="+qtdProdutoFinal+" WHERE nome='"+nomeProduto+"';";
            String sql2 = "INSERT INTO compra (`nomeFornecedor`, `nomeProduto`, `qtd`, `data`, `valorTotal`) VALUES ('" 
                    + nomeFornecedor + "', '" 
                    + nomeProduto + "', '"
                    + qtdProduto + "', '"
                    + data + "', '"
                    + valorTotal + "');";
            try{
                Statement st = Conexao.getConexao().createStatement();
                ResultSet rs = st.executeQuery(sql);
                ResultSet rs2 = st.executeQuery(sql2);
            } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
        limpaCampos();
        limpaTabela();
        JOptionPane.showMessageDialog(null, "Compra cadastrada com sucesso!", "Sucesso", 1);
    }
      
    public void verificaCampos(){
        if(campoProduto.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um produto", "Campo Obrigatório", 0);
            txtValorTotal.setText(calculaTotal());
        }
        else if(txtData.getText().trim().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira uma data", "Campo Obrigatório", 0);
            txtValorTotal.setText(calculaTotal());
        }
        else if(comboBoxProduto.getSelectedIndex() == -1){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira um produto", "Campo Obrigatório", 0);
            txtValorTotal.setText(calculaTotal());
        }
        else if(textFieldQuantidade.getText().isEmpty()){
            //CAMPO VAZIO
            JOptionPane.showMessageDialog(null, "Insira uma quantidade válida", "Campo Obrigatório", 0);
            txtValorTotal.setText(calculaTotal());
        } else {
            adcProdutoTabela(comboBoxProduto.getSelectedItem().toString()); 
        }
    }
    
    public void limpaTabela(){
        DefaultTableModel tblModel = (DefaultTableModel) tabela.getModel();
        tblModel.setRowCount(0);
        txtValorTotal.setText("0,00");
    }
    
    public void limpaCampos(){
        comboBoxProduto.setSelectedIndex(-1);
        txtFornecedor.setText("<Selecione um produto>");
        campoProduto.setText("");
        textFieldQuantidade.setText("");
    }
    
    public void adcProdutoTabela(String nomeProduto){
        DefaultTableModel tblModel = (DefaultTableModel) tabela.getModel();
        String sql = "SELECT * from produto WHERE nome LIKE '"+nomeProduto+"';";
        
        String codProduto = campoProduto.getText();
        float valorUnt = 0;
        int qtd = Integer.parseInt(textFieldQuantidade.getText());
        try{
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                valorUnt = rs.getFloat("valorUnt");
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        
        float valorTotal = valorUnt * qtd;

        Object tbData[] = {codProduto, nomeProduto, qtd, valorUnt, valorTotal}; 
        tblModel.addRow(tbData);
        limpaCampos();
    }
    
    public String retornaFornecedor(String texto){
        String sql = "SELECT * from produto WHERE nome LIKE '"+texto+"%';";
        String temp = null;
        try{
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String fornecedor = rs.getString("fornecedor");
                temp = fornecedor;
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return temp;
    }
    
    public void comboCampoProd(String texto){
        String sql = "SELECT * from produto WHERE nome LIKE '"+texto+"%';";
        try{
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String id = rs.getString("id");
                String fornecedor = rs.getString("fornecedor");
                campoProduto.setText(id);
                txtFornecedor.setText(fornecedor);
                
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void atualizaComboProd(){
        String sql = "SELECT * from produto";
        try{
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            comboBoxProduto.removeAllItems();
            while(rs.next()){
                String nome = rs.getString("nome");
                comboBoxProduto.addItem(nome);
                comboBoxProduto.setSelectedIndex(-1);
                campoProduto.setText("");
                txtFornecedor.setText("<Selecione um produto>");
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void campoComboForn(String texto){
        String sql = "SELECT * from fornecedor WHERE id LIKE '"+texto+"%';";
        try{
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String razao = rs.getString("razaosocial");
                txtFornecedor.setText(razao);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void campoComboProd(String texto){
        String sql = "SELECT * from produto WHERE id LIKE '"+texto+"%';";
        try{
            Statement st = Conexao.getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String nome = rs.getString("nome");
                String fornecedor = rs.getString("fornecedor");
                comboBoxProduto.setSelectedItem(nome);
                txtFornecedor.setText(fornecedor);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField campoProduto;
    private javax.swing.JComboBox<String> comboBoxProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodProduto;
    private javax.swing.JLabel labelDataCompra;
    private javax.swing.JLabel labelFornecedor;
    private javax.swing.JLabel labelNumCompra;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelVFTxt;
    public static javax.swing.JTable tabela;
    private javax.swing.JTextField textFieldQuantidade;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtFornecedor;
    private javax.swing.JTextField txtNf;
    private javax.swing.JLabel txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
