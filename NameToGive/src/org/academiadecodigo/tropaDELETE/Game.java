package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Game {

    public void start() throws InterruptedException {

        Rectangle background = new Rectangle(10, 10, 500, 500);
        Rectangle avatar = new Rectangle(100, 470, 20, 40);

        background.draw();
        avatar.setColor(Color.BLACK);
        avatar.fill();

        Player player = new Player("Player 1", avatar);
        KeyboardListener keyboard = new KeyboardListener(player);

        while(true){
            Thread.sleep(10);
            player.move();
        }
    }
}
