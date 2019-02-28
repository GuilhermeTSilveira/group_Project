package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum FoodType { //Ana vai tratar de dar uma ellipse (inicialmente) a cada type

    CARROT(1, new Ellipse(400, 450, 30, 30), null),
    HAMBURGER(2, null, new Rectangle(400, 400, 30, 30)),
    TOMATO(3, new Ellipse(400, 400, 30, 30), null),
    PIZZA(4, null, new Rectangle(400, 400, 30, 30));

    Ellipse ellipse;
    Rectangle rectangle;
    int speed;


    FoodType(int speed, Ellipse ellipse, Rectangle rectangle) {
        this.speed = speed;
        this.ellipse = ellipse;
        this.rectangle = rectangle;
    }

    public int getSpeed() {
        return speed;
    }

    public void move(Ellipse ellipse) throws InterruptedException {
        ellipse.translate(-3, 0);
    }

    public void getShape() {
        switch (this) {
            case CARROT:
                this.ellipse.setColor(Color.ORANGE);
                this.ellipse.fill();
                break;
            case HAMBURGER:
                this.rectangle.setColor(Color.YELLOW);
                this.rectangle.fill();
                break;
            case TOMATO:
                this.ellipse.setColor(Color.RED);
                this.ellipse.fill();
                break;
            case PIZZA:
                this.rectangle.setColor(Color.GREEN);
                this.rectangle.fill();
                break;
        }
    }

}
