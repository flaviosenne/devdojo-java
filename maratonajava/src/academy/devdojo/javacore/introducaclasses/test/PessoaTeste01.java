package academy.devdojo.javacore.introducaclasses.test;

import academy.devdojo.javacore.introducaclasses.dominio.Estudante;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Estudante student = new Estudante();
        student.name = "Luffy";
        student.age= 21;
        student.gender= 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

    }
}
