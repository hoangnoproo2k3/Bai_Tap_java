package bai2_qlysach;

/**
 *
 * @author AS
 */
public class sachgk extends sach {
    private boolean tinhTrang;

    public sachgk() {
    }

    public sachgk(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
public double thanhTien(){
        if(isTinhTrang())
            return getDonGia()*getSoLuong();
        else
            return getDonGia()*getSoLuong()*0.5;
    }
    @Override
    public String toString() {
        String tg;
        if(isTinhTrang())
            tg ="moi";
        else
            tg ="cu";
        return "sachgk{"+super.toString() + "tinhTrang=" + tinhTrang + "], thanh tien: " + thanhTien()+'}';
    }
    
}
