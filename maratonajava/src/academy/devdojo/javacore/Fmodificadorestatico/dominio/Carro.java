package academy.devdojo.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String name;
    private double velocity;
    private static double limitVelocity = 250;

    public Carro(String name, double velocity) {
        this.name = name;
        this.velocity = velocity;
    }

    public void print(){
        System.out.println("----------------------");
        System.out.println("Nome: "+name);
        System.out.println("Velocidade máxima: "+velocity);
        System.out.println("Velocidade limite: "+Carro.limitVelocity);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public static void setLimitVelocity(double limitVelocity){
        Carro.limitVelocity = limitVelocity;
    }

    public static double getLimitVelocity(){
        return limitVelocity;
    }

}
