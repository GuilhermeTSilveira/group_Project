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

    private Ellipse[] ellipse;

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

        Rectangle avatar = new Rectangle(250, 450, 40, 80);

        Rectangle screen = scenario.getBackgroundWindow();
        screen.draw();

        Picture background = scenario.getBackground();
        background.draw();

        Rectangle rightBorder = scenario.getRightBorder();
        rightBorder.setColor(Color.BLACK);
        rightBorder.fill();


        background.draw();
        avatar.setColor(Color.BLACK);
        avatar.fill();

        /*ellipse = scenario.getEllipse();
        ellipse.setColor(Color.YELLOW);
        */


        Player player = new Player("Player 1", avatar);
        KeyboardListener keyboard = new KeyboardListener(player);

        int i = 0;

        while (true) {

            Thread.sleep(15);

            Collections.shuffle(list);

            ellipse[i].fill();

            player.move();

            type[i].move(ellipse[i]);

            if(type[i].isDeleted()) {

                ellipse[i].fill();
                i++;

            }
        }
    }

    private void createFoodObjects(int max) {

        ellipse = new Ellipse[max];

        for (int i = 0; i < max; i++) {

            type[i] = Food.createFoodObjects();

            ellipse[i] = type[i].getShape();

            list.add(type[i]);


        }
    }

}
