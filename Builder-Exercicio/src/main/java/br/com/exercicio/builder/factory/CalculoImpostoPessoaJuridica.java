package br.com.exercicio.builder.factory;

import java.math.BigDecimal;

public class CalculoImpostoPessoaJuridica implements InfCalculoImposto {

	@Override
	public BigDecimal caculoImposto(BigDecimal valor) {
		
		return valor.multiply(new BigDecimal("0.04"));
	}

}
