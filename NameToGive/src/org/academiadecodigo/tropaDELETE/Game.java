package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.tropaDELETE.food.Food;
import org.academiadecodigo.tropaDELETE.food.FoodTypes;
import org.academiadecodigo.tropaDELETE.food.Healthy;

public class Game {

    FoodTypes[] foods;

    public Game(int max) {
        foods = new FoodTypes[5];
    }


    public void start() throws InterruptedException {

        createFoodObjects();
        Rectangle background = new Rectangle(10, 10, 500, 500);
        Rectangle avatar = new Rectangle(100, 430, 40, 80);

        background.draw();
        avatar.setColor(Color.BLACK);
        avatar.fill();

        Player player = new Player("Player 1", avatar);
        KeyboardListener keyboard = new KeyboardListener(player);

        while (true) {
            Thread.sleep(10);
            player.move();
        }
    }

    public void createFoodObjects(){

        for (int i = 0; i < foods.length; i++) {

            foods[i] = new Healthy(); // get those randoms.

            System.out.println(foods[i]);
        }
    }
}
