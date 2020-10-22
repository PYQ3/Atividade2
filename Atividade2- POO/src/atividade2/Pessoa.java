package atividade2;

public class Pessoa {
	
	private String Nome;
	private String Endereço;
	private String Telefone;
	
	
	
	public Pessoa(String nome, String endereço, String telefone) {
		super();
		Nome = nome;
		Endereço = endereço;
		Telefone = telefone;
		
				
	}
	
	public Pessoa() {
		super();
		Nome = "S/N";
		Endereço = "S/N";
		Telefone = "S/N";
		
	
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}


	public String getEndereco() {
		return Endereço;
	}

	public void setEndereco(String endereco) {
		Endereço = endereco;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String toString() {
		return "Pessoa [Nome:" + Nome + ", Endereço:" + Endereço + ", Telefone:" + Telefone + "]";
	}
	
	

}
