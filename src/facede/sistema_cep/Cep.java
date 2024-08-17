package facede.sistema_cep;

import singleton.SingletonEager;

public class Cep {

    private static Cep cep = new Cep();

    private Cep(){
    }

    public static Cep getInstance(){
        return cep;
    }

    public String recuperarCidade(String cep){
        String cidade="Porto Alegre";
        return cidade;
    }

    public String recuperarEstado(String cep){
        String estado="RS";
        return estado;
    }

}
