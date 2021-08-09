package academy.devdojo.javacore.Gassociaacao.teste;

import academy.devdojo.javacore.Gassociaacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociaacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador player1 = new Jogador("Pelé");
        Time team = new Time("Seleção Brasileira");

        player1.setTeam(team);
        player1.print();
    }
}
