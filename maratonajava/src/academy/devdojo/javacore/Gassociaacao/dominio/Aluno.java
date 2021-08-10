package academy.devdojo.javacore.Gassociaacao.dominio;

public class Aluno {
    private String name;
    private int age;
    private Seminario seminar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Aluno(String name, int age, Seminario seminar) {
        this(name, age);
        this.seminar = seminar;
    }
}
