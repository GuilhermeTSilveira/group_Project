package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum FoodType {

    PEPPER(10, new Picture(1300, 230, "Resources/Images/food/1.png")),
    HAMBURGER(12, new Picture (1300, 430, "Resources/Images/food/3.png")),
    BROCOLLI(12, new Picture(1300, 220, "Resources/Images/food/4.png")),
    PIZZA(10, new Picture(1300, 430, "Resources/Images/food/2.png"));

    private Picture picture;
    private int speed;


    FoodType(int speed, Picture picture) {

        this.speed = (int) (Math.random()*15) + speed;

        this.picture = picture;
    }

    public int getSpeed() {
        //int random = (int) (Math.random()*2);
        //speed = (random % 2 == 0) ? speed : speed + 5;
        return speed;

    }

    public Picture getShape() {
        return picture;
    }

    public static void move(Picture picture, FoodType type){

        int random = (int) (Math.random()*2);
        int position = (random % 2 == 0) ? 0 : 1;
        System.out.println("eiii");

        if (picture.getY() == 430 && position == 1 && picture.getX() > 1043) {
            picture.translate(0, -200);
            System.out.println("1 if");
        }

        if (picture.getY() == 230 && position == 0 && picture.getX() > 1043) {
            picture.translate(0, 200);
            System.out.println("2 if");
        }


        if (picture.getX() > -250 ) {

            picture.translate(-type.getSpeed(), 0);

        }

        if(picture.getX() <= -250){

            picture.translate(1300,0);

            picture.delete();

        }
    }
}
