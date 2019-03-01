package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tropaDELETE.Scenario;

import java.util.Collections;

public enum FoodType {

    CARROT(1, new Ellipse( 990, 450 ,80,80)),
    HAMBURGER(1, new Ellipse(990, 450, 80, 80)),
    TOMATO(1, new Ellipse(990, 450, 80, 80)),
    PIZZA(1, new Ellipse(990, 450, 80, 80));

    Ellipse ellipse;
    private boolean delete;
    int speed;


    FoodType(int speed, Ellipse ellipse) {
        this.speed = speed;
        this.ellipse = ellipse;
        this.delete = false;
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

    public void move(Ellipse ellipse){

        if (ellipse.getX() > -50) {

            ellipse.translate(-5, 0);

        }

        if(ellipse.getX() == -50){

            ellipse.delete();

            ellipse.translate(1050,0);

            delete = true;
        }
    }

    public void resetPosition(Ellipse ellipse){



    }

    public boolean isDeleted(){

        return this.delete;

    }

}
