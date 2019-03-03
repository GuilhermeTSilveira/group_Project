package org.academiadecodigo.tropaDELETE;

// O grupo está tratar do score, health, e todas as cenas que faltam para o jogo

import org.academiadecodigo.tropaDELETE.food.*;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(5);

        try {

            game.init();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }
}
