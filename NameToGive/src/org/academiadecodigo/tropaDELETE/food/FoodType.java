package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum FoodType { //Ana vai tratar de dar uma ellipse (inicialmente) a cada type

    CARROT(1, new Ellipse(800, 430, 80, 80), null),
    HAMBURGER(1, new Ellipse(800, 430, 80, 80), null),
    TOMATO(3, new Ellipse(800, 430, 80, 80), null),
    PIZZA(1, new Ellipse(800, 430, 80, 80), null);

    Ellipse ellipse;
    int speed;


    FoodType(int speed, Ellipse ellipse, Rectangle rectangle) {
        this.speed = speed;
        this.ellipse = ellipse;
    }

    FoodType(){

    }

    public int getSpeed() {
        return speed;
    }

    //public void move(Ellipse ellipse) throws InterruptedException {
    //    ellipse.translate(-3, 0);
    //}

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
    }

}
