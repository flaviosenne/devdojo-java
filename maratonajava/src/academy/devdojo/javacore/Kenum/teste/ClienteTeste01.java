package academy.devdojo.javacore.Kenum.teste;

import academy.devdojo.javacore.Kenum.dominio.Cliente;
import academy.devdojo.javacore.Kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente client1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente client2 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA);
        Cliente client3 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA);
        Cliente client4 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
    }
}
