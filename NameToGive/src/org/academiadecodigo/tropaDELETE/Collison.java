package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Collison {

    private Player player;

    public Collison(Player player) {
        this.player = player;
    }


    public boolean isCollide(Picture picture) {
        if (isPassedBy(picture)) {
            return false;
        }
        return (isXCollide(picture) && isYCollide(picture));
    }

    private boolean isXCollide(Picture picture) {
        return (200 >= picture.getX());
    }

    private boolean isYCollide(Picture picture) {
        return (660 >= picture.getY());
    }

    private boolean isPassedBy(Picture picture) {
        return (150 >= picture.getMaxX());
    }

}
