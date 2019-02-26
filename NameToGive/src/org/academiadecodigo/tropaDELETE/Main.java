package org.academiadecodigo.tropaDELETE;


public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        try {
            game.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
