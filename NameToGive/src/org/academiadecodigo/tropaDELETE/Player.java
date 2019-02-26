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

    }

    public void setJump(boolean state) {

        this.jump = state;
    }

    public void move() {

        if (jump) {

            if (currentHeight == maxHeight) {

                jump = false;
                try {
                    goDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            goUp();
        }
    }

    public void goUp() {

        if (currentHeight > maxHeight) {

            avatar.translate(0, -1);

            System.out.println(currentHeight);

            currentHeight--;
        }
    }

    public void goDown() throws InterruptedException {

        while (currentHeight <= 0) {

            currentHeight++;

            avatar.translate(0, 1);

            System.out.println(currentHeight);

            Thread.sleep(10);
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
