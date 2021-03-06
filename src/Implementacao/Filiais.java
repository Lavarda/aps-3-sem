package Implementacao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Connections.ConnectionDB;

public class Filiais {
	
	private String nomeFilial;
	private Scanner s = new Scanner(System.in);
	private String telefoneFilial;
	private String cpnjFilial;
	private String bairroFilial;
	private int numeroEndereco;
	private String cidadeFilial;
	private String estado;
	private String cepFilial;
	
	public Filiais() {
		
	}

	public Filiais(String nomeFilial, String telefoneFilial, String cnpjFilial, String bairroFilial,
					int numeroEndereco, String cidadeFilial, String estado, String cepFilial) {

		this.nomeFilial = nomeFilial;
		this.telefoneFilial = telefoneFilial;
		this.cpnjFilial = cnpjFilial;
		this.bairroFilial = bairroFilial;
		this.numeroEndereco = numeroEndereco;
		this.cidadeFilial = cidadeFilial;
		this.estado = estado;
		this.cepFilial = cepFilial;
		
	}

	public String getNomeFilial() {
		return nomeFilial;
	}

	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}

	public String getTelefoneFilial() {
		return telefoneFilial;
	}

	public void setTelefoneFilial(String telefoneFilial) {
		this.telefoneFilial = telefoneFilial;
	}

	public String getCpnjFilial() {
		return cpnjFilial;
	}

	public void setCpnjFilial(String cpnjFilial) {
		this.cpnjFilial = cpnjFilial;
	}

	public String getBairroFilial() {
		return bairroFilial;
	}

	public void setBairroFilial(String bairroFilial) {
		this.bairroFilial = bairroFilial;
	}

	public int getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getCidadeFilial() {
		return cidadeFilial;
	}

	public void setCidadeFilial(String cidadeFilial) {
		this.cidadeFilial = cidadeFilial;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCepFilial() {
		return cepFilial;
	}

	public void setCepFilial(String cepFilial) {
		this.cepFilial = cepFilial;
	}
	
	public void cadastroFilial(){
		String sql = "insert into filiais_table(nome_filial,cnpj_filial,telefone_filial,cep_filial,cidade_filial,"
				+ "bairro_filial,estado_filial,numero_loja_filial) "
				+ "values (?,?,?,?,?,?,?,?)";		
		try {
			ConnectionDB.Conectar();
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			
			System.out.println("Digite o nome da filial que deseja cadastrar: ");
			String nomeFilial = s.nextLine();
			System.out.println("Digite o cnpj da filial que deseja cadastrar: ");
			String cnpjFilial = s.nextLine();
			System.out.println("Digite o telefone da filial que deseja cadastrar: ");
			String telefoneFilial = s.nextLine();
			System.out.println("Digite o cep da filial que deseja cadastrar: ");
			String cepFilial = s.nextLine();
			System.out.println("Digite o cidade da filial que deseja cadastrar: ");
			String cidadeFilial = s.nextLine();
			System.out.println("Digite o bairro da filial que deseja cadastrar: ");
			String bairroFilial = s.nextLine();
			System.out.println("Digite o estado da filial que deseja cadastrar: ");
			String estadoFilial = s.nextLine();
			System.out.println("Digite o numero da loja da filial que deseja cadastrar: ");
			int numeroFilial = Integer.parseInt(s.nextLine());
			
			stm.setString(1, nomeFilial );
			stm.setString(2, cnpjFilial );
			stm.setString(3, telefoneFilial );
			stm.setString(4, cepFilial );
			stm.setString(5, cidadeFilial );
			stm.setString(6, bairroFilial );
			stm.setString(7, estadoFilial );
			stm.setInt(8, numeroFilial );
			ConnectionDB.runPreparedStatment(stm);
			System.out.println("Dados de endereço de filial inseridos");
		} catch (SQLException | NumberFormatException e) {
			System.out.println("Erro ao realizar cadastro filial " + e);
		}finally {
			ConnectionDB.Desconectar();
		}		
	}
	
//	public void editFilial() {
//		db.Conectar();
//		String sql = ""
//		
//		db.Desconectar();
//	}
	
	public void removeFilial(){
		
		String sql = "delete from filiais_table where cnpj_filial = ?";
		try {
			ConnectionDB.Conectar();
			System.out.println("Digite o cnpj da filial que deseja remover: ");
			String cnpj_filial = s.nextLine();
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, cnpj_filial);
			ConnectionDB.runPreparedStatment(stm);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			ConnectionDB.Desconectar();
		}
	}
	
//	public static void main(String args[]) throws SQLException {
//		Filiais f = new Filiais("Filial Teste","48 998548350","11234566","Extreitu",12,"Florianopolis","SC","88070150");
//		f.cadastroFilial();
//		Filiais f = new Filiais();
//		f.removeFilial();
//	}
}
