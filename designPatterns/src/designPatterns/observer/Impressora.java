package designPatterns.observer;

import designPatterns.methodchain.builder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf){
		System.out.println("Imprimi");
	}

}
