package bai3;


import java.util.Date;

public class SachTK extends Sach{
    private double thue;

    public SachTK() {
    }

    public SachTK(double thue, 
            String maSach, Date ngayNhap, double donGia, String nhaXB) {
        super(maSach, ngayNhap, donGia, nhaXB);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
    public double thanhTien(){
        return getSoLuong()*getDonGia()*(1+thue);
    }

    @Override
    public String toString() {
        return "SachTK{"+super.toString() + "thue [" + thue + "], thanh tien: " + thanhTien()+ '}';
    }
    
    
}

