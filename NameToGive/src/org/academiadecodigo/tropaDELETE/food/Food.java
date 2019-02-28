package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Food {

    private Picture picture;
    private static Ellipse ellipse;
    private static FoodType type;

    public Food(){

    }

    /*public Food(FoodType type){

    }*/

    public void collide(int value){

    }

    public void setType(FoodType type){
        this.type = type;
    }

    public static FoodType createFoodObjects() { //Guilherme

        double random = Math.random();

        type = random >= 0 && random <= 0.7 ? new Junk(ellipse).getTypes() : new Healthy(ellipse).getTypes(); // get those randoms.

        return type;
    }

    public FoodType getTypes(){
        return type;
    }
}
