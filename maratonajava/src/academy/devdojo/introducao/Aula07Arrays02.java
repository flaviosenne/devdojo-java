package academy.devdojo.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long float e double = 0
        // char = 'u/0000' => ' '
        // boolean = false
        // String = null

        String[] names = new String[4];
        names[0]= "Vegeta";
        names[1]= "Goku";
        names[2]= "Kurilin";
        names[3]= "Mestre Kame";

        for(int i = 0; i <names.length; i++){
            System.out.println(names[i]);
        }
    }
}
