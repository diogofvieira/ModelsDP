package designPatterns.state;


public class Finalizado implements EstadoOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Finalizado");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Finalizado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Finalizado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Finalizado");
		
	}

}
