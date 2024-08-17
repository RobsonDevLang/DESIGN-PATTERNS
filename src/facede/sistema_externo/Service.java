package facede.sistema_externo;

public class Service {

    private Service() {
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("cliente salvo");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }
}
