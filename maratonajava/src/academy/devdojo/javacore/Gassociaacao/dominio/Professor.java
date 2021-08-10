package academy.devdojo.javacore.Gassociaacao.dominio;

public class Professor {
    private String name;
    private String speciality;
    private Seminario[] seminar;

    public Professor(String name) {
        this.name = name;
    }
    public Professor(String name, String speciality) {
        this(name);
        this.speciality = speciality;
    }
    public Professor(String name, String speciality, Seminario[] seminar) {
        this(name, speciality);
        this.seminar = seminar;
    }

    public void print(){
        System.out.println("-------------------");
        System.out.println("Professor: "+name);
        if(seminar == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for (Seminario seminar: seminar){
            System.out.println("Titulo: "+ seminar.getTitle());
            System.out.println("Local: "+seminar.getLocal().getAddress());
            System.out.println("** Alunos **");
            if(seminar.getStudent() == null || seminar.getStudent().length == 0) continue;
            for(Aluno student: seminar.getStudent()){
                System.out.println("Nome: "+ student.getName());
                System.out.println("Idade: "+ student.getAge());
            }
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Seminario[] getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminario[] seminar) {
        this.seminar = seminar;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
