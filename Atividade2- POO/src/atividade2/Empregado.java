package atividade2;

public class Empregado extends Pessoa {
	
	private double Salário;
	
	public Empregado(String nome, String endereco, String telefone,  double salário) {
		super(nome, endereco, telefone);
		Salário = salário;
		
	}
	
	public double getSalário() {
		return Salário;
	
	}
	
	public void setSalário(double salário) {
		Salário = salário;
	
	}
	
}
