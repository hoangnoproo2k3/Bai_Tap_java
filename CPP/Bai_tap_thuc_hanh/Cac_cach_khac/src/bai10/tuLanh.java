package bai10;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class tuLanh extends matHang {
    private int dungTich;
    private String mauSac;
    private String hangSX;
    private int soLuong;
    private float donGia;

    public tuLanh() {
    }

    public tuLanh(int dungTich, String mauSac, String hangSX, int soLuong, float donGia) {
        this.dungTich = dungTich;
        this.mauSac = mauSac;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Nhập vào dung tích: ");
        dungTich= new Scanner(System.in).nextInt();
        System.out.print("Nhập vào màu sắc: ");
        mauSac= new Scanner(System.in).nextLine();
        System.out.print("Nhập vào hãng sản xuất: ");
        hangSX= new Scanner(System.in).nextLine();
        System.out.print("Nhập vào số lưong: ");
        soLuong= new Scanner(System.in).nextInt();
        System.out.print("Nhập vào đơn giá: ");
        donGia= new Scanner(System.in).nextFloat();
    
    }
    public float thanhTien(){
        return soLuong*donGia;
    }
    public void hiends(){
        super.hien();
        System.out.println("Dung tích "+dungTich);
        System.out.print("\tMàu sắc: "+ mauSac);
        System.out.print("\tHãng sản xuất: "+ hangSX);
        System.out.print("\tSố lượng: "+soLuong);
        System.out.print("\tĐơn giá: "+donGia);
    }
    
}
