package designPatterns.ChainOfResponsibilitie;

import designPatterns.strategy.Orcamento;

public class ClaculadorDesconto {
	
	
	public double calcula(Orcamento orcamento){
		Desconto d1 = new DescontoCincoItens(); 
		Desconto d2 = new DescontoQuinhentos(); 
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		return d1.desconto(orcamento);
	}

}
