package week4.task1;

/**
 * This class represent the fruit
 *
 * @author xxNguyenxx
 */
public class HoaQua {
    int price;
    double size;
    String color;


    /**
     * Construct newFruit object
     *
     * @param price the price of the fruit per kilogram
     * @param size  the  average radius of the fruit
     * @param color the color of the fruit
     */
    public HoaQua(int price, double size, String color) {
        this.price = price;
        this.size = size;
        this.color = color;
    }

    /**
     * make new copy of an fruit
     * @param h the fruit object
     */
    public HoaQua(HoaQua h) {
        this(h.price, h.size, h.color);
    }

    /**
     *
     */
    public HoaQua() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
