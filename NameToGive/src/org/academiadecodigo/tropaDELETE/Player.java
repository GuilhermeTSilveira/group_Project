package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player implements Movable {

    Picture avatar1;
    Picture avatar2;
    Picture avatar;
    private int maxFrames = 24;

    private String name;
    private int health;
    private int score;
    private int speed;
    private boolean lose;
    private boolean jump;
    private int currentHeight = 0;
    private int maxHeight = -80;

    public Player(String name, Picture avatar1, Picture avatar2) {
        this.avatar1 = avatar1;
        this.avatar2 = avatar2;
        this.avatar = spriteSheets();
        this.name = name;
        this.health = 5;
        this.lose = false;

    }


    public void setJump(boolean state) {

        this.jump = state;
    }

    public Picture spriteSheets() {

        avatar = avatar2;

        maxFrames--;

        if (maxFrames == 0) {
            maxFrames = 24;
        }

        if (maxFrames >= 12 && maxFrames <= 24) {

            avatar2.draw();
            avatar = avatar2;
            avatar1.delete();
            return avatar;

        }

        avatar1.draw();
        avatar = avatar1;
        avatar2.delete();

        return avatar;
    }

    public Picture getAvatar() {
        return avatar;
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

    public void goUp() {

        if (currentHeight > maxHeight) {

            avatar1.translate(0, -2);

            currentHeight -= 2;
        }
    }

    public void goDown() {

        if ((avatar1.getHeight() + avatar1.getY()) <= Scenario.WINDOW_HEIGHT + 15) {

            avatar1.translate(0, 2);

            currentHeight += 2;

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
