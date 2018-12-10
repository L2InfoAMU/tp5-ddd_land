package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {
    int width ;
    int height ;
    Pixel[][] image;

    public BruteRasterImage(Color color, int width, int height){
        for(int x=0;x<width;x++){
            for(int y=0;y<height;y++){
                new Pixel(x,y,color);
            }
        }
    }
    public BruteRasterImage(Color[][] colors){
        for(int x =0 ;x<colors.length;x++){
            for(int y=0 ;y<colors[0].length;y++){
                this.image[x][y]=new Pixel(x,y,colors[x][y]);
            }
        }
    }

    public void createRepresentation(){
        this.image =new Pixel[this.width][this.height];
    }


    public void setPixelColor(Color color, int x, int y){
        this.image[x][y]=new Pixel(x,y,color);
    }
    private void setPixelsColor(Color[][] pixels){
        for(int x =0 ;x<width;x++){
            for(int y=0 ;y<height;y++){
                this.image[x][y]=new Pixel(x,y,pixels[x][y]);
            }
        }
    }

    private void setPixelsColor(Color color){
        for(int x=0;x<this.width;x++){
            for(int y=0;y<this.height;y++){
                this.image[x][y]=new Pixel(x,y,color);
            }
        }
    }

    protected void setWidth(int width){
        this.width=width;
    }
    protected void setHeight(int height){
        this.height=height;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return this.image[x][y].getColor();
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }
}
