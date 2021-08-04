package academy.devdojo.javacore.Eblocosinicializacao.teste;

import academy.devdojo.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Peace");

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " - ");
        }

    }
}
