package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.tropaDELETE.food.Food;

public class Game {

    Food[] foods;
    Rectangle background = new Rectangle(10, 10, 800, 500);
    Rectangle barRight = new Rectangle(background.getWidth(), 10, 70, 501);
    Rectangle barLeft = new Rectangle(10, 10, 70, 501);


    Ellipse ellipse = new Ellipse(background.getWidth(), 440, 70, 70);

    public Game(int max) {

    }


    public void start() throws InterruptedException {

        // createFoodObjects(10); -
        Rectangle avatar = new Rectangle(250, 430, 40, 80);

        background.draw();
        avatar.setColor(Color.BLACK);
        avatar.fill();

        ellipse.setColor(Color.PINK);
        ellipse.fill();

        barRight.setColor(Color.WHITE);
        barRight.fill();

        barLeft.setColor(Color.WHITE);
        barLeft.fill();


        Player player = new Player("Player 1", avatar);
        KeyboardListener keyboard = new KeyboardListener(player);


        while (true) {

            Thread.sleep(50);
            player.move();

        }
    }

}
