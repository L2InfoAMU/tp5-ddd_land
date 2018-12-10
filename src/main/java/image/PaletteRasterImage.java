package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage implements Image {
    int height ;
    int width ;
    Pixel[][] image ;
    Color[][] palette;

    public PaletteRasterImage(Color color, int width, int height){
        this.width=width ;
        this.height=height;
        createRepresentation();
        for(int x=0;x<width;x++){
            for(int y=0;y<height;y++){
                this.image[x][y]=new Pixel(x,y,color);
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        this.image=new Pixel[pixels.length][pixels[0].length];
        for(int x =0 ;x<pixels.length;x++){
            for(int y=0 ;y<pixels[0].length;y++){
                this.image[x][y]=new Pixel(x,y,pixels[x][y]);
            }
        }
    }

    public void createRepresentation(){
        this.palette=new Color[this.width][this.height];
        this.image =new Pixel[this.width][this.height];
    }
    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
