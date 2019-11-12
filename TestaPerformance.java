package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
	
		System.out.println("iniciando....");
		Collection<Integer> test = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		
		int total = 10000;
		
		for (int i=0;i<total;i++) {
			test.add(i);
		}
		
		for (int i=0;i<total;i++) {
			test.contains(i);	
		}
		long fim = System.currentTimeMillis();
		
		long tempo = fim - inicio ;
		System.out.println("tempo de processamento = "+tempo);

		Collection<Integer> teste = new HashSet<>();
		
		
		
	}

}
