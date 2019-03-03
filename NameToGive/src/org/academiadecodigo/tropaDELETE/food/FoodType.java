package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum FoodType {

    PEPPER(15, new Picture(1300, 300, "org/academiadecodigo/tropaDELETE/resources/food/1.png")),
    HAMBURGER(10, new Picture (1390, 430, "org/academiadecodigo/tropaDELETE/resources/food/3.png")),
    BROCOLLI(15, new Picture(1300, 300, "org/academiadecodigo/tropaDELETE/resources/food/4.png")),
    PIZZA(10, new Picture(1390, 420, "org/academiadecodigo/tropaDELETE/resources/food/2.png"));

    private Picture picture;
    private int speed;


    FoodType(int speed, Picture picture) {

        this.speed = speed;

        this.picture = picture;
    }

    public int getSpeed() {

        return speed;

    }

    public Picture getShape() {
        return picture;
    }

    public static void move(Picture picture, FoodType type){

        if (picture.getX() > -200 ) {

            picture.translate(-type.getSpeed(), 0);

        }

        if(picture.getX() <= -200){

            picture.translate(1300,0);

            picture.delete();

        }
    }
}
