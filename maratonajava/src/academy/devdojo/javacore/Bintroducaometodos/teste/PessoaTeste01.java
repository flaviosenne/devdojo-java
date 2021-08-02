package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa person = new Pessoa();
        person.setName("Jiraya");
        person.setAge(-1);

        person.print();
    }
}
