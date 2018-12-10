package image;

import javafx.scene.paint.Color;

import java.util.HashMap;

public class SparseRasterImage extends RasterImage implements Image {
    int width ;
    int height ;
    Pixel[][] image ;
    HashMap map ;

    public SparseRasterImage(Color color, int width, int height){
        this.setWidth(width);
        this.setHeight(height);
        createRepresentation();
        for(int x=0;x<width;x++){
            for(int y=0;y<height;y++){
                this.image[x][y]=new Pixel(x,y,color);
                this.map.put(new Point(x,y),color);
            }
        }



    }
    public SparseRasterImage(Color[][] pixels){
        this.setWidth(pixels.length);
        this.setHeight(pixels[0].length);
        createRepresentation();
        for(int x =0 ;x<pixels.length;x++){
            for(int y=0 ;y<pixels[0].length;y++){
                this.image[x][y]=new Pixel(x,y,pixels[x][y]);
                this.map.put(new Point(x,y),pixels[x][y]);
            }
        }
    }

    public void createRepresentation() {
        this.image =new Pixel[width][height];
        this.map= new HashMap <Point,Color>();
    }

    protected void setWidth(int width){this.width=width ;}
    protected void setHeight(int height){
        this.height=height;
    }
    @Override
    public void setPixelColor(Color color, int x, int y) {

    }
    private void setPixelsColor(Color[][] pixels){
        if(this.image.length==pixels.length && this.image[0].length==pixels[0].length)
        {
            for(int x =0 ;x<width;x++){
                for(int y=0 ;y<height;y++){
                    this.image[x][y]=new Pixel(x,y,pixels[x][y]);
                    this.map.put(new Point(x,y),pixels[x][y]);
                }
            }
        }
        else throw new Error("Dimension de la matrice de pixel mauvaise");
    }

    private void setPixelsColor(Color color){
        for(int x=0 ;x<width;x++){
            for(int y=0;y<height;y++){
                this.image[x][y]=new Pixel(x,y,color);
                this.map.put(new Point(x,y),color);
            }
        }
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return this.image[x][y].getColor();
    }
}
