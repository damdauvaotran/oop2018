package week4.task2;


/**
 * Created by CCNE on 10/10/2018.
 */
public class Circle extends Shape {
    double radius = 1.0;
    public static final double PI = 3.141592;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return the area of the circle
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     *
     * @return the perimeter of the circle
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
}
