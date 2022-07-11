package BTLHDTJava;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class SachNhap extends Sach implements Serializable {

    private float giamGia;

    public SachNhap() {
    }

    public SachNhap(float giamGia) {
        this.giamGia = giamGia;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public void nhap() {
        super.nhap();
        System.out.print("Nhập vào giảm giá: ");
        giamGia = new Scanner(System.in).nextFloat();
    }

    public float tienNhapSach() {
        return getSoLuong() * giamGia * getGiaMuon();
    }

    @Override
    public String toString() {
        return "SachNhap: " + super.toString() + " giamGia= " + giamGia + " Tiền: " + tienNhapSach();
    }

}
