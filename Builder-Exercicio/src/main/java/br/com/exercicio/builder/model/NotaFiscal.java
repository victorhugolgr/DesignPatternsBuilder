package br.com.exercicio.builder.model;

import java.util.Date;
import java.util.List;

public class NotaFiscal {

	private int nroNF;
	private Date dataEmissao;
	private List<Produto> produtos;

	public int getNroNF() {
		return nroNF;
	}

	public void setNroNF(int nroNF) {
		this.nroNF = nroNF;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
