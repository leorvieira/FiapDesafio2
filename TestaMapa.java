package br.com.fiap.contas.main;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {

		Conta C1 = new ContaCorrente();
		C1.deposita(1000);
		
		Conta C2 = new ContaCorrente();
		C2.deposita(2000);
		
		Map mapaDeContas = new HashMap();
		
		mapaDeContas.put("Diretor", C1);
		mapaDeContas.put("Gerente", C1);
		
		Conta contaDoDiretor = (Conta) mapaDeContas.get("Diretor");
		
		System.out.println(contaDoDiretor.getSaldo());
		
		Map<String, Conta> mapaDeContas2 = new HashMap<>();
		

	}

}
