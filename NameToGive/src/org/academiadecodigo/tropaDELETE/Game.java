package org.academiadecodigo.tropaDELETE;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tropaDELETE.food.Food;
import org.academiadecodigo.tropaDELETE.food.FoodType;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Game {

    private List<FoodType> list;

    private FoodType[] type;

    private Picture[] picture;

    private int max;

    Scenario scenario;

    public Game(int max) {

        this.max = max;

        this.scenario = new Scenario();

        list = new LinkedList<>();

        type = new FoodType[max];
    }

    public void start() throws InterruptedException {

        createFoodObjects(max);

        //list.printList(list);

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


        background.draw();
        // avatar1.draw();

        /*ellipse = scenario.getEllipse();
        ellipse.setColor(Color.YELLOW);
        */


        Player player = new Player("Player 1", avatar1, avatar2, avatar3, avatar4, avatar5, avatar6);
        KeyboardListener keyboard = new KeyboardListener(player);

        int i = 0;

        while (true) {

            Thread.sleep(15);

            picture[i].draw();

            Collections.shuffle(list);

            player.move();

            player.spriteSheets();

            move(picture[i], type[i]);

            if (picture[i].getX() < -80) {

                i++;

            }

            if (i == max) {

                i = 0;

            }
        }
    }

    private void createFoodObjects(int max) {

        picture = new Picture[max];

        for (int i = 0; i < max; i++) {

            type[i] = Food.createFoodObjects();

            picture[i] = type[i].getShape();

            list.add(type[i]);

        }
    }

    public void move(Picture picture, FoodType type) {

        FoodType.move(picture, type);
    }

}
