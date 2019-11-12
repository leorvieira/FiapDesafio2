package br.com.fiap.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	

	public String getTipo() {
		return "Conta Corrente";
	}
	
	
	@Override
	public void saca(double valor) {
		if ( valor < 0) {
			throw new IllegalArgumentException("Saque valor negativo nao permitido.");
		}else {
			if ( valor > this.saldo ) {
				throw new SaldoInsuficienteException(valor);
			}else {
				this.saldo -= ( valor + 0.10 );
			}
		}
	}


	@Override
	public double getValorImposto() {

		return this.getSaldo() * 0.01;
	}
	
	public class SaldoInsuficienteException extends RuntimeException {
		public SaldoInsuficienteException ( double valor ) {
			super ("Saldo insuficiente para sacar valor de "+valor);
		}
		
		
	}

}
