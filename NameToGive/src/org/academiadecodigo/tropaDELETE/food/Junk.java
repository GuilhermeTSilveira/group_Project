package org.academiadecodigo.tropaDELETE.food;

public class Junk extends Food{

    FoodTypes[] type = {FoodTypes.HAMBURGUER, FoodTypes.PIZZA};

    @Override
    public void collide(int value) {

    }

    public FoodTypes[] getTypes(){ // Create random for types
        return this.type;
    }
}
