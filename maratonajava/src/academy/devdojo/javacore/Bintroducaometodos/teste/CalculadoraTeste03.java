package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double result = calc.divideTwoNumbers(20, 2);

        System.out.println(result);
        System.out.println("------------------");
        calc.printDivideTwoNumbers02(20,0);
    }
}
