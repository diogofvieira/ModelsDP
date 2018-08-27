package designPatterns.test;

import designPatterns.ChainOfResponsibilitie.ClaculadorDesconto;
import designPatterns.ChainOfResponsibilitie.Item;
import designPatterns.strategy.Orcamento;

public class DescontoTest {
	
	public static void main(String[] args) {
		
		ClaculadorDesconto c = new ClaculadorDesconto();
		
		Orcamento o = new Orcamento(600.0);
		o.addicionaItem(new Item("Lapis", 250.0));
		o.addicionaItem(new Item("Lapiseira", 250.0));
		o.addicionaItem(new Item("Caneta", 250.0));
		o.addicionaItem(new Item("Mapa", 250.0));
		o.addicionaItem(new Item("Caderno", 250.0));
		
		double descontoFinal = c.calcula(o);
		
		System.out.println(descontoFinal);
		
	}

}
