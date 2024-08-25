package projetos.facade;

import projetos.facade.subsistema1.CrmService;
import projetos.facade.subsistema2.CepApi;

public class Facade {
    // temos uma base de clientes e queremos migra-los, ao consumir uma api de cep facilita a migração.
    public void migrarCliente(String nome, String cep) {
        // simula integraçao com api de cep
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
