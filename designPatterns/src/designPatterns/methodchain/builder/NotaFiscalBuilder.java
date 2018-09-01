package designPatterns.methodchain.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;

	public NotaFiscalBuilder comNomeEmpresa(String razaoSocial){
		razaoSocial = this.razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj){
		cnpj = this.cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItem(ItemDaNota item){
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes){
		observacoes = this.observacoes;
		return this;
	}
	
	public NotaFiscalBuilder data(){
		this.data = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscal criaNotaFiscal(){
		return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);		
	}
}
