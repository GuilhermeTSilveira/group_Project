package org.academiadecodigo.tropaDELETE;

public class Player {

    private String name;
    private int health;
    private int score;
    private int speed;
    private boolean lose;
    private boolean jump;

    public Player(String name){
        this.name = name;
        this.health = 5;
        this.lose = false;
        this.jump = false;
    }

    public void move(){

    }

    public boolean lost(){
        return this.lose;
    }

    public void collide(){

    }

    public void superCharge(){

    }


}
