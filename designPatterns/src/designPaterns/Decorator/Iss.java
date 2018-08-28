package designPaterns.Decorator;

public class Iss extends Imposto{
	
	public Iss(Imposto outroImposto){
		super(outroImposto);
	}

	public Iss(){
		
	}

	@Override
	public double calcula(Orcamento orcamento) {
		double iss = orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);
		return iss;
	}


}
