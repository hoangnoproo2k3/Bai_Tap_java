package baitap2;

/**
 *
 * @author AS
 */
public class tulanh {
    private int dungTich;
    private String mausac;
    private String hangsx;
    private int soluong;
    private float dongia;
    
    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getHangsx() {
        return hangsx;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public tulanh() {
    }

    public tulanh(int dungTich, String mausac, String hangsx, int soluong, float dongia) {
        this.dungTich = dungTich;
        this.mausac = mausac;
        this.hangsx = hangsx;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    public float thanhtien(){
        return soluong*dongia;
    }
    @Override
    public String toString() {
        return "tulanh{" + "dungTich=" + dungTich + ", mausac=" + mausac + ", hangsx=" + hangsx 
                + ", soluong=" + soluong + ", dongia=" + dongia + ",thanhtien=" +thanhtien()+ '}';
    }
    
}
