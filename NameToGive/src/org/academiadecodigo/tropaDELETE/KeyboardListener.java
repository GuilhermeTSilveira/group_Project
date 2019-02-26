package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

    public class KeyboardListener implements KeyboardHandler {

        Player player;
        KeyboardEvent space;
        Keyboard keyboard;

        public KeyboardListener(Player player){

            this.player = player;

            space = new KeyboardEvent();
            keyboard = new Keyboard(this);
            keyboard.addEventListener(space);

            setKey();
        }

        @Override
        public void keyPressed(KeyboardEvent keyboardEvent) {

            if(keyboardEvent.getKey() == space.getKey()){

                player.move();

            }

        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {

        }

        public void setKey(){

            space.setKey(KeyboardEvent.KEY_SPACE);

            space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        }
    }
