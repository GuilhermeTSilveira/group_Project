package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tropaDELETE.Scenario;

import java.util.Collections;

public enum FoodType {

    CARROT(15, new Ellipse( 1300, 300 ,80,80)),
    HAMBURGER(15, new Ellipse(1300, 440, 80, 80)),
    TOMATO(15, new Ellipse(1300, 300, 80, 80)),
    PIZZA(15, new Ellipse(1390, 440, 80, 80));

    private Ellipse ellipse;
    private int speed;


    FoodType(int speed, Ellipse ellipse) {

        this.speed = speed;

        this.ellipse = ellipse;
    }

    public int getSpeed() {

        return speed;

    }

    public Ellipse getShape() {

        switch (this) {

            case CARROT:

                this.ellipse.setColor(Color.ORANGE);

                break;

            case HAMBURGER:

                this.ellipse.setColor(Color.YELLOW);

                break;

            case TOMATO:

                this.ellipse.setColor(Color.RED);

                break;

            case PIZZA:

                this.ellipse.setColor(Color.GREEN);

                break;

        }

        return ellipse;
    }

    public static void move(Ellipse ellipse, FoodType type){

        if (ellipse.getX() > -100 ) {

            ellipse.translate(-type.getSpeed(), 0);

        }

        if(ellipse.getX() <= -100){

            ellipse.translate(1300,0);

            ellipse.delete();

        }
    }
}
