package designPatterns.test;

import designPatterns.methodchain.builder.ItemDaNota;
import designPatterns.methodchain.builder.NotaFiscal;
import designPatterns.methodchain.builder.NotaFiscalBuilder;


public class testeDaNotaFiscal {
	
	
	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.comNomeEmpresa("Teste")
		.comCnpj("131224124")
		.comItem(new ItemDaNota("Teste1", 1223))
		.comItem(new ItemDaNota("Teste2", 1323))
		.comItem(new ItemDaNota("Teste3", 1723))
		.data()
		.comObservacoes("testetete");
		
		NotaFiscal nf = builder.criaNotaFiscal();
		
		System.out.println(nf.getValorBruto());
	}
	
	

}
