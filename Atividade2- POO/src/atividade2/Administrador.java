package atividade2;

public class Administrador extends Empregado{
	
	private double AjudaDeCusto;


	public Administrador(String nome, String endereco, String telefone, double sal�rio, double ajudaDeCusto) {
		super(nome, endereco, telefone, sal�rio);
		AjudaDeCusto = ajudaDeCusto;
		
	}

	public double getAjudaDeCusto() {
		return AjudaDeCusto;
	
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		AjudaDeCusto = ajudaDeCusto;
	
	}

	public double CalcularSal�rio() {
		return this.getSal�rio() + AjudaDeCusto;
	
	}

}
