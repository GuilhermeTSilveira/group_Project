package org.academiadecodigo.tropaDELETE.food;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;

public class Junk extends Food{

    private FoodType[] type = {FoodType.HAMBURGER, FoodType.PIZZA};
    Ellipse ellipse;

    public Junk (Ellipse ellipse){
        super();
        this.ellipse = ellipse;
    }


    @Override
    public void collide(int value) {

    }

    public FoodType getTypes(){ // Create random for types
        int random = (int)(Math.random() * type.length);
        return random < 1 ? type[0] : type[1];
    }

}
