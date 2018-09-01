package designPatterns.chainofresponsibilitie;

import designPatterns.strategy.Orcamento;

public interface Desconto {
	
	public double desconto(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
