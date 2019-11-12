package br.com.fiap.contas.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements Comparable<Conta> {
	
	protected double saldo ;
	String titular ;
	int numCC ;
	String agencia;
	
	public boolean equals(Object obj) {
		
		if ( obj == null ) {
			return false;
		}
		Conta outraConta = (Conta) obj ;
		return this.numCC == outraConta.numCC ;	
	}
	
	
	@Override
	public String toString() {
		return "[titular= " + titular + ", numero conta= " + numCC + " ]";
	}
	
	
	
	public void transfere (double valor, Conta conta) {
		
		this.saca(valor);
		conta.deposita(valor);
		
	}
	
	public void deposita (double valor) {
		if ( valor < 0 ) {
			throw new IllegalArgumentException("valor negativo nao permitido para deposito");
		}else { 
			this.saldo += valor;
		}
	}
	
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
	

	
	
	
	public void saca(double valor) {
		this.saldo -= valor;
		
	}
	
	public abstract String getTipo();
	
	public double getSaldo() {
		return this.saldo;
		
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public int getNumCC() {
		return numCC;
	}



	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}



	public String getAgencia() {
		return agencia;
	}



	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
