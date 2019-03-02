package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tropaDELETE.food.Food;
import org.academiadecodigo.tropaDELETE.food.FoodType;
import org.academiadecodigo.tropaDELETE.food.LinkedList;

public class Game {

    private LinkedList<FoodType> list = new LinkedList<>();
    FoodType type;
    Ellipse ellipse;

    private int max;

    Scenario scenario;
    Player avatarImages;

    public Game(int max) {
        this.max = max;
        this.scenario = new Scenario();

    }

    public void start() throws InterruptedException {

        createFoodObjects(max);

        list.printList(list);

        Picture avatar1 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame2.png");
        Picture avatar2 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame1.png");

        Rectangle screen = scenario.getBackgroundWindow();
        screen.draw();

        Picture background = scenario.getBackground();
        background.draw();

        Rectangle rightBorder = scenario.getRightBorder();
        rightBorder.setColor(Color.BLACK);
        rightBorder.fill();

        background.draw();
        // avatar1.draw();

        //ellipse = scenario.getEllipse();
        //ellipse.setColor(Color.YELLOW);
        //ellipse.fill();


        Player player = new Player("Player 1", avatar1, avatar2);
        KeyboardListener keyboard = new KeyboardListener(player);


        while (true) {

            Thread.sleep(15);

            player.move();

            player.spriteSheets();

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
