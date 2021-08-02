package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void print(){
        System.out.println("Nome: "+this.name);
        System.out.println("Idade: "+this.age);
        System.out.print("Salario: ");

        if(this.salaries == null) return;

        for(double salary: salaries){
            System.out.print(salary+ " ");
        }
        printAverage();
    }

    public void printAverage(){
        if(this.salaries == null) return;

        for(double salary: salaries){
            average+=salary;
        }
        average /= this.salaries.length;

        System.out.println("\nMedia: "+average);
    }

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

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
    }

}
