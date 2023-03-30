package estoquemais.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Conexao {
    static String usuario = "root";
    static String senha = "asd";
    static String url = "jdbc:mariadb://localhost:3306/controleestoque";
    static Connection con = null;
    
    public static void criaDB(){
        executaSQL("CREATE TABLE IF NOT EXISTS cliente" +
                    "( id INT(11) NOT NULL AUTO_INCREMENT," +
                    "  nome VARCHAR(150) NOT NULL," +
                    "  telefone VARCHAR(32)," +
                    "  email VARCHAR(40)," +
                    "  endereco VARCHAR(150)," +
                    "  cidade VARCHAR(150)," +
                    "  uf VARCHAR(100)," +
                    "  cep VARCHAR(12)," +
                    "  PRIMARY KEY (id)" +
                    ");");
        executaSQL("CREATE TABLE IF NOT EXISTS fornecedor(" +
                    "  id int auto_increment," +
                    "  razaosocial varchar(255) not null," +
                    "  cnpj varchar(100)," +
                    "  endereco varchar(255)," +
                    "  bairro varchar(200)," +
                    "  cidade varchar(200)," +
                    "  uf varchar(25)," +
                    "  cep varchar(10)," +
                    "  telefone varchar(15)," +
                    "  primary key(id)" +
                    ");");
        executaSQL("CREATE TABLE IF NOT EXISTS produto(" +
                    "  id int auto_increment," +
                    "  nome varchar(255) not null," +
                    "  quantidade int," +
                    "  fornecedor varchar(255)," +
                    "  valorUnt float," +
                    "  valorVenda float," +
                    "  primary key(id)" +
                    ");");
        executaSQL("CREATE TABLE IF NOT EXISTS compra(" +
                    "  id int auto_increment," +
                    "  nomeFornecedor varchar(255)," +
                    "  nomeProduto varchar(255)," +
                    "  qtd int," +
                    "  data varchar(255)," +
                    "  valorTotal varchar(255)," +
                    "  primary key(id)" +
                    ");");
        executaSQL("CREATE TABLE IF NOT EXISTS venda(" +
                    "  idVenda int auto_increment," +
                    "  nomeClienteVenda varchar(255)," +
                    "  nomeProdutoVenda varchar(255)," +
                    "  qtdVenda int," +
                    "  dataVenda varchar(255)," +
                    "  valorTotalVenda varchar(255)," +
                    "  primary key(idVenda)" +
                    ");");
    }
    
    public static Connection getConexao(){
        try {
            if((con == null) || (con.isClosed())){
                con = DriverManager.getConnection(url, usuario, senha);
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return con;
    }
    
    public static void executaSQL(String sql){
        try{
            PreparedStatement ps = getConexao().prepareStatement(sql);
            ps.executeUpdate();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void capturaSQL(String sql){
        try{
            Statement st = getConexao().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
