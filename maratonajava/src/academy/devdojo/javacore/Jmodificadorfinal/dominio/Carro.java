package academy.devdojo.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String name;
    public final double VELOCITY_LIMIT;
    public final Comprador COMPRADOR = new Comprador();


    public Carro(){
        VELOCITY_LIMIT = 250;
    }

    public final void print(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
