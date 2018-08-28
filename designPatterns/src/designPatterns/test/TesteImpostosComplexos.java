package designPatterns.test;

import designPaterns.Decorator.Icms;
import designPaterns.Decorator.Imposto;
import designPaterns.Decorator.Iss;
import designPaterns.Decorator.Orcamento;



public class TesteImpostosComplexos {
	
	public static void main(String[] args) {
		
		Imposto iss = new Iss(new Icms(new Iss(new Icms())));
		
		Orcamento orcamento = new Orcamento(600);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
	}

}