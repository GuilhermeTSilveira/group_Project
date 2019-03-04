package org.academiadecodigo.tropaDELETE;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tropaDELETE.food.Food;
import org.academiadecodigo.tropaDELETE.food.FoodType;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Game {

    private List<FoodType> list;

    private FoodType[] type;

    private Picture[] picture;

    private Picture initialPicture;

    private Player player;

    private Collison collison;

    private Sound gameOverSound;

    private Sound gameMusic;

    private int max;

    private Scenario scenario;

    private boolean started;

    private int playerScore;


    public Game(int max) {

        this.max = max;

        started = false;

        this.scenario = new Scenario();

        list = new LinkedList<>();

        type = new FoodType[max];

        this.gameMusic = new Sound("/Resources/Sounds/gameSong.wav");

        gameOverSound = new Sound("/Resources/Sounds/GameOver.wav");
    }

    public void init() throws InterruptedException {

        KeyboardEvent key = new KeyboardEvent();
        Player player = new Player("Player 1");
        KeyboardListener keyboard = new KeyboardListener(player, this);

        this.initialPicture = new Picture(0, 0, "Resources/Images/Background/InitialScreen_resized.jpg");
        initialPicture.draw();
        Thread.sleep(4000);

        Picture initialPictureStart = new Picture(345, 450, "Resources/Images/Background/Offline.png");
        initialPictureStart.draw();

        createFoodObjects(max);

        isStarted();
        Rectangle screen = scenario.getBackgroundWindow();
        screen.draw();

        Picture background = scenario.getBackground();
        background.draw();

        gameMusic.play(true);
        gameMusic.setLoop(10);

        //background.draw();

        start(player);
    }


    public void start(Player player) throws InterruptedException {
        collison = new Collison(player);

        int i = 0;

        scenario.healthbar(player);
        scenario.score(player);


        while (true) {

            Thread.sleep(15);

            Collections.shuffle(list);

            picture[i] = type[i].getShape();

            picture[i].draw();

            player.run();

            player.move();


            scenario.moveBackGround();
            if (scenario.getBackground().getX() == -scenario.WINDOW_WIDTH) {
                scenario.resetBackGround();
            }

            //type.move(ellipse);
            move(picture[i], type[i]);

            if (collison.isCollide(picture[i])) {
                if (type[i] == FoodType.PEPPER || type[i] == FoodType.BROCOLLI) {
                    picture[i].delete();
                    picture[i].translate(-500, 0);
                    scenario.changeScore(player);
                }

                if (type[i] == FoodType.PIZZA || type[i] == FoodType.HAMBURGER) {
                    picture[i].delete();
                    picture[i].translate(-500, 0);
                    scenario.changeHealthBar(player);
                    player.takeDmg();
                }


                //System.out.println("depois do take damage" + player.getHealth());

                System.out.println("Score: " + player.getScore());
            }


            if (picture[i].getX() < -200) {

                i++;

            }

            if (i == max) {

                i = 0;

            }
            if (player.getHealth() == 0) {
                playerScore = player.getScore();
                gameOver();
                return;
            }

        }
    }

    private void gameOver() {
        //player.getAvatar().clear(); // Como se alterou de sprites para lista isto não funciona.
        gameMusic.stop();

        gameOverSound.play(true);
        Picture gameOverPicture = new Picture(0, 0, "Resources/Images/Background/GameOver_resized.jpg");
        gameOverPicture.draw();


        String score = "" + playerScore;
        Text textScore = new Text(510, 470, "SCORE");
        textScore.grow(50, 20);
        textScore.setColor(Color.WHITE);
        textScore.draw();
        Text text = new Text(515, 520, score );
        text.grow(20,30);
        text.setColor(Color.WHITE);
        text.draw();
    }

    private void createFoodObjects(int max) {

        picture = new Picture[max];

        for (int i = 0; i < max; i++) {

            type[i] = Food.createFoodObjects();

            picture[i] = type[i].getShape();

            list.add(type[i]);

        }
    }

    public void move(Picture picture, FoodType type) {

        FoodType.move(picture, type);
    }

    public void starting() {
        started = true;
    }

    private void isStarted() throws InterruptedException {
        while (!started) {

            Thread.sleep(1000);
            System.out.println("Waiting on player..");

            if (started) {
                System.out.println("Game started!");
                return;
            }
        }
    }

}
