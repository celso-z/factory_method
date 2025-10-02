package factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import service.IServico;

class RelatorioXMLTest {

	@Test
    void deveExecutarFormatura() {
		Byte[] data = {};
        IServico servico = RelatorioFactory.gerarRelatorio("XML");
        assertEquals("Dados processados!", servico.processaDados(data));
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = RelatorioFactory.gerarRelatorio("XML");
        assertEquals("relatorio.xml", servico.geraRelatorio());
    }

}
