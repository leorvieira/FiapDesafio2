package br.com.fiap.contas.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.SeguroDeVida;

public class Principal {

	public static void main(String[] args) {
			
		
		ContaCorrente C2 = new ContaCorrente();
		
		System.out.println(C2.getTipo());
	
		ContaPoupanca C3 = new ContaPoupanca();
		System.out.println(C3.getTipo());
		try {
		C2.deposita(1000.00);
		C2.transfere(500.00, C3);
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}

		try {
		C2.saca(100000.00);
		} catch (Exception e ) {
			System.out.println(e.getMessage());
		}		
		
		System.out.println(C2.getSaldo());
		System.out.println(C3.getSaldo());
		
		SeguroDeVida S1 = new SeguroDeVida();

		ContaCorrente C4 = new ContaCorrente();
		ContaCorrente C5 = new ContaCorrente();
		C2.setAgencia("1234");
		C2.setNumCC(1001);
		C2.setTitular("Leonardo");

		
		C3.setAgencia("1234");
		C3.setNumCC(1002);
		C3.setTitular("Joao");
		System.out.println(C2.toString());
		
		
		
		
		
	}

}
