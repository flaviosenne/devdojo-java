package academy.devdojo.javacore.Fmodificadorestatico.teste;

import academy.devdojo.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro car1 = new Carro("BMW", 280);
        Carro car2 = new Carro("Mercedes", 275);
        Carro car3 = new Carro("Audi", 290);

        Carro.setLimitVelocity(180);

        car1.print();
        car2.print();
        car3.print();
    }
}
