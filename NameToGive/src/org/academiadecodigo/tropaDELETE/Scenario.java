package org.academiadecodigo.tropaDELETE;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Scenario {


    //Screen dimensions

    public static final int PADDING = 0;
    public static final int WINDOW_WIDTH = 990 + PADDING;
    public static final int WINDOW_HEIGHT = 500 + PADDING;


    private Rectangle backgroundWindow;
    private Picture background;


    public Scenario(){
        backgroundWindow = new Rectangle(PADDING, PADDING,WINDOW_WIDTH,WINDOW_HEIGHT);
        background = new Picture(backgroundWindow.getX(),backgroundWindow.getY(),"org/academiadecodigo/tropaDELETE/resources/simetrico_fundo.png");
    }

    public Rectangle getBackgroundWindow() {
        return backgroundWindow;
    }

    public Picture getBackground() {
        return background;
    }

}
