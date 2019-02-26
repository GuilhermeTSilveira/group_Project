package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Player implements Movable {

    Rectangle background = new Rectangle(10, 10 , 500, 500);
    Rectangle avatar = new Rectangle(100, 460, 20, 40);
    private String name;
    private int health;
    private int score;
    private int speed;
    private boolean lose;
    private boolean jump;

    public Player(String name) {
        this.name = name;
        this.health = 5;
        this.lose = false;
        this.jump = false;
        background.draw();
        avatar.setColor(Color.BLACK);
        avatar.fill();
    }

    public void move() {
        jump = true;
        try {
            jump();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void jump() throws InterruptedException {
        int currentHeight = 0;
        int maxHeight = -20;

        while (jump) {

            for (int i = 0; i >= maxHeight; i-=5) {

                System.out.println(i);

                this.translate(0,-5);

                Thread.sleep(200);
            }

            jump = false;

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
