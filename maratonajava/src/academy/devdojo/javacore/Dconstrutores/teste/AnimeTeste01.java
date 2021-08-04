package academy.devdojo.javacore.Dconstrutores.teste;

import academy.devdojo.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "M");
        Anime anime2 = new Anime();
        anime.print();
        System.out.println("-----------------");
        anime2.print();
    }
}
