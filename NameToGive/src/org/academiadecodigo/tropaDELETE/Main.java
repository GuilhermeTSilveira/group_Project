package org.academiadecodigo.tropaDELETE;
    // Ana vai criar a classe LinkedList
    // Corrigir o movimento do boneco (smooth e mais rapido)

import org.academiadecodigo.tropaDELETE.food.FoodType;
import org.academiadecodigo.tropaDELETE.food.Healthy;
import org.academiadecodigo.tropaDELETE.food.Junk;
import org.academiadecodigo.tropaDELETE.food.LinkedList;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(5);

        LinkedList list = new LinkedList();
        list.add(list, Healthy.getTypes());
        list.add(list, Junk.getTypes());
        list.add(list, Healthy.getTypes());
        list.add(list, Junk.getTypes());
        list.add(list, Junk.getTypes());
        list.add(list, Junk.getTypes());

        LinkedList.printList(list);

        try {

            game.start();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
