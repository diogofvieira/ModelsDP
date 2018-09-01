package designPatterns.observer;

import designPatterns.methodchain.builder.NotaFiscal;

public class EnviadorEmail implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf){
		System.out.println("Enviado email");
	}

}
