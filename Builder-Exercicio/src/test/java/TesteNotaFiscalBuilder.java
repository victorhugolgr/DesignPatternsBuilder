import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.exercicio.builder.builderImplementacao.NotaFiscalBuilder;
import br.com.exercicio.builder.model.NotaFiscal;

public class TesteNotaFiscalBuilder {

	@Test
	public void deve_Totalizar_NF_Igual_2100() {
		NotaFiscalBuilder nfB = new NotaFiscalBuilder();
		NotaFiscal nf = nfB.comPessoaFisica()
				.comHeader(1254, "23/03/2016")
				.comProduto("Sapato 40", 5, "20")
				.comProduto("Camisa G", 10, "200")
				.construir();

		assertEquals(new BigDecimal("2100"), nf.totalNF());
	}

	@Test
	public void deve_Calcular_Valor_Imposto_PF_Igual_7() {
		NotaFiscalBuilder nfB = new NotaFiscalBuilder();
		NotaFiscal nf = nfB.comPessoaFisica()
				.comHeader(1478, "30/03/20160")
				.comProduto("Celular Moto G 2", 2, "50")
				.construir();
		assertEquals(new BigDecimal("7.00"), nf.calculaImposto());

	}
	
	@Test
	public void deve_Calcular_Valor_Imposto_PJ_Igual_4() {
		NotaFiscalBuilder nfB = new NotaFiscalBuilder();
		NotaFiscal nf = nfB.comPessoaJuridica()
				.comHeader(1478, "30/03/20160")
				.comProduto("Celular Moto G 2", 2, "50")
				.construir();
		assertEquals(new BigDecimal("4.00"), nf.calculaImposto());

	}

}
