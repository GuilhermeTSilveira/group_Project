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
        if (isUnder(picture)) {
            return false;
        }


        return (isXCollide(picture) && isYCollide(picture));
    }

    private boolean isXCollide(Picture picture) {
        return (player.listPicture.get(0).getMaxX()-30 >= picture.getX());
    }

    private boolean isYCollide(Picture picture) {
        return (player.listPicture.get(0).getMaxY()-30 >= picture.getY());
    }

    private boolean isPassedBy(Picture picture) {
        return (player.listPicture.get(0).getX() >= picture.getMaxX());
    }

    private boolean isUnder(Picture picture) {
        return (!(player.listPicture.get(0).getY() <= picture.getMaxY()));
    }

}
