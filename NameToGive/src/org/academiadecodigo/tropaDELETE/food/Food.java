package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Food {

    public Food(){

    }

    public void collide(int value){

    }

    public static FoodType createFoodObjects() {

        FoodType type;

        double random = Math.random();

        type = random >= 0 && random <= 0.7 ? new Junk().getTypes() : new Healthy().getTypes(); // get those randoms.

        return type;
    }
}
