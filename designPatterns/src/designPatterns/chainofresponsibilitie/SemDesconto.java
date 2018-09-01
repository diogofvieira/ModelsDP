package designPatterns.chainofresponsibilitie;

import designPatterns.strategy.Orcamento;

public class SemDesconto implements Desconto{

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// Nada metodo final
		
	}

}
