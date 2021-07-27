package academy.devdojo.javacore.Aintroducaclasses.test;

import academy.devdojo.javacore.Aintroducaclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante student = new Estudante();
        Estudante student2 = new Estudante();

        student.name ="Sanji";
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);

        System.out.println("--------------------------");
        System.out.println(student2.name);
        System.out.println(student2.gender);
        System.out.println(student2.age);

    }
}
