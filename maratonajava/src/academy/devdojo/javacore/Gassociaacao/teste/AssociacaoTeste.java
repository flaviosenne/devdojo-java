package academy.devdojo.javacore.Gassociaacao.teste;

import academy.devdojo.javacore.Gassociaacao.dominio.Aluno;
import academy.devdojo.javacore.Gassociaacao.dominio.Local;
import academy.devdojo.javacore.Gassociaacao.dominio.Professor;
import academy.devdojo.javacore.Gassociaacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno student = new Aluno("Luffy", 17);
        Professor teacher = new Professor("Barba branca", "pirata");
        Aluno[] studentsToSeminar = {student};
        Seminario seminar = new Seminario("Onde achar one peace", studentsToSeminar, local);

        Seminario[] seminarsAvailable = {seminar};

        teacher.setSeminar(seminarsAvailable);

        teacher.print();
    }
}
