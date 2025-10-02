package factory_method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import service.IServico;

class RelatorioXMLTest {

	@Test
    void deveExecutarFormatura() {
		Byte[] data = {};
        IServico servico = RelatorioFactory.obterRelatorio("XML");
        assertEquals("Dados processados!", servico.processaDados(data));
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = RelatorioFactory.obterRelatorio("XML");
        assertEquals("relatorio.xml", servico.geraRelatorio());
    }

}
