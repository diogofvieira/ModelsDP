package designPatterns.templateMethod;

import designPatterns.strategy.Impostos;
import designPatterns.strategy.Orcamento;

public abstract class TemplateImpostos implements Impostos{

	@Override
	public double calcula(Orcamento orcamento) {
		
		if(calculaTaxaMaxima(orcamento)){
			return calculaTaxaMinima(orcamento);
		}else{
			return calculaTaxaMinima(orcamento);
		}
	}
	
	public abstract Boolean calculaTaxaMaxima(Orcamento orcamento);
	
	public abstract double calculaTaxaMinima(Orcamento orcamento);
	
	public abstract double calculaTaxaItem(Orcamento orcamento);

}
