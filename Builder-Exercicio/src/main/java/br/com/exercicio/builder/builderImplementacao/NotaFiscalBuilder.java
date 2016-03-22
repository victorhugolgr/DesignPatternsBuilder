package br.com.exercicio.builder.builderImplementacao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import br.com.exercicio.builder.model.NotaFiscal;
import br.com.exercicio.builder.model.Produto;

public class NotaFiscalBuilder {

	private NotaFiscal instancia;

	public NotaFiscalBuilder() {
		this.instancia = new NotaFiscal();
	}
	
	public NotaFiscalBuilder comHeader(int nroNF, String data){
		this.instancia.setNroNF(nroNF);
		
		//set data de Emissão através de uma String
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
		try {
			this.instancia.setDataEmissao(simpleDateFormat.parse(data));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return this;
	}
	
	public NotaFiscalBuilder comProduto(String nome, int quantidade, String valor){
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		produto.setValor(new BigDecimal(valor));
		
		if(this.instancia.getProdutos() == null){
			this.instancia.setProdutos(new ArrayList<Produto>());
		}
		
		this.instancia.getProdutos().add(produto);
		
		return this;
	}

	public NotaFiscal construir() {
		return this.instancia;
	}

}
