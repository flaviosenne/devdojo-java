package academy.devdojo.javacore.Gassociaacao.teste;

import academy.devdojo.javacore.Gassociaacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociaacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador player1 = new Jogador("Cafu");
        Jogador player2 = new Jogador("Pelé");
        Time team = new Time("Brasil");
        Jogador[] players = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);

        System.out.println("--- Jogador ---");

        player1.print();

        System.out.println("--- Time ---");

        team.print();
    }
}
