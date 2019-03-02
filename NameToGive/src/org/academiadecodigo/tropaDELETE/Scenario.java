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


    //Borders limits and dimensions
    public static final int BORDER_WIDTH = 80;


    private Rectangle topBorder;
    private Rectangle leftBorder;
    private Rectangle rightBorder;

    private Ellipse ellipse;

    public Scenario(){
        backgroundWindow = new Rectangle(PADDING, PADDING,WINDOW_WIDTH,WINDOW_HEIGHT);
        topBorder = new Rectangle(PADDING,PADDING,WINDOW_WIDTH,BORDER_WIDTH /2);
        leftBorder = new Rectangle(PADDING,PADDING,BORDER_WIDTH,WINDOW_HEIGHT);
        rightBorder = new Rectangle(WINDOW_WIDTH ,PADDING,BORDER_WIDTH + PADDING,WINDOW_HEIGHT);
        background = new Picture(backgroundWindow.getX(),backgroundWindow.getY(),"org/academiadecodigo/tropaDELETE/resources/simetrico_fundo.png");
        ellipse = new Ellipse(backgroundWindow.getWidth(),backgroundWindow.getHeight()-65,80,80);
    }

    public Rectangle getBackgroundWindow() {
        return backgroundWindow;
    }

    public Picture getBackground() {
        return background;
    }

    public Rectangle getTopBorder() {
        return topBorder;
    }

    public Rectangle getLeftBorder() {
        return leftBorder;
    }

    public Rectangle getRightBorder() {
        return rightBorder;
    }

    public Ellipse getEllipse() {
        return ellipse;
    }
}
