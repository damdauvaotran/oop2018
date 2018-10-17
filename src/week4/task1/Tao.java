package week4.task1;

/**
 * This class represent the apple
 * @author xxNguyenxx
 */
public class Tao extends HoaQua {

    /**
     * Make new Apple object
     * @param price
     * @param size
     */
    public Tao(int price, double size) {
        super(price, size, "red");
    }

    /**
     * @param t An Apple object
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
