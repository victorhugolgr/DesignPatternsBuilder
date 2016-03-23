package br.com.exercicio.builder.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.com.exercicio.builder.factory.InfCalculoImposto;

public abstract class NotaFiscal {

	private int nroNF;
	private Date dataEmissao;
	private List<Produto> produtos;
	private TipoNF tipoNF;
	
	
	protected abstract InfCalculoImposto calculoImpostoPJPF();
	
	public BigDecimal calculaImposto(){
		return calculoImpostoPJPF().caculoImposto(totalNF());
	}
	
	public BigDecimal totalNF(){
		double valorTotal = produtos.stream().mapToDouble(p -> p.getValor().doubleValue() * p.getQuantidade()).sum();
		return new BigDecimal(valorTotal);
	}

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

	public TipoNF getTipoNF() {
		return tipoNF;
	}

	public void setTipoNF(TipoNF tipoNF) {
		this.tipoNF = tipoNF;
	}

}
