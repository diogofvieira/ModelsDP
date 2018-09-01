package designPatterns.test;

import designPaterns.decorator.Icms;
import designPaterns.decorator.Imposto;
import designPaterns.decorator.Iss;
import designPaterns.decorator.Orcamento;



public class TesteImpostosComplexos {
	
	public static void main(String[] args) {
		
		Imposto iss = new Iss(new Icms(new Iss(new Icms())));
		
		Orcamento orcamento = new Orcamento(600);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
	}

}