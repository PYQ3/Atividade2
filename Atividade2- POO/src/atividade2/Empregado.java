package atividade2;

public class Empregado extends Pessoa {
	
	private double Sal�rio;
	
	public Empregado(String nome, String endereco, String telefone,  double sal�rio) {
		super(nome, endereco, telefone);
		Sal�rio = sal�rio;
		
	}
	
	public double getSal�rio() {
		return Sal�rio;
	
	}
	
	public void setSal�rio(double sal�rio) {
		Sal�rio = sal�rio;
	
	}
	
}
