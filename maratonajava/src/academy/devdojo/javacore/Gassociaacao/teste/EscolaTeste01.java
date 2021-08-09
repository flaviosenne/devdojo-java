package academy.devdojo.javacore.Gassociaacao.teste;

import academy.devdojo.javacore.Gassociaacao.dominio.Escola;
import academy.devdojo.javacore.Gassociaacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor teacher1 = new Professor("Jiraya Sensei");
        Professor teacher2 = new Professor("Kakashi Sensei");
        Professor[] teachers = {teacher1,teacher2};
        Escola school = new Escola("Konoha", teachers);

        school.print();

    }
}
