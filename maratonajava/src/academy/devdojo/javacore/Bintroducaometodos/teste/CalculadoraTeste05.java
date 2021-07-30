package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] nums = {1,2,3,4,5};

        calc.sumArray(nums);
        calc.sumVarArgs("Soma: ",2,3,4,5,6);
    }
}
