package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario employee = new Funcionario();
        employee.setName("Sanji");
        employee.setAge(23);
        employee.setSalaries(new double[]{1200, 987.32, 2000});

        employee.print();
    }
}
