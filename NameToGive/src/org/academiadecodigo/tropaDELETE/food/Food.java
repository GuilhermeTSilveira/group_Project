package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public abstract class Food {

    Ellipse ellipse;
    FoodType type;

    public Food(Ellipse ellipse){
        this.ellipse = ellipse;
    }

    public Food(FoodType type){

    }

    public  void collide(int value){

    }

    public void setType(FoodType type){
        this.type = type;
    }

    /*public Food[] createFoodObjects(int max) { //Tentar aplicar uma LinkedList neste metodo

        for (int i = 0; i < max; i++) {

            double random = Math.random();


            type = random >= 0 && random <= 0.7 ? new Junk(ellipse).getTypes() : new Healthy(ellipse).getTypes(); // get those randoms.


        }
    }*/
}
