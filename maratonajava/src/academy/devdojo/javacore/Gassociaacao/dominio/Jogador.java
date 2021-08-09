package academy.devdojo.javacore.Gassociaacao.dominio;

public class Jogador {
    private String name;
    private Time team;

    public Jogador(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Nome: "+name);
        if(team != null){
            System.out.println("Time: "+team.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getTeam() {
        return team;
    }

    public void setTeam(Time team) {
        this.team = team;
    }
}
