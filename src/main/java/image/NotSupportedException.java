package image;

public class NotSupportedException extends RuntimeException {
    String string ;

    NotSupportedException(String string){
        this.string=string ;
    }
}
