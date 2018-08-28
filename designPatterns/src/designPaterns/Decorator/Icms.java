package designPaterns.Decorator;

public class Icms extends Imposto{

	public Icms(){};
	
	public Icms(Imposto outroImposto){
		super(outroImposto);
	};
	
	@Override
	public double calcula(Orcamento orcamento) {
		double icms = orcamento.getValor() * 0.6 + calculaOutroImposto(orcamento);
		return icms;
	}

	

}
