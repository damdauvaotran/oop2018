package week4.task2;

/**
 * Created by CCNE on 10/10/2018.
 */
public class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square() {
        super(1.0, 1.0);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double size){
        this.setLength(size);
        this.setWidth(size);
    }

    @Override
    public String toString() {
        return "Side = "+ this.getWidth();
    }
}
