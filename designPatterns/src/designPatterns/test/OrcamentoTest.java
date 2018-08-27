package designPatterns.test;

import designPatterns.strategy.Icms;
import designPatterns.strategy.Iss;
import designPatterns.strategy.Orcamento;

public class OrcamentoTest{
	
	
	public static void main(String[] args) {
	
		Icms icms = new Icms();
		Iss iss = new Iss();
		
		Orcamento orcamento = new Orcamento(100.0);
		
		System.out.println(icms.calcula(orcamento));
		System.out.println(iss.calcula(orcamento));
		
	}

}
