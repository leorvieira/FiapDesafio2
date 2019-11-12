package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaLista {

	public static void main(String[] args) {

// Ordenacao 1 e 2 		
		
		ContaCorrente C1 = new ContaCorrente();
		ContaCorrente C2 = new ContaCorrente();
		ContaCorrente C3 = new ContaCorrente();
		C1.setAgencia("1234");
		C1.setNumCC(1001);
		C1.setTitular("Leonardo");

		C2.setAgencia("1234");
		C2.setNumCC(1003);
		C2.setTitular("Pedro");

		
		C3.setAgencia("1234");
		C3.setNumCC(1002);
		C3.setTitular("Joao");
		
		List<ContaCorrente> contas = new ArrayList<>();
		contas.add(C1);
		contas.add(C2);
		contas.add(C3);
		
		Collections.sort(contas);
	
// 		ordenacao 4
		
		List<ContaCorrente> contasl = new LinkedList<>();
		
		System.out.println(contas);
		contasl.add(C3);
		contasl.add(C2);
		contasl.add(C1);
		
		System.out.println(contasl);
		Collections.sort(contasl);

	}

}
