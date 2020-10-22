package atividade2;

public class Administrador extends Empregado{
	
	private double AjudaDeCusto;


	public Administrador(String nome, String endereco, String telefone, double salário, double ajudaDeCusto) {
		super(nome, endereco, telefone, salário);
		AjudaDeCusto = ajudaDeCusto;
		
	}

	public double getAjudaDeCusto() {
		return AjudaDeCusto;
	
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		AjudaDeCusto = ajudaDeCusto;
	
	}

	public double CalcularSalário() {
		return this.getSalário() + AjudaDeCusto;
	
	}

}
