package br.com.exercicio.builder.factory;

import br.com.exercicio.builder.model.NotaFiscal;

public class NotaFiscalPjFactory extends NotaFiscal {

	@Override
	protected InfCalculoImposto calculoImpostoPJPF() {
		
		return new CalculoImpostoPessoaJuridica();
	}

}
