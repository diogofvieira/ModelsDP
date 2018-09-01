package designPatterns.observer;

import designPatterns.methodchain.builder.NotaFiscal;

public interface AcaoAposGerarNota {
	
	void executa(NotaFiscal nf);

}
