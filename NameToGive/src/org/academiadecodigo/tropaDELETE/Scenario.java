package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Scenario {

    //Screen dimensions
    private Rectangle[] healthBar;
    public static final int PADDING = 0;
    public static final int WINDOW_WIDTH = 1042 + PADDING;
    public static final int WINDOW_HEIGHT = 598 + PADDING;

    private Rectangle backgroundWindow;
    private Picture background;
    private Picture outlineHealthBar;

    private Picture pictureScore;
    private Text score;

    public Scenario() {
        backgroundWindow = new Rectangle(PADDING, PADDING, WINDOW_WIDTH, WINDOW_HEIGHT);
        background = new Picture(backgroundWindow.getX(), backgroundWindow.getY(), "Images/Background/double_size.png");
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
        background.translate(WINDOW_WIDTH,0);
    }

    public void healthbar(Player player) {
        this.healthBar = new Rectangle[player.MAX_HEALTH];

        outlineHealthBar = new Picture(643, 34, "Images/Healthbar/3dheart.png");
        outlineHealthBar.draw();

        healthBar[0] = new Rectangle(700, 40, 30, 30);
        healthBar[0].setColor(Color.RED);
        healthBar[0].fill();

        healthBar[1] = new Rectangle(700, 40, 60, 30);
        healthBar[1].setColor(Color.RED);
        healthBar[1].fill();

        healthBar[2] = new Rectangle(700, 40, 90, 30);
        healthBar[2].setColor(Color.ORANGE);
        healthBar[2].fill();

        healthBar[3] = new Rectangle(700, 40, 120, 30);
        healthBar[3].setColor(Color.ORANGE);
        healthBar[3].fill();

        healthBar[4] = new Rectangle(700, 40, 150, 30);
        healthBar[4].setColor(Color.YELLOW);
        healthBar[4].fill();

        healthBar[5] = new Rectangle(700, 40, 180, 30);
        healthBar[5].setColor(Color.YELLOW);
        healthBar[5].fill();

        healthBar[6] = new Rectangle(700, 40, 210, 30);
        healthBar[6].setColor(Color.YELLOW);
        healthBar[6].fill();

        healthBar[7] = new Rectangle(700, 40, 240, 30);
        healthBar[7].setColor(Color.GREEN);
        healthBar[7].fill();

        healthBar[8] = new Rectangle(700, 40, 270, 30);
        healthBar[8].setColor(Color.GREEN);
        healthBar[8].fill();

        healthBar[9] = new Rectangle(700, 40, 300, 30);
        healthBar[9].setColor(Color.GREEN);
        healthBar[9].fill();

    }

    public void changeHealthBar(Player player) {
        int i = player.getHealth()-1;
        System.out.println(healthBar[i].toString() + i);
        healthBar[i].delete();
    }

    public void score(Player player){

        pictureScore = new Picture(900, 110, "Images/food/score.png");
        pictureScore.draw();
        String strI = "" + player.getScore();
        score = new Text(985,130, strI);
        score.draw();
        score.setColor(Color.ORANGE);
        score.grow(10,10);
    }

    public void changeScore(Player player){

        int countScore = player.getScore() + 1;
        player.setScore(countScore);

        score.delete();

    }
}