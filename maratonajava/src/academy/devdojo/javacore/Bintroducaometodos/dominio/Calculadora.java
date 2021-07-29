package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void sumTwoNumbers(){
        System.out.println(10+10);
    }
    public void subtractTwoNumbers(){
        System.out.println(10-2);
    }

    public void multiplyTwoNumbers(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2){
        if(num1 == 0 || num2 == 0) return 0;

        return num1 / num2;
    }

    public double divideTwoNumbers02(double num1, double num2){
        if(num1 != 0 || num2 != 0) {
            return num1 / num2;
        }else{
            return 0;
        }
    }

    public void printDivideTwoNumbers02(double num1, double num2){
        if(num1 != 0 || num2 != 0) {
            System.out.println("Não existe divisã por zero");
            return;
        }
        System.out.println(num1 / num2);
    }
}
