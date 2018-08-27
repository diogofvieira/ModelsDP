package designPatterns.templateMethod;

import designPatterns.strategy.Orcamento;

public class Icpn extends TemplateImpostos{

	@Override
	public Boolean calculaTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() < 500;
	}

	@Override
	public double calculaTaxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.6;
	}

	@Override
	public double calculaTaxaItem(Orcamento orcamento) {
		return orcamento.getValor() * 0.7;
	}

}
