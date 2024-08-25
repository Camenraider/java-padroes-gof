package projetos.facade.subsistema2;

import projetos.singletos.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Araçatuba";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }

}
