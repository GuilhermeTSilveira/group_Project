package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

import java.security.Key;

public class KeyboardListener implements KeyboardHandler {

        private Player player;
        private KeyboardEvent space;
        private Keyboard keyboard;
        private Sound jumpSound;
        private Game game;

        public KeyboardListener(Player player, Game game){

            this.jumpSound = new Sound("/Sounds/Jump.wav");
            this.player = player;
            this.game = game;

            space = new KeyboardEvent();
            keyboard = new Keyboard(this);
            keyboard.addEventListener(space);

            setKey();
        }

        @Override
        public void keyPressed(KeyboardEvent keyboardEvent) {
            game.starting();

            if (player.listPicture.get(0).getMaxY() >= 500) {

                player.setJump(true);
                jumpSound.play(true);
            }

        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {

            player.setJump(false);

        }

        public void setKey(){

            space.setKey(KeyboardEvent.KEY_SPACE);

            space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        }

        public KeyboardEvent getKey(){
            return space;
        }
    }
