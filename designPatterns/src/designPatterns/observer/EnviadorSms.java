package designPatterns.observer;

import designPatterns.methodchain.builder.NotaFiscal;

public class EnviadorSms implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf){
		System.out.println("Enviar SMS");
	}

}
