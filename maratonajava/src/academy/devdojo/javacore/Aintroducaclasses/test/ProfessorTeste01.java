package academy.devdojo.javacore.Aintroducaclasses.test;

import academy.devdojo.javacore.Aintroducaclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor teacher = new Professor();
        teacher.name= "Mestre Kame";
        teacher.age= 140;
        teacher.gender= 'M';

        System.out.println("nome: "+teacher.name + ", idade: "+ teacher.age + ", sexo: "+ teacher.gender);
    }
}
