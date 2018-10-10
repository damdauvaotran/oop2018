package week4.task1;

/**
 * This class represent the fruit
 *
 * @author xxNguyenxx
 */
public class Cam extends HoaQua {

    String giong;

    /**
     * @param price
     * @param size
     * @param giong
     */
    public Cam(int price, double size, String giong) {
        super(price, size, "orange");
        this.giong = giong;
    }

    /**
     * @param c
     */
    public Cam(Cam c) {
        this(c.price, c.size, c.giong);
    }

    /**
     * The default constructor
     */
    public Cam() {
    }

    public String getGiong() {
        return giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }
}
