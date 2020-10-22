package atividade2;

public class Fornecedor extends Pessoa{
	
	private double ValorCrédito;
	private double ValorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCrédito, double valorDivida) {
		super(nome, telefone, endereco);
		ValorCrédito = valorCrédito;
		ValorDivida = valorDivida;
		
	}

	public double getValorCrédito() {
		return ValorCrédito;
		
	}

	public void setValorCrédito(double valorCrédito) {
		ValorCrédito = valorCrédito;
	
	}

	public double getValorDivida() {
		return ValorDivida;
	
	}

	public void setValorDivida(double valorDivida) {
		ValorDivida = valorDivida;
	
	}

	
	public double obterSaldo() {
		return ValorCrédito - ValorDivida;
	
	}

}
