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

    public void alterTwoNumbers(int num1, int num2){
        num1 = 99;
        num2 = 33;

        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }

    public void sumArray(int[] nums){
        int sum  = 0;
        for(int num: nums){
            sum+=num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(String value,int... nums){
        int sum  = 0;
        for(int num: nums){
            sum+=num;
        }
        System.out.println(value+sum);
    }
}
