package academy.devdojo.introducao;

public class Aula06EstruturasRepeticao {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println("while "+count);
            count++;
        }
        count = 0;
        do {
            System.out.println("do-while "+count);
            count++;
        }while (count < 10);

        for (count=0; count <10; count++){
            System.out.println("for "+count);
        }
    }
}
