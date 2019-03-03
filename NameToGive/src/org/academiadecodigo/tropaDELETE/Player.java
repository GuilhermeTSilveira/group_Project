package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import java.util.LinkedList;
import java.util.List;


public class Player implements Movable {

    List<Picture> listPicture;

    private Picture avatar;
    private int maxFrames = 0;

    private String name;
    private int health;
    private int score;
    private int speed;
    private boolean lose;
    private boolean jump;
    private int currentHeight = 0;
    private int maxHeight = -100;
    private int i;

    public Player(String name) {

        listPicture = new LinkedList<>();

        listPicture.add(new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame1.png"));
        listPicture.add(new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame2.png"));
        listPicture.add(new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame3.png"));
        listPicture.add(new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame4.png"));
        listPicture.add(new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame5.png"));
        listPicture.add(new Picture(235, 375, "org/academiadecodigo/tropaDELETE/resources/avatar-frame6.png"));
        listPicture.add(new Picture(235,375, "org/academiadecodigo/tropaDELETE/resources/up.png"));
        listPicture.add(new Picture(235,375, "org/academiadecodigo/tropaDELETE/resources/down.png"));

        this.name = name;
        this.health = 10;
        this.lose = false;

        this.jump = false;

    }

    public void setJump(boolean state) {

        this.jump = state;
    }

    public int getHealth(){
        return this.health;
    }

    public void run() {

        maxFrames++;

        listPicture.get(6).delete();
        listPicture.get(7).delete();

        if(maxFrames >= 0 && maxFrames < 5) {

            listPicture.get(0).draw();
            listPicture.get(5).delete();
            return;
        }

        if(maxFrames >= 5 && maxFrames < 10) {

            listPicture.get(1).draw();
            listPicture.get(0).delete();
            return;
        }

        if(maxFrames >= 10 && maxFrames < 15) {

            listPicture.get(2).draw();
            listPicture.get(1).delete();
            i++;
            return;
        }


        if(maxFrames >= 15 && maxFrames < 20) {

            listPicture.get(3).draw();
            listPicture.get(2).delete();
            i++;
            return;
        }


        if(maxFrames >= 20 && maxFrames < 25) {

            listPicture.get(4).draw();
            listPicture.get(3).delete();
            i++;
            return;
        }


        if(maxFrames >= 25 && maxFrames < 30) {

            listPicture.get(5).draw();
            listPicture.get(4).delete();

            return;
        }

        if(maxFrames == 30){
            maxFrames = 0;
        }
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

    public void goUp() { // acabar de ver essa parte

        listPicture.get(0).delete();
        listPicture.get(1).delete();
        listPicture.get(2).delete();
        listPicture.get(3).delete();
        listPicture.get(4).delete();
        listPicture.get(5).delete();


        if (jump && currentHeight > maxHeight) {

            listPicture.get(6).draw();
            listPicture.get(6).translate(0,-2);

            listPicture.get(7).delete();
            listPicture.get(7).translate(0,-2);

            System.out.println(currentHeight);
            currentHeight -= 2;

        }
    }

    public void goDown() {

        if (currentHeight <= 0) {

            listPicture.get(7).draw();
            listPicture.get(7).translate(0,+2);

            listPicture.get(6).delete();
            listPicture.get(6).translate(0,+2);

            currentHeight += 2;

            return;
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
