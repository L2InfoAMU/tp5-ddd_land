package image;

import javafx.scene.paint.Color;

public class PaletteRasterImage extends RasterImage implements Image {
    int height ;
    int width ;
    Pixel[][] image ;
    Color[][] palette;

    public PaletteRasterImage(Color color, int width, int height){
        this.setWidth(width);
        this.setHeight(height);
        createRepresentation();
        for(int x=0;x<width;x++){
            for(int y=0;y<height;y++){
                this.image[x][y]=new Pixel(x,y,color);
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels){
        this.setWidth(pixels.length);
        this.setHeight(pixels[0].length);
        this.palette =pixels ;
        createRepresentation();
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

    public void setPixelColor(Color color, int x, int y){

        this.image[x][y]=new Pixel(x,y,color);
    }



    @Override
    public Color getPixelColor(int x, int y) {
        return this.image[x][y].getColor();
    }

    public void setPixelsColor(Color[][] pixels){
        if(this.image.length==pixels.length && this.image[0].length==pixels[0].length)
        {
            for(int x =0 ;x<width;x++){
                for(int y=0 ;y<height;y++){
                    this.image[x][y]=new Pixel(x,y,pixels[x][y]);
                }
            }
        }
        else throw new Error("Dimension de la matrice de pixel mauvaise");
    }

    private void setPixelsColor(Color color){

        for(int x =0 ;x<this.width;x++){
            for(int y=0 ;y<this.height;y++){
                this.image[x][y]=new Pixel(x,y,color);
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
    protected void setWidth(int width){
        this.width=width ;
    }
    protected void setHeight(int height){
        this.height=height ;
    }

}
