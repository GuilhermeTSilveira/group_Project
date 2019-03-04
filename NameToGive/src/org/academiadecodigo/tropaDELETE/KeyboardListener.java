package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

    public class KeyboardListener implements KeyboardHandler {

        private Player player;
        private KeyboardEvent space;
        private Keyboard keyboard;
        private Sound jumpSound;

        public KeyboardListener(Player player){

            this.jumpSound = new Sound("/Sounds/Jump.wav");
            this.player = player;

            space = new KeyboardEvent();
            keyboard = new Keyboard(this);
            keyboard.addEventListener(space);

            setKey();
        }

        @Override
        public void keyPressed(KeyboardEvent keyboardEvent) {

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
    }
