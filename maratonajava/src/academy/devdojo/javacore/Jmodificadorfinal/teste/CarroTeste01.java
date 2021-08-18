package academy.devdojo.javacore.Jmodificadorfinal.teste;

import academy.devdojo.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro car = new Carro();
        Ferrari ferrari = new Ferrari();
        Comprador buyer = new Comprador();
        ferrari.setName("Teste");
        car.COMPRADOR.setName("Kuririn");
        System.out.println(car.VELOCITY_LIMIT);
        System.out.println(car.COMPRADOR);
        ferrari.print();
    }
}
