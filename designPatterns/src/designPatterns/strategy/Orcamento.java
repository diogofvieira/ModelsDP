package designPatterns.strategy;

import java.util.ArrayList;
import java.util.List;

import designPatterns.chainofresponsibilitie.Item;

public class Orcamento {

	private double valor;
	private final List<Item> itens;

	public Orcamento(double valor){
		this.valor = valor;
		itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}

	public void addicionaItem(Item item){
		itens.add(item);
	}

	public List<Item> getItens() {
		return itens;
	}

	
	
	
	
	
}
