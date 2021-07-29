package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 =1;
        int num2 =2;

        calc.alterTwoNumbers(num1,num2);
        System.out.println("Dentro calculadora teste 04");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
}
