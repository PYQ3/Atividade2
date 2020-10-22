package atividade2;

public class Vendedor extends Empregado{
	
	private double ValorVendas;
	private double Comiss�o;
	
	public Vendedor(String nome, String endere�o, String telefone, double sal�rio, double valorVendas, double comiss�o) {
		super(nome, endere�o, telefone, sal�rio);
		ValorVendas = valorVendas;
		Comiss�o = comiss�o;
		
	}

	public double getValorVendas() {
		return ValorVendas;
		
	}

	public void setValorVendas(double valorVendas) {
		ValorVendas = valorVendas;
	
	}

	public double getComiss�o() {
		return Comiss�o;
	
	}

	public void setComiss�o(double comiss�o) {
		Comiss�o = comiss�o;
	
	}
	
	public double CalcularSal�rio() {
		return this.getSal�rio() + ValorVendas * Comiss�o;
	
	}
	

}
