package image;


import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    Point corner_left_up;
    int width ;
    int height ;
    Color color ;

    Rectangle(int x, int y, int width, int height, Color color){
        this.corner_left_up =new Point(x,y);
        this.width=width ;
        this.height=height;
        this.color =color ;
        for( x =x;x<width;x++){
            for (y=y;y<height;y++){
                new Pixel(x,y,color);
            }
        }
    }
    public boolean contains(Point point){
        return (this.corner_left_up.x<=point.x && point.x<=this.corner_left_up.x+this.width // vérification des coordonnés en x
                && this.corner_left_up.y>=point.y&& point.y>=this.corner_left_up.y-this.height);//vérification des coordonnées en y
    }
    public Color getColor(){ return this.color ;

    }
}
