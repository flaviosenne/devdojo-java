package academy.devdojo.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000l;
        long ageLong = 10000l;
        double salaryDouble = 2000d;
        float salaryFloat = 2500.0f;
        byte ageByte = 10;
        short ageShort = 10;
        boolean real = true;
        boolean untrue = false;
        char character = 'M';

        String name = "it's a loooong text";

        System.out.println(name);
        System.out.println("a idade é " + age);
        System.out.println(real + " "+ untrue);
        System.out.println(character);
    }
}
