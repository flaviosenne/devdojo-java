package academy.devdojo.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String name;
    public final double VELOCITY_LIMIT;

    public Carro(){
        VELOCITY_LIMIT = 250;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
