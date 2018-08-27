package designPatterns.ChainOfResponsibilitie;

import designPatterns.strategy.Orcamento;

public class DescontoQuinhentos implements Desconto{
	
	private Desconto proximo;

	public double desconto(Orcamento orcamento){
		if(orcamento.getItens().size()> 5){
			return orcamento.getValor() * 0.7;
		}else{
			return proximo.desconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}

}
