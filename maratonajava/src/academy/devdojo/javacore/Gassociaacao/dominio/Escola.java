package academy.devdojo.javacore.Gassociaacao.dominio;

public class Escola {
    private String name;
    private Professor[] teachers;

    public Escola(String name) {
        this.name = name;
    }

    public Escola(String name, Professor[] teachers) {
        this(name);
        this.teachers = teachers;
    }

    public void print(){
        System.out.println("Nome Escola: "+name);
        if(teachers == null){
            return;
        }
        for(Professor teacher: teachers){
            System.out.println("Professor: "+teacher.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Professor[] teachers) {
        this.teachers = teachers;
    }
}
