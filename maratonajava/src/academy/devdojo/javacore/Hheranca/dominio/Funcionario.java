package academy.devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salary;

    public void print(){
        super.print();
        System.out.println("Salario: "+ salary);


    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
