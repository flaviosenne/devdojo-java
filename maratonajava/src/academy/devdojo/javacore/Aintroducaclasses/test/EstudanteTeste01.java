package academy.devdojo.javacore.Aintroducaclasses.test;

import academy.devdojo.javacore.Aintroducaclasses.dominio.Estudante;

public class EstudanteTeste01 {
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
