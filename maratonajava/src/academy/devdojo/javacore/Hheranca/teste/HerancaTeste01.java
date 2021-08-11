package academy.devdojo.javacore.Hheranca.teste;

import academy.devdojo.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco address = new Endereco();
        address.setCep("012345-209");
        address.setStreet("Rua 3");

        Pessoa people = new Pessoa();
        people.setAddress(address);
        people.setCpf("11111111");
        people.setName("Toyohisa Shimazu");
        System.out.println("--- Pessoa -----");
        people.print();

        Funcionario employee = new Funcionario();
        employee.setName("Oda Nobunaga");
        employee.setAddress(address);
        employee.setCpf("22222222");
        employee.setSalary(20000);

        System.out.println("--- Funcionário -----");
        employee.print();
    }
}
