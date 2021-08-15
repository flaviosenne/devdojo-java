package academy.devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salary;

    public Funcionario(String name){
        super(name);
    }
    public void print(){
        super.print();
        System.out.println("Salario: "+ salary);
    }

    public void paymentReport(){
        System.out.println("Eu "+ this.name+ " recebi  o salario de "+ this.salary);
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
