package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player implements Movable {

    Rectangle avatar;
    private String name;
    private int health;
    private int score;
    private int speed;
    private boolean lose;
    private boolean jump;
    private int currentHeight = 0;
    private int maxHeight = -30;

    public Player(String name, Rectangle avatar) {
        this.avatar = avatar;
        this.name = name;
        this.health = 5;
        this.lose = false;
        this.jump = false;

    }

    public void setJump() {

        this.jump = true;
    }

    public void move() {

        if (jump) {
            if (currentHeight == maxHeight) {
                jump = false;
            }

            if (currentHeight > maxHeight) {

                //Thread.sleep(100);
                avatar.translate(0, -1);

                System.out.println(currentHeight);
                currentHeight--;
            }
        }
    }

    public void collide() {

    }

    public void superCharge() {

    }


    public boolean lost() {
        return this.lose;
    }

    @Override
    public void translate(double v, double v1) {

    }
}
