package bai14;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class xeKhach extends xe implements thueXe {

    private int socho;

    public xeKhach() {
    }

    public xeKhach(int socho) {
        this.socho = socho;
    }

    public xeKhach(int socho, String tenXe, String hangSx, double giaTri, String mauSac) {
        super(tenXe, hangSx, giaTri, mauSac);
        this.socho = socho;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    public double thuetieuThu() {
        if (socho >= 5) {
            return 0.3;
        } else {
            return 0.5;
        }
    }

    @Override
    public double tinhThue() {
        return getGiaTri() * (getThue() + getVat() + thuetieuThu());
    }

    public void nhap() {
        super.nhap();
        socho = new Scanner(System.in).nextInt();
    }
    public void hien(){
        super.hien();
        System.out.print("\t Số chỗ: "+socho);
    }
    @Override
    public double getVat() {
        return 0.1;
    }

    @Override
    public double getThue() {
        return 0.2;
    }

}
