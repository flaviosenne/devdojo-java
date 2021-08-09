package academy.devdojo.javacore.Gassociaacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software da previsão do futuro");
        System.out.println("Digite sua pergunta e responderei sim ou não");
        String question = input.nextLine();
        if(question.charAt(0) == ' '){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }

    }
}
