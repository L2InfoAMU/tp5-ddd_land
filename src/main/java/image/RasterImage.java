package image;

import javafx.scene.paint.Color;

public abstract class RasterImage   {


    public abstract void setPixelColor(Color color, int x, int y);
    public abstract int getWidth();
    public abstract int getHeight();
    public abstract Color getPixelColor(int x, int y) ;


}
