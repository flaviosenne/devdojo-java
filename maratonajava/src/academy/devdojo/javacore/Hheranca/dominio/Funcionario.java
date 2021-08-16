package academy.devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salary;

    static {
        System.out.println("Desntro do bloco de inicialização statico de Funcionario");
    }

    {
        System.out.println("Desntro do bloco de inicialização de Funcionario 1");
    }
    {
        System.out.println("Desntro do bloco de inicialização de Funcionario 2");
    }
    public Funcionario(String name){
        super(name);
        System.out.println("Dentro do contrutor de Funcionario");
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
