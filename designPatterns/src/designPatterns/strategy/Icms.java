package designPatterns.strategy;

public class Icms implements Impostos{

	@Override
	public double calcula(Orcamento orcamento) {
		double icms = orcamento.getValor() * 0.6;
		return icms;
	}

}
