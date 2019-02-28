package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Food {

    Picture picture;
    Ellipse ellipse;
    private FoodType type;

    public Food(){

    }

    /*public Food(FoodType type){

    }*/

    public void collide(int value){

    }

    public void setType(FoodType type){
        this.type = type;
    }

    /*public FoodType createFoodObjects(int max) { //Guilherme

        for (int i = 0; i < max; i++) {

            double random = Math.random();

            type = random >= 0 && random <= 0.7 ? new Junk(ellipse).getTypes() : new Healthy(ellipse).getTypes(); // get those randoms.

        }
    }*/

    public FoodType getTypes(){
        return type;
    }
}
