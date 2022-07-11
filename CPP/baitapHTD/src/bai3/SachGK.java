package bai3;

import java.util.Date;

public class SachGK extends Sach {

    private boolean tinhTrang;

    public SachGK() {
        super();
    }

    public SachGK(boolean tinhTrang) {
        super();
        this.tinhTrang = tinhTrang;
    }

    public SachGK(boolean tinhTrang, String maSach,
            Date ngayNhap, double donGia, String nhaXB) {
        super(maSach, ngayNhap, donGia, nhaXB);
        this.tinhTrang = tinhTrang;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double thanhTien() {
        if (isTinhTrang()) {
            return getDonGia() * getSoLuong();
        } else {
            return getDonGia() * getSoLuong() * 0.5;
        }
    }

    @Override
    public String toString() {
        String tg = "";
        if (isTinhTrang()) {
            tg = "moi";
        } else {
            tg = "cu";
        }
        return "SachGK{" + super.toString() + "tinhTrang[" + tg + "], thanh tien " + thanhTien() + '}';
    }

}
