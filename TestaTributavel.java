package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente C1 = new ContaCorrente();

		C1.deposita(100.00);
		System.out.println(C1.getValorImposto());
		
		Tributavel t = C1;
		
		System.out.println(t.getValorImposto());
		

	}

}
