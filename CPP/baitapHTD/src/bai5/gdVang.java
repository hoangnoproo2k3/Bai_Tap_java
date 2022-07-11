package bai5;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class gdVang extends Giaodich implements thanhTien {

    private String loaiVang;

    public gdVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public gdVang(String loaiVang, String ma, Date ngay, float dongia, int soluong) {
        super(ma, ngay, dongia, soluong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Nhập loại vàng: ");
        loaiVang = new Scanner(System.in).nextLine();

    }

    public void hien() {
        super.hien();
        System.out.print("\t Loại vàng: " + loaiVang);
    }

    @Override
    public float tinhtien() {
        return this.getSoluong() * this.getDongia();
    }
}
