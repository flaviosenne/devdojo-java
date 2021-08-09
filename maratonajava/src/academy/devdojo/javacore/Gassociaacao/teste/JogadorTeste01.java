package academy.devdojo.javacore.Gassociaacao.teste;

import academy.devdojo.javacore.Gassociaacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador player1 = new Jogador("Pelé");
        Jogador player2 = new Jogador("Romário");
        Jogador player3 = new Jogador("Cafu");

        Jogador[] players = {player1, player2, player3};
        for (Jogador player: players){
            player.print();
        }
    }
}
