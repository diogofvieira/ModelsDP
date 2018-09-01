package designPatterns.test;

import designPatterns.methodchain.builder.ItemDaNota;
import designPatterns.methodchain.builder.NotaFiscal;
import designPatterns.methodchain.builder.NotaFiscalBuilder;
import designPatterns.observer.EnviadorEmail;
import designPatterns.observer.EnviadorSms;
import designPatterns.observer.Impressora;
import designPatterns.observer.NotaFiscalDAO;

public class testeAcao {
	
	public static void main(String[] args) {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new EnviadorEmail());
		builder.adicionaAcao(new EnviadorSms());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new Impressora());
		
		NotaFiscal nf = builder.comNomeEmpresa("teste").comCnpj("teste").comItem(new ItemDaNota("teste", 1212)).comObservacoes("teste").data().criaNotaFiscal();
		
		System.out.println(nf);
	}

}