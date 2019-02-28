package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum FoodType { //Ana vai tratar de dar uma ellipse (inicialmente) a cada type

    CARROT(1, new Ellipse(400,450,30,30)),
    HAMBURGER(2, new Ellipse(400,400,30,30)),
    TOMATO(3, new Ellipse(400,400,30,30)),
    PIZZA(4, new Ellipse(400,400,30,30));

    Ellipse ellipse;
    int speed;


    FoodType(int speed, Ellipse ellipse) {
        this.speed = speed;
        this.ellipse = ellipse;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(Ellipse ellipse) throws InterruptedException {
        ellipse.translate(-3, 0);
    }

}
