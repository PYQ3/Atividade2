package atividade2;

public class Pessoa {
	
	private String Nome;
	private String Endere�o;
	private String Telefone;
	
	
	
	public Pessoa(String nome, String endere�o, String telefone) {
		super();
		Nome = nome;
		Endere�o = endere�o;
		Telefone = telefone;
		
				
	}
	
	public Pessoa() {
		super();
		Nome = "S/N";
		Endere�o = "S/N";
		Telefone = "S/N";
		
	
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}


	public String getEndereco() {
		return Endere�o;
	}

	public void setEndereco(String endereco) {
		Endere�o = endereco;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String toString() {
		return "Pessoa [Nome:" + Nome + ", Endere�o:" + Endere�o + ", Telefone:" + Telefone + "]";
	}
	
	

}
