package academy.devdojo.introducao;


public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int number1 = 10;
        int number2 = 20;
        double result = number1 / (double) number2;
        System.out.println(number2 - number1);
        System.out.println(number2 + number1);
        System.out.println("valor "+number2 + number1);
        System.out.println(result);

        int remainder = 20 % 2;
        System.out.println(remainder);

        boolean isTeenGraterThenTwenty = number1 > number2;
    }
}
