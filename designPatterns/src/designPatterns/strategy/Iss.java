package designPatterns.strategy;

public class Iss implements Impostos{

	@Override
	public double calcula(Orcamento orcamento) {
		double iss = orcamento.getValor() * 0.1;
		return iss;
	}

}
