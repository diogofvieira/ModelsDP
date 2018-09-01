package designPatterns.state;



public class EmAprovacao implements EstadoOrcamento{
	
	public void aplicaDescontoExtra(Orcamento orcamento){
		orcamento.valor -= orcamento.valor * 0.02;  
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Em Aprova��o");
		
	}

}
