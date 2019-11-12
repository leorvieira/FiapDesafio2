package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Banco;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaBanco {

	public static void main(String[] args) {

		Banco banco = new Banco("Banco Imobiliario",111);
		ContaCorrente C1 = new ContaCorrente();
		C1.setTitular("Louco");
		C1.setNumCC(123);
		C1.setAgencia("1000");

		ContaCorrente C2 = new ContaCorrente();
		C2.setTitular("Maluco");
		C2.setNumCC(1234);
		C2.setAgencia("1000");
		
		ContaCorrente C3 = new ContaCorrente();
		C3.setTitular("Treze");
		C3.setNumCC(1235);
		C3.setAgencia("1000");
		
		System.out.println(C1.toString());
		
		banco.adiciona(C2);
		banco.adiciona(C1);
		banco.adiciona(C3);
		
		for (int i=0;i<3;i++) {
			System.out.println(i+" "+banco.getContas()[i].toString());
			
		}
		
		
	}

}
