package Implementacao;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.DateFormat;
//import java.util.*;
//import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import Connections.ConnectionDB;

public class Produtos { 
	
    private String nomeProduto;
    private double preco;
    private String categoria;
    static ConnectionDB db = new ConnectionDB();
    
    public Produtos() {
    	
    }

    public Produtos(String nomeProduto, double preco, String categoria) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void mostrarProduto() {
    	System.out.println(getNomeProduto() + " " + getNomeProduto() +  " " + getCategoria());
    }
    
    public void inserirProduto(){
    	ConnectionDB.Conectar();
       try {
    	 String sql = "INSERT INTO PRODUTOS (nome_produto, preco_produto, cod_categoria) VALUES (?, ?, ?)";
        PreparedStatement stm = ConnectionDB.preparedStament(sql);
        stm.setString(1, this.getNomeProduto());
        stm.setDouble(2, this.getPreco());
        stm.setString(3,this.getCategoria());
        ConnectionDB.runPreparedStatment(stm); 
		JOptionPane.showMessageDialog(null, "Produto cadastrado com exito.");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir dados \nErro: "+ex);
		}
       ConnectionDB.Desconectar();
    }
    
    public void alterarProduto(){
    	ConnectionDB.Conectar();
    	try{
    		String sql = "UPDATE PRODUTOS SET nome_produto=?, preco_produto=?,cod_categoria=? WHERE nome_produto=?";
    		PreparedStatement stm = ConnectionDB.preparedStament(sql);
    		stm.setString(1, this.getNomeProduto());
    		stm.setDouble(2, this.getPreco());
    		stm.setString(3, this.getCategoria());
    		stm.setString(4, this.nomeProduto);
    		ConnectionDB.runPreparedStatment(stm);
    		JOptionPane.showMessageDialog(null, "Produto alterado com exito.");
    	} catch (SQLException ex) {
    		JOptionPane.showMessageDialog(null,"Erro ao alterar dados \nErro: "+ex);
    	}
    	ConnectionDB.Desconectar();
    }
    
    public void excluirProduto(){
    	ConnectionDB.Conectar();
        try{
        	String sql = "DELETE FROM PRODUTOS WHERE nome_produto=?";
        	PreparedStatement stm = ConnectionDB.preparedStament(sql);
        	stm.setString(1, this.nomeProduto);
        	ConnectionDB.runPreparedStatment(stm);
        	JOptionPane.showMessageDialog(null, "Produto excluido com exito.");
        } catch (SQLException ex) {
        	JOptionPane.showMessageDialog(null, "Erro ao excluir dados \nErro: "+ex);
        }
        ConnectionDB.Desconectar();
    }
    public static void listarTodos() throws Exception {
    	ConnectionDB.Conectar();
    		String sql = "SELECT * FROM PRODUTOS ORDER BY nome_produto";
    		PreparedStatement stm = ConnectionDB.preparedStament(sql);
    		try {
    		ResultSet result = stm.executeQuery();
    		String lista = "";
    		while(result.next()) {
    			lista= lista + result.getInt("cod_produto") + " - " + result.getString("nome_produto") + " - " + result.getDouble("preco_produto") + " - " + result.getInt("cod_categoria") + " - " + result.getInt("qntd_produto") + "\n";
    		}
    		JOptionPane.showMessageDialog(null, lista);
    		}catch(SQLException ex) {
    			JOptionPane.showMessageDialog(null, "Erro ao listar dados \nErro: "+ex);
    		}
    }
    
    public void teste(String nome,String categoria,Double preco,String descricao) throws SQLException {
    	ConnectionDB.Conectar();
    	String sql = "insert into produtos(nome_produto,categoria_produto) values (?,?)";
    	PreparedStatement stm = ConnectionDB.preparedStament(sql);
    	stm.setString(1, nome);
    	//stm.setDouble(2, preco);
    	stm.setString(3, categoria);
    	ConnectionDB.runPreparedStatment(stm);
    	System.out.println("Testes" + nome + " " + categoria + " " + preco + " " + descricao);
    	ConnectionDB.Desconectar();
    }
}
