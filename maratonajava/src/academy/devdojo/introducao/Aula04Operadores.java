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

        // && (AND) || (OR) !

        int age = 32;
        float salary = 2000;
        boolean isWithinLaw = age > 30 && salary >= 4612;

        System.out.println(isWithinLaw);

        double currentAccount =200;
        double savingsAccount =1000;
        double playstationValue = 5000;

        boolean isPlaystation5Buyer = savingsAccount > playstationValue || currentAccount > playstationValue;
        System.out.println(isPlaystation5Buyer);

        
    }
}
