package org.academiadecodigo.tropaDELETE;

    // Ana vai criar a classe LinkedList
    // Corrigir o movimento do boneco (smooth e mais rapido)

public class Main {
    public static void main(String[] args) {

        Game game = new Game(5);

        try {

            game.start();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
