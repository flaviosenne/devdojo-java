package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double[] salaries;

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

        double average = 0;
        for(double salary: salaries){
            average+=salary;
        }
        average /= this.salaries.length;

        System.out.println("\nMedia: "+average);
    }
}
