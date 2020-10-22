package atividade2;

public class Vendedor extends Empregado{
	
	private double ValorVendas;
	private double Comissão;
	
	public Vendedor(String nome, String endereço, String telefone, double salário, double valorVendas, double comissão) {
		super(nome, endereço, telefone, salário);
		ValorVendas = valorVendas;
		Comissão = comissão;
		
	}

	public double getValorVendas() {
		return ValorVendas;
		
	}

	public void setValorVendas(double valorVendas) {
		ValorVendas = valorVendas;
	
	}

	public double getComissão() {
		return Comissão;
	
	}

	public void setComissão(double comissão) {
		Comissão = comissão;
	
	}
	
	public double CalcularSalário() {
		return this.getSalário() + ValorVendas * Comissão;
	
	}
	

}
