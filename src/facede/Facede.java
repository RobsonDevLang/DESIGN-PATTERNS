package facede;

import facede.sistema_cep.Cep;
import facede.sistema_externo.Service;

public class Facede {
     public void migrarCliente(String nome, String cep){
         String cidade = Cep.getInstance().recuperarCidade(cep);
         String estado = Cep.getInstance().recuperarEstado(cep);
         Service.gravarCliente(nome, cep,estado, cidade);
     }
}
