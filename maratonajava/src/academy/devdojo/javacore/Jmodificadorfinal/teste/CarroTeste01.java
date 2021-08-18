package academy.devdojo.javacore.Jmodificadorfinal.teste;

import academy.devdojo.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro car = new Carro();
        Comprador buyer = new Comprador();
        car.COMPRADOR.setName("Kuririn");
        System.out.println(car.VELOCITY_LIMIT);
        System.out.println(car.COMPRADOR);
    }
}
