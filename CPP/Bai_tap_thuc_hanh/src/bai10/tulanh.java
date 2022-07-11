package bai10;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class tulanh extends mathang{
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
    public void nhap(){
        super.nhap();
        System.out.print("Nhập dung tích: ");
        dungTich= new Scanner(System.in).nextInt();
        System.out.print("Nhập  màu sác : ");
        mausac= new Scanner(System.in).nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        hangsx = new Scanner(System.in).nextLine();
        System.out.print("Nhập số lượng: ");
        soluong= new Scanner(System.in).nextInt();
        System.out.print("Nhập đơn giá: ");
        dongia= new Scanner(System.in).nextFloat();
    }
    public void hien(){
        super.hien();
        System.out.println("\n + Dung tich: "+dungTich +"\n  Mau sac: "+mausac+"\n  Hang SX: "+hangsx+
                           "\n  So luong: "+soluong+"\n  Don gia: "+dongia+"\n  Thanh tien:"+thanhtien());
    }
}
