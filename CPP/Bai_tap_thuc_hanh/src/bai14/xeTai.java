package bai14;

/**
 *
 * @author AS
 */
public class xeTai extends xe implements thueXe {

    @Override
    public double tinhThue() {
        return getGiaTri() * (getThue() + getVat());
    }

    @Override
    public double getVat() {
        return 0.1;
    }

    @Override
    public double getThue() {
        return 0.02;
    }

}
