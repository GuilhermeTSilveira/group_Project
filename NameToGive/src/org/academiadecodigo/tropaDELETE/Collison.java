package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Collison {



    public boolean isCollide(Player player, Picture picture) {
        if (isPassedBy(player, picture)) {
            return false;
        }
        return (isXCollide(player, picture) && isYCollide(player,picture));
    }

    private boolean isXCollide(Player player, Picture picture) {
        return (200 >= picture.getX());
    }

    private boolean isYCollide(Player player, Picture picture) {
        return (660 >= picture.getY());
    }

    private boolean isPassedBy(Player player, Picture picture) {
        return (150 >= picture.getMaxX());
    }

}
