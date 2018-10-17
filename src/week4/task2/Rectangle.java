package week4.task2;

/**
 * Created by CCNE on 10/10/2018.
 */
public class Rectangle extends Shape {
    public double width = 1.0;
    public double length = 1.0;

    public Rectangle( double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        super();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    /**
     * @return the area of the rectangle
     */
    public double getArea() {
        return width * length;
    }

    /**
     * @return the perimeter of the rectangle
     */

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
}
