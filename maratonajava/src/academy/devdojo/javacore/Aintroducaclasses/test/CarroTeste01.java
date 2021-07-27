package academy.devdojo.javacore.Aintroducaclasses.test;

import academy.devdojo.javacore.Aintroducaclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.age = 2012;
        car1.model = "Sport";
        car1.name = "Fusca Bala";

        car2.age = 2014;
        car2.model = "GT 500";
        car2.name = "Mustang";

        System.out.println("nome: "+car1.name + ", modelo: "+car1.model+ ", ano: "+ car1.age);
        System.out.println("nome: "+car2.name + ", modelo: "+car2.model+ ", ano: "+ car2.age);
    }
}
