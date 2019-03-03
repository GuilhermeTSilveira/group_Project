package org.academiadecodigo.tropaDELETE;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
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

    private int max;

    private Scenario scenario;


    public Game(int max) {

        this.max = max;

        this.scenario = new Scenario();

        list = new LinkedList<>();

        type = new FoodType[max];
    }

    public void init() throws InterruptedException {
        this.initialPicture = new Picture(0, 0, "org/academiadecodigo/tropaDELETE/resources/InitialScreen_resized.jpg");
        initialPicture.draw();
        Thread.sleep(4000);

        createFoodObjects(max);
        Rectangle screen = scenario.getBackgroundWindow();
        screen.draw();

        Picture background = scenario.getBackground();
        background.draw();


        //background.draw();


        start();
    }


    public void start() throws InterruptedException {
        Player player = new Player("Player 1");
        KeyboardListener keyboard = new KeyboardListener(player);
        collison = new Collison(player);

        int i = 0;


        while (true) {

            Thread.sleep(15);

            picture[i].draw();

            Collections.shuffle(list);

            player.draw();

            player.move();

            scenario.healthbar(player);

            scenario.moveBackGround();
            if (scenario.getBackground().getX() == -1042) {
                scenario.resetBackGround();
            }

            //type.move(ellipse);
            move(picture[i], type[i]);

            if (collison.isCollide(picture[i])) {
                picture[i].delete();
                player.takeDmg();
                System.out.println(player.getHealth());
                scenario.changeHealthBar(player);
            }


            if (picture[i].getX() < -200) {

                i++;

            }

            if (i == max){

                i = 0;

            }
            if (player.getHealth() == 0){
               gameOver();
            }

        }
    }

    private void gameOver(){
        //player.getAvatar().clear(); // Como se alterou de sprites para lista isto não funciona.
        Picture gameOverPicture = new Picture(0,0,"org/academiadecodigo/tropaDELETE/resources/GameOver_resized.jpg");
        gameOverPicture.draw();
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

}
