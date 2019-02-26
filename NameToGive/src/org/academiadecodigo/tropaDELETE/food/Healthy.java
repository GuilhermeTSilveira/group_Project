package org.academiadecodigo.tropaDELETE.food;

public class Healthy extends Food{

    FoodTypes[] type = {FoodTypes.CARROT, FoodTypes.TOMATO};

    @Override
    public void collide(int value) {

    }

    public FoodTypes[] getTypes(){ // Create random for types
        return this.type;
    }
}
