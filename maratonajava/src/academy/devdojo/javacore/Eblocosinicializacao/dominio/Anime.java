package academy.devdojo.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String name;
    private int[] episodes;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++){
            episodes[i] = i+1;
        }
    }

    public Anime(String name){
        this.name = name;
    }
    public Anime() {
        for (int episode: episodes){
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
