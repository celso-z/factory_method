package factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import service.IServico;

class RelatorioCSVTest {

	@Test
    void deveExecutarFormatura() {
		Byte[] data = {};
        IServico servico = RelatorioFactory.obterRelatorio("CSV");
        assertEquals("Dados processados!", servico.processaDados(data));
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = RelatorioFactory.obterRelatorio("CSV");
        assertEquals("relatorio.csv", servico.geraRelatorio());
    }

}
