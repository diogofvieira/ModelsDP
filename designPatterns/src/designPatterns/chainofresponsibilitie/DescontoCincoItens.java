package designPatterns.chainofresponsibilitie;

import designPatterns.strategy.Orcamento;

public class DescontoCincoItens implements Desconto{
	
	private Desconto proximo;

	public double desconto(Orcamento orcamento){
		if(orcamento.getItens().size()> 5){
			return orcamento.getValor() * 0.01;
		}else{
			return proximo.desconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}

}
 