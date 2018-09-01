package designPatterns.observer;

import designPatterns.methodchain.builder.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf){
		System.out.println("Salvar");
	}

}
