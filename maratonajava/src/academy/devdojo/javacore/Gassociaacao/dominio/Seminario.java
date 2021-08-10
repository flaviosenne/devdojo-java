package academy.devdojo.javacore.Gassociaacao.dominio;

public class Seminario {
    private String title;
    private Aluno[] student;
    private Local local;

    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(String title, Aluno[] student) {
        this(title);
        this.student = student;
    }

    public Seminario(String title, Aluno[] student, Local local) {
        this(title,student);
        this.local = local;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Aluno[] getStudent() {
        return student;
    }

    public void setStudent(Aluno[] student) {
        this.student = student;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
