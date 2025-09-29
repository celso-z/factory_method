package factory_method;

import service.IServico;

public class RelatorioCSV implements IServico {

	@Override
	public String processaDados(Byte[] dados) {
		return "Dados processados!";
	}

	@Override
	public String geraRelatorio() {
		return "relatorio.csv";
	}

}
