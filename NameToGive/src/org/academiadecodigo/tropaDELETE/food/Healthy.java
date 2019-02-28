package org.academiadecodigo.tropaDELETE.food;

public class Healthy extends Food{

    private FoodType[] type = {FoodType.CARROT, FoodType.TOMATO};

    public Healthy(){
        super();
    }

    @Override
    public void collide(int value) {

    }

    public FoodType getTypes(){ // Create random for types
        int random = (int)(Math.random() * type.length);
        return random < 1 ? this.type[0] : this.type[1];
    }

}
