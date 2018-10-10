package week4.task1;

/**
 * This class represent the orange
 * @author xxNguyenxx
 */
public class CamThanhPhong extends Cam{
    public CamThanhPhong(int price, double size) {
        super(price, size, "Cam Thanh Phong" );
    }

    public CamThanhPhong(CamThanhPhong c) {
        this(c.price, c.size);
    }

    public CamThanhPhong() {
    }
}
