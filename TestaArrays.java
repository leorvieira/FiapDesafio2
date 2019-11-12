package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {

		Conta[] contas = new Conta[10];
		
		for (int i=0;i<10;i++) {
			Conta C = new ContaCorrente();
			C.deposita(100);
			contas[i] = C; 
		}
		
		double media = 0;
		for (int i=0;i<10;i++) {

			media = media + contas[i].getSaldo();

		}
	
		
		System.out.println("media = "+ media/(contas.length));

	}

}
