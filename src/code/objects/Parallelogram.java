package code.objects;

/**
 * Created by bruno on 23-04-2017.
 */
public class Parallelogram implements ClosedShape {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Parallelogram() {
        this( 0, 0 );
    }

    public Parallelogram( double base, double height ) {
        this.base = base;
        this.height = height;
    }

    public double calcPerimeter() {
        return 2*(this.base + this.height );
    }

    public double calcArea() {
        return this.base*this.height;
    }


}
