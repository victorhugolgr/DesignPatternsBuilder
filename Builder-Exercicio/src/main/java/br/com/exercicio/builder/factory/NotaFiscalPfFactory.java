package br.com.exercicio.builder.factory;

import br.com.exercicio.builder.model.NotaFiscal;

public class NotaFiscalPfFactory extends NotaFiscal{

	@Override
	protected InfCalculoImposto calculoImpostoPJPF() {
		
		return new CalculoImpostoPessoaFisica();
	}

	
	
}
