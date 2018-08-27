package designPatterns.templateMethod;

import designPatterns.strategy.Orcamento;

public class Icmp extends TemplateImpostos{

	@Override
	public Boolean calculaTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}

	@Override
	public double calculaTaxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.4;
	}

	@Override
	public double calculaTaxaItem(Orcamento orcamento) {
		return orcamento.getValor() * 0.2;
	}

}
