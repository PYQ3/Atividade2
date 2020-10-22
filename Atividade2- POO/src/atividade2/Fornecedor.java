package atividade2;

public class Fornecedor extends Pessoa{
	
	private double ValorCr�dito;
	private double ValorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCr�dito, double valorDivida) {
		super(nome, telefone, endereco);
		ValorCr�dito = valorCr�dito;
		ValorDivida = valorDivida;
		
	}

	public double getValorCr�dito() {
		return ValorCr�dito;
		
	}

	public void setValorCr�dito(double valorCr�dito) {
		ValorCr�dito = valorCr�dito;
	
	}

	public double getValorDivida() {
		return ValorDivida;
	
	}

	public void setValorDivida(double valorDivida) {
		ValorDivida = valorDivida;
	
	}

	
	public double obterSaldo() {
		return ValorCr�dito - ValorDivida;
	
	}

}
