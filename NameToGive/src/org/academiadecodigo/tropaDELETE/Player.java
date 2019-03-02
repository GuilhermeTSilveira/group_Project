package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player implements Movable {

    Picture avatar;
    Picture avatar1;
    Picture avatar2;
    Picture avatar3;
    Picture avatar4;
    Picture avatar5;
    Picture avatar6;
    private int maxFrames = 0;

    private String name;
    private int health;
    private int score;
    private int speed;
    private boolean lose;
    private boolean jump;
    private int currentHeight = 0;
    private int maxHeight = -150;

    public Player(String name, Picture avatar1, Picture avatar2, Picture avatar3, Picture avatar4, Picture avatar5, Picture avatar6) {
        this.avatar1 = avatar1;
        this.avatar2 = avatar2;
        this.avatar3 = avatar3;
        this.avatar4 = avatar4;
        this.avatar5 = avatar5;
        this.avatar6 = avatar6;
        this.avatar = spriteSheets();
        this.name = name;
        this.health = 5;
        this.lose = false;

    }


    public void setJump(boolean state) {

        this.jump = state;
    }

    public Picture spriteSheets() {

        avatar = avatar1;
        maxFrames++;

        if (maxFrames == 42) {
            maxFrames = 0;
        }

        if (maxFrames > 36 && maxFrames <= 42) {

            avatar6.draw();
            avatar = avatar6;
            avatar1.delete();
            avatar2.delete();
            avatar3.delete();
            avatar4.delete();
            avatar5.delete();
            return avatar;

        }

        if (maxFrames > 30 && maxFrames <= 36) {

            avatar5.draw();
            avatar = avatar5;
            avatar1.delete();
            avatar2.delete();
            avatar3.delete();
            avatar4.delete();
            avatar6.delete();
            return avatar;

        }

        if (maxFrames > 24 && maxFrames <= 30) {

            avatar4.draw();
            avatar = avatar4;
            avatar1.delete();
            avatar2.delete();
            avatar3.delete();
            avatar5.delete();
            avatar6.delete();
            return avatar;

        }

        if (maxFrames > 12 && maxFrames <= 24) {

            avatar3.draw();
            avatar = avatar3;
            avatar1.delete();
            avatar2.delete();
            avatar4.delete();
            avatar5.delete();
            avatar6.delete();
            return avatar;

        }

        if (maxFrames > 6 && maxFrames <= 12) {

            avatar2.draw();
            avatar = avatar2;
            avatar1.delete();
            avatar3.delete();
            avatar4.delete();
            avatar5.delete();
            avatar6.delete();
            return avatar;

        }

        avatar1.draw();
        avatar = avatar1;
        avatar2.delete();
        avatar3.delete();
        avatar4.delete();
        avatar5.delete();
        avatar6.delete();

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
