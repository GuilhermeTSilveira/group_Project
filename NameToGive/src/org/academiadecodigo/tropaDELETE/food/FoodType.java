package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public enum FoodType {

    CARROT(1),
    HAMBURGER(2),
    TOMATO(3),
    PIZZA(4);

    Ellipse ellipse;
    int speed;

    FoodType(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(Ellipse ellipse) throws InterruptedException {
        ellipse.translate(-3, 0);
    }

}
