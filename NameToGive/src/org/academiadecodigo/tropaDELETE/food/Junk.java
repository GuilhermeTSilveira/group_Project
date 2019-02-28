package org.academiadecodigo.tropaDELETE.food;

public class Junk extends Food{

    private FoodType[] type = {FoodType.HAMBURGER, FoodType.PIZZA};

    public Junk (){
        super();
    }


    @Override
    public void collide(int value) {

    }

    public FoodType getTypes(){ // Create random for types
        int random = (int)(Math.random() * type.length);
        return random < 1 ? type[0] : type[1];
    }

}
