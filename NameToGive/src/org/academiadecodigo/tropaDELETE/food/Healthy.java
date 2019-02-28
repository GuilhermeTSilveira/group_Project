package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Healthy extends Food{

    static FoodType[] type = {FoodType.CARROT, FoodType.TOMATO};
    Ellipse ellipse;

    public Healthy(Ellipse ellipse){
        super(ellipse);
        this.ellipse = ellipse;
    }

    @Override
    public void collide(int value) {

    }

    public static FoodType getTypes(){ // Create random for types
        int random = (int)(Math.random() * type.length);
        return random < 1 ? type[0] : type[1];
    }

}
