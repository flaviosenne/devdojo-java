package academy.devdojo.javacore.Gassociaacao.dominio;

public class Time {
    private String name;
    private Jogador[] players;

    public Time(String name) {
        this.name = name;
    }

    public Time(String name, Jogador[] players) {
        this(name);
        this.players = players;
    }

    public void print(){
        System.out.println("Nome: "+name);
        if(players == null){
            return;
        }
        for(Jogador player: players){
            System.out.println("Jogador: "+ player.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogador[] getPlayers() {
        return players;
    }

    public void setPlayers(Jogador[] players) {
        this.players = players;
    }
}
