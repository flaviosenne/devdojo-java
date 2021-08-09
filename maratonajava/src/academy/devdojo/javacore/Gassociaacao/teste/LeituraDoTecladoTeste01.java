package academy.devdojo.javacore.Gassociaacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String name = input.nextLine();
        System.out.println("Digite sua idade");
        int age = input.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char gender = input.next().charAt(0);

        System.out.println(" ------------------ ");
        System.out.println("Nome "+ name);
        System.out.println("Idade "+ age);
        System.out.println("Sexo "+ gender);
    }
}
