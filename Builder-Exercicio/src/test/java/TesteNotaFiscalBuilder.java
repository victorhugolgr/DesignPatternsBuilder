import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.exercicio.builder.builderImplementacao.NotaFiscalBuilder;
import br.com.exercicio.builder.model.NotaFiscal;

public class TesteNotaFiscalBuilder {

		
	@Test
	public void test() {
		NotaFiscalBuilder nfB = new NotaFiscalBuilder();
		NotaFiscal  nf = nfB.comPessoaFisica().comHeader(1254, "23/03/2016")
				
				.comProduto("Sapato 40", 5, "20")
				.comProduto("Camisa G", 10, "200")
				.construir();
		
		assertEquals(new BigDecimal("2100"), nf.totalNF());
	}

}
