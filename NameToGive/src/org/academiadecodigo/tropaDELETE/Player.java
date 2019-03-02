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
    private int maxHeight = 10;

    public Player(String name) {

        this.avatar1 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame1.png");
        this.avatar2 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame2.png");
        this.avatar3 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame3.png");
        this.avatar4 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame4.png");
        this.avatar5 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame5.png");
        this.avatar6 = new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame6.png");
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
            avatar2.translate(0,-2);
            avatar3.translate(0, -2);
            avatar4.translate(0, -2);
            avatar5.translate(0, -2);
            avatar6.translate(0, -2);

            currentHeight -= 2;
        }
    }

    public void goDown() {

        if ((avatar1.getHeight() + avatar1.getY()) <= Scenario.WINDOW_HEIGHT + 50) {

            avatar1.translate(0, 2);

            currentHeight += 2;

        }

        if ((avatar2.getHeight() + avatar2.getY()) <= Scenario.WINDOW_HEIGHT + 50) {

            avatar2.translate(0, 2);

            currentHeight += 2;

        }

        if ((avatar3.getHeight() + avatar3.getY()) <= Scenario.WINDOW_HEIGHT + 50) {

            avatar3.translate(0, 2);

            currentHeight += 2;

        }

        if ((avatar4.getHeight() + avatar4.getY()) <= Scenario.WINDOW_HEIGHT + 50) {

            avatar4.translate(0, 2);

            currentHeight += 2;

        }

        if ((avatar5.getHeight() + avatar5.getY()) <= Scenario.WINDOW_HEIGHT + 50) {

            avatar5.translate(0, 2);

            currentHeight += 2;

        }

        if ((avatar6.getHeight() + avatar6.getY()) <= Scenario.WINDOW_HEIGHT + 50) {

            avatar6.translate(0, 2);

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
