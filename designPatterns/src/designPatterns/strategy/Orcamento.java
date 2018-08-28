package designPatterns.strategy;

import java.util.ArrayList;
import java.util.List;

import designPatterns.ChainOfResponsibilitie.Item;

public class Orcamento {

	private double valor;
	private final List<Item> itens;

	private int estadoAtual;
	private static final int EM_APROVACAO = 1;
	private static final int APROVADO = 2;
	

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

	public void aplicaDescontoExtra() {
		if(estadoAtual == EM_APROVACAO){
			valor = valor - (valor * 0.5);
		}else if(estadoAtual == APROVADO){
			valor = valor - (valor * 0.2);
		}else throw new RuntimeException("Somente em aprova��o!");
		
	}
	
	
	
	
}
