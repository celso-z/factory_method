package factory_method;

import service.IServico;

public class RelatorioFactory {

	public static IServico gerarRelatorio(String relatorio) {
		Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factory_method.Relatorio" + relatorio);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServico) objeto;
	}
}
