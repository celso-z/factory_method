package factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import service.IServico;

class RelatorioFactoryTest {

	 @Test
	    void deveRetornarExcecaoParaServicoInexistente() {
	        try {
	            IServico servico = RelatorioFactory.gerarRelatorio("YAML");
	            fail();
	        } catch (IllegalArgumentException e) {
	            assertEquals("Serviço inexistente", e.getMessage());
	        }
	    }

	    @Test
	    void deveRetornarExcecaoParaServicoInvalido() {
	        try {
	            IServico servico = RelatorioFactory.gerarRelatorio("");
	            fail();
	        } catch (IllegalArgumentException e) {
	            assertEquals("Serviço inválido", e.getMessage());
	        }
	    }
}
