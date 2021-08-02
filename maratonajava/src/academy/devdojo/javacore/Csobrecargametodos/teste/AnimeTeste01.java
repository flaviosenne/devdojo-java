package academy.devdojo.javacore.Csobrecargametodos.teste;

import academy.devdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV", 12);
        anime.print();
    }
}
