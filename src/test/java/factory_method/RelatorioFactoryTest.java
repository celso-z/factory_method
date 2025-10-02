package factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import service.IServico;

class RelatorioFactoryTest {

	 @Test
	    void deveRetornarExcecaoParaServicoInexistente() {
	        try {
	            IServico servico = RelatorioFactory.obterRelatorio("YAML");
	            fail();
	        } catch (IllegalArgumentException e) {
	            assertEquals("Serviço inexistente", e.getMessage());
	        }
	    }

	    @Test
	    void deveRetornarExcecaoParaServicoInvalido() {
	        try {
	            IServico servico = RelatorioFactory.obterRelatorio("");
	            fail();
	        } catch (IllegalArgumentException e) {
	            assertEquals("Serviço inválido", e.getMessage());
	        }
	    }
}
