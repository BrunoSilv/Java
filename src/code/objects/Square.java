package code.objects;

/**
 * Created by bruno on 23-04-2017.
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square( double side ) {
        super( side, side );
    }

    public double getSide() {
        return super.getSide1();
    }

    public void setSide( double side ) {
        super.setSide1( side );
        super.setSide2( side );
    }
}
