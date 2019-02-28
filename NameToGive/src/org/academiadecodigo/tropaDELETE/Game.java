package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.tropaDELETE.food.Food;
import org.academiadecodigo.tropaDELETE.food.FoodType;
import org.academiadecodigo.tropaDELETE.food.LinkedList;

public class Game {

    private LinkedList<FoodType> list = new LinkedList<>();
    FoodType type;
    Ellipse ellipse;

    private int max;

    Rectangle background = new Rectangle(10, 10, 800, 500);
    Rectangle barRight = new Rectangle(background.getWidth(), 10, 70, 501);
    Rectangle barLeft = new Rectangle(10, 10, 70, 501);


    public Game(int max) {
        this.max = max;
    }

    public void start() throws InterruptedException {

        createFoodObjects(max);

        list.printList(list);
        Rectangle avatar = new Rectangle(250, 430, 40, 80);

        background.draw();
        avatar.setColor(Color.BLACK);
        avatar.fill();

        barRight.setColor(Color.WHITE);
        barRight.fill();

        barLeft.setColor(Color.WHITE);
        barLeft.fill();


        Player player = new Player("Player 1", avatar);
        KeyboardListener keyboard = new KeyboardListener(player);


        while (true) {

            Thread.sleep(15);

            player.move();

            type.move(ellipse);


        }
    }

    private void createFoodObjects(int max) {

        for (int i = 0; i < max; i++) {

            type = Food.createFoodObjects();

            list.add(type);

            ellipse = type.getShape();

        }
    }

}
