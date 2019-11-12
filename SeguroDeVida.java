package br.com.fiap.contas.modelo;

public class SeguroDeVida implements Tributavel {
	
	double valor;
	private String titular;
	private int numeroApolice;

	@Override
	public double getValorImposto() {
	
		return ( 42 + (this.valor * 0.02));
		
	}

	public String getTipo() {
		return "Seguro de Vida";
	}
	
	
}
