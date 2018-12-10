package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Shape {
    List<Shape> shapes ;
    int width ;
    int height;
    VectorImage(List<Shape> shapes, int width, int height){
        this.shapes=shapes;
        this.width=width;
        this.height=height;
        //switch (this.shapes){
            //case Rectangle : }

    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    protected void setWidth(int width) {
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }

    @Override
    public boolean contains(Point point) {
        return false;
    }

    @Override
    public Color getColor() {
        return null;
    }
}
