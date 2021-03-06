package academy.devdojo.javacore.Dconstrutores.dominio;

public class Anime {
    private String type;
    private int episodes;
    private String name;
    private String gender;
    private String studio;

    public Anime(String name, String type, int episodes, String gender){
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }
    public Anime(String name, String type, int episodes, String gender, String studio){
        this(name, type, episodes, gender);
        this.studio = studio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }
    public void print(){
        System.out.println("Tipo: "+ this.type);
        System.out.println("Nome: "+ this.name);
        System.out.println("Episodios: "+ this.episodes);
        System.out.println("Estudio: "+ this.studio);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }
    public int getEpisodes(){
        return episodes;
    }
}
