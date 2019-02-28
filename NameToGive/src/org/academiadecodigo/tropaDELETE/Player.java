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
    private int maxHeight = -80;

    public Player(String name, Rectangle avatar) {
        this.avatar = avatar;
        this.name = name;
        this.health = 5;
        this.lose = false;

    }

    public void setJump(boolean state) {

        this.jump = state;
    }

    public void move() {

        if (!jump) {

            goDown();

            return;
        }

        if (currentHeight == maxHeight) {

            jump = false;

            return;
        }


        goUp();
    }

    public void goUp() { // desativar o espaço durante este metodo - Pedro

        if (currentHeight > maxHeight) {

            avatar.translate(0, -5);

            currentHeight -= 5;
        }
    }

    public void goDown() { // desativar tambem o espaço - Pedro

        if ((avatar.getHeight() + avatar.getY()) <= 505) {

            avatar.translate(0, 5);

            currentHeight += 5;

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
