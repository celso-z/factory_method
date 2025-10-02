package factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import service.IServico;

class RelatorioJSONTest {

	@Test
    void deveExecutarFormatura() {
		Byte[] data = {};
        IServico servico = RelatorioFactory.gerarRelatorio("JSON");
        assertEquals("Dados processados!", servico.processaDados(data));
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = RelatorioFactory.gerarRelatorio("JSON");
        assertEquals("relatorio.json", servico.geraRelatorio());
    }

}
