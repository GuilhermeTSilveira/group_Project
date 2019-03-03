package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum FoodType {

    PEPPER(15, new Picture(1300, 420, "Resources/Images/food/1.png")),
    HAMBURGER(10, new Picture (1390, 430, "Resources/Images/food/3.png")),
    BROCOLLI(15, new Picture(1300, 420, "Resources/Images/food/4.png")),
    PIZZA(10, new Picture(1390, 420, "Resources/Images/food/2.png"));

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

        if (picture.getX() > -250 ) {

            picture.translate(-type.getSpeed(), 0);

        }

        if(picture.getX() <= -250){

            picture.translate(1300,0);

            picture.delete();

        }
    }
}
