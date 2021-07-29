package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante student01 = new Estudante();
        Estudante student02 = new Estudante();
        ImpressoraEstudante printer = new ImpressoraEstudante();

        student01.name = "Modoriya";
        student01.age = 15;
        student01.gender = 'M';

        student02.name = "Sakura";
        student02.age = 16;
        student02.gender = 'F';


        printer.print(student01);
        printer.print(student02);

        System.out.println("########################");
        printer.print(student01);
        printer.print(student02);

    }
}
