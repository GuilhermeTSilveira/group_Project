package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Scenario {


    //Screen dimensions
    private Rectangle[] healthBar;
    public static final int PADDING = 0;
    public static final int WINDOW_WIDTH = 990 + PADDING;
    public static final int WINDOW_HEIGHT = 500 + PADDING;


    private Rectangle backgroundWindow;
    private Picture background;


    public Scenario() {
        backgroundWindow = new Rectangle(PADDING, PADDING, WINDOW_WIDTH, WINDOW_HEIGHT);
        background = new Picture(backgroundWindow.getX(), backgroundWindow.getY(), "org/academiadecodigo/tropaDELETE/resources/double_size.png");
    }

    public Rectangle getBackgroundWindow() {
        return backgroundWindow;
    }

    public Picture getBackground() {
        return background;
    }

    public void moveBackGround() {
        background.translate(-2,0);
    }

    public void resetBackGround() {
        background.translate(1042,0);
    }


    public void healthbar(Player player) {
        this.healthBar = new Rectangle[player.getHealth()];

        healthBar[0] = new Rectangle(700, 40, 140, 30);
        healthBar[0].setColor(Color.RED);
        healthBar[0].fill();

        healthBar[1] = new Rectangle(700, 40, 160, 30);
        healthBar[1].setColor(Color.RED);
        healthBar[1].fill();

        healthBar[2] = new Rectangle(700, 40, 180, 30);
        healthBar[2].setColor(Color.ORANGE);
        healthBar[2].fill();

        healthBar[3] = new Rectangle(700, 40, 200, 30);
        healthBar[3].setColor(Color.ORANGE);
        healthBar[3].fill();

        healthBar[4] = new Rectangle(700, 40, 220, 30);
        healthBar[4].setColor(Color.YELLOW);
        healthBar[4].fill();

        healthBar[5] = new Rectangle(700, 40, 240, 30);
        healthBar[5].setColor(Color.YELLOW);
        healthBar[5].fill();

        healthBar[7] = new Rectangle(700, 40, 260, 30);
        healthBar[7].setColor(Color.GREEN);
        healthBar[7].fill();

        healthBar[8] = new Rectangle(700, 40, 280, 30);
        healthBar[8].setColor(Color.GREEN);
        healthBar[8].fill();

        healthBar[9] = new Rectangle(700, 40, 300, 30);
        healthBar[9].setColor(Color.GREEN);
        healthBar[9].fill();

    }


    public void changeHealthBar(Player player) {
        int i = player.getHealth() -1;
        healthBar[i].delete();
    }
}