package designPatterns.state;



public class Aprovado implements EstadoOrcamento{
	
	public void aplicaDescontoExtra(Orcamento orcamento){
		orcamento.valor -= orcamento.valor * 0.05;  
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Reprovado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}
}
