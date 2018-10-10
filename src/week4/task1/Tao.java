package week4.task1;

/**
 * This class represent the fruit
 *
 * @author xxNguyenxx
 */
public class Tao extends HoaQua {

    /**
     * @param price
     * @param size
     */
    public Tao(int price, double size) {
        super(price, size, "red");
    }

    /**
     * @param t
     */
    public Tao(Tao t) {
        this(t.price, t.size);
    }

    /**
     * The default constructor
     */
    public Tao() {
    }


}
