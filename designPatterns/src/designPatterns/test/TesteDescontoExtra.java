package designPatterns.test;

import designPatterns.strategy.Orcamento;

public class TesteDescontoExtra {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(600);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	}

}
