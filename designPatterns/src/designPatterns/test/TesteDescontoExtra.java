package designPatterns.test;

import designPatterns.state.Orcamento;


public class TesteDescontoExtra {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(600);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
	
		reforma.finaliza();

		reforma.aplicaDescontoExtra();
	}

}
