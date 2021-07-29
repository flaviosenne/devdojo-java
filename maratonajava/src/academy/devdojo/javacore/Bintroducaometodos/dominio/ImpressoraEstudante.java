package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void print(Estudante student){

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
        student.name = "Gohan";
        System.out.println("----------------------");
    }
}
