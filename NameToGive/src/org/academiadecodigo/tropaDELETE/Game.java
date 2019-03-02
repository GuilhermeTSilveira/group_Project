package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tropaDELETE.food.Food;
import org.academiadecodigo.tropaDELETE.food.FoodType;
import org.academiadecodigo.tropaDELETE.food.LinkedList;

import java.util.Collections;

public class Game {

    private LinkedList<FoodType> list = new LinkedList<>();
    private FoodType type;
    private Ellipse ellipse;

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

        Picture avatar1 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame1.png");
        Picture avatar2 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame2.png");
        Picture avatar3 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame3.png");
        Picture avatar4 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame4.png");
        Picture avatar5 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame5.png");
        Picture avatar6 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame6.png");

        Rectangle screen = scenario.getBackgroundWindow();
        screen.draw();

        Picture background = scenario.getBackground();
        background.draw();

        Rectangle rightBorder = scenario.getRightBorder();
        rightBorder.setColor(Color.BLACK);
        rightBorder.fill();

        background.draw();
        // avatar1.draw();

        ellipse = scenario.getEllipse();
        ellipse.setColor(Color.YELLOW);
        ellipse.fill();


        Player player = new Player("Player 1", avatar1, avatar2, avatar3, avatar4, avatar5, avatar6);
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
