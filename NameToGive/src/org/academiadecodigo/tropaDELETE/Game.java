package org.academiadecodigo.tropaDELETE;

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

        Rectangle screen = scenario.getBackgroundWindow();
        screen.draw();

        Picture background = scenario.getBackground();
        background.draw();


        background.draw();
        // avatar1.draw();

        /*ellipse = scenario.getEllipse();
        ellipse.setColor(Color.YELLOW);
        */


        Player player = new Player("Player 1");
        KeyboardListener keyboard = new KeyboardListener(player);

        int i = 0;

        while (true) {

            Thread.sleep(15);

            ellipse[i].fill();

            Collections.shuffle(list);

            player.draw();

            player.move();

            //type.move(ellipse);
            move(ellipse[i], type[i]);

            if(ellipse[i].getX() < -80) {

                i++;

            }

            if (i == max){

                i = 0;

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

    public void move(Ellipse ellipse, FoodType type){

        FoodType.move(ellipse, type);
    }

}
