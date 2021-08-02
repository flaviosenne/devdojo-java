package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String name;
    private int age;

    public void print(){
        System.out.println("nome: "+this.name);
        System.out.println("idade: "+this.age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age < 0 ? 0 : age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
