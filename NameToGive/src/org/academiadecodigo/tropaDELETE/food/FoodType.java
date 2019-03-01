package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tropaDELETE.Scenario;

public enum FoodType {

    CARROT(1, new Ellipse(500, 400, 80, 80)),
    HAMBURGER(1, new Ellipse(500, 400, 80, 80)),
    TOMATO(1, new Ellipse(500, 400, 80, 80)),
    PIZZA(1, new Ellipse(500, 400, 80, 80));

    Ellipse ellipse;
    int speed;


    FoodType(int speed, Ellipse ellipse) {
        this.speed = speed;
        this.ellipse = ellipse;
    }

    FoodType(){

    }

    public int getSpeed() {
        return speed;
    }

    public Ellipse getShape() {
        switch (this) {
            case CARROT:
                this.ellipse.setColor(Color.ORANGE);
                this.ellipse.fill();
                break;
            case HAMBURGER:
                this.ellipse.setColor(Color.YELLOW);
                this.ellipse.fill();
                break;
            case TOMATO:
                this.ellipse.setColor(Color.RED);
                this.ellipse.fill();
                break;
            case PIZZA:
                this.ellipse.setColor(Color.GREEN);
                this.ellipse.fill();
                break;
        }

        return ellipse;
    }

    public void move(Ellipse ellipse){

        if (ellipse.getX() > -10) {

            ellipse.translate(-5, 0);

        }

        if(ellipse.getX() == -10){
            ellipse.delete();
        }
    }

}
