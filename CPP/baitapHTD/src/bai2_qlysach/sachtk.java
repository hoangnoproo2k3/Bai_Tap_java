package bai2_qlysach;

import java.util.Date;

/**
 *
 * @author AS
 */
public class sachtk extends sach {
    private double thue;

    public sachtk() {
    }

    public sachtk(double thue) {
        this.thue = thue;
    }

    public sachtk(double thue, String maSach, String ngayNhap, double donGia, String nhaXB, int soLuong) {
        super(maSach, ngayNhap, donGia, nhaXB, soLuong);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
    public double thanhTien(){
        return (getSoLuong()*getDonGia()+thue);
    }

    @Override
    public String toString() {
        return "sachtk{"+super.toString() + "thue=" + thue +"], thanh tien: " + thanhTien()+'}';
    }

}
