package week4.task1;

/**
 * This class represent the orange
 *
 * @author xxNguyenxx
 */
public class CamSanh extends Cam {
    /**
     * Give new constant of Cam sanh
     *
     * @param price
     * @param size
     */
    public CamSanh(int price, double size) {
        super(price, size, "Cam Sanh");
    }

    public CamSanh(CamSanh c) {
        this(c.price, c.size);
    }

    public CamSanh() {

    }


}
