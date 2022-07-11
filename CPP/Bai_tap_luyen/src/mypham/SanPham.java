package mypham;

import java.io.Serializable;
import java.util.Scanner;

public class SanPham implements Serializable{

    public String mamp;
    public String tenmp;
    public String Xuatxu;
    public int sl;
    public int dongia;
    public int Thtien;
    public SanPham(String mamp, String tenmp, String Xuatxu, int sl, int dongia) {
        this.mamp = mamp;
        this.tenmp = tenmp;
        this.Xuatxu = Xuatxu;
        this.sl = sl;
        this.dongia = dongia;
    }

    public SanPham(int Thtien) {
        this.Thtien = Thtien;
    }

    public int getThtien() {
        return Thtien;
    }

    public void setThtien(int Thtien) {
        this.Thtien = Thtien;
    }
    
    public SanPham()
    {
        
    }
    public String getMamp() {
        return mamp;
    }

    public String getTenmp() {
        return tenmp;
    }

    public String getXuatxu() {
        return Xuatxu;
    }

    public int getSl() {
        return sl;
    }

    public int getDongia() {
        return dongia;
    }

    public void setMamp(String mamp) {
        this.mamp = mamp;
    }

    public void setTenmp(String tenmp) {
        this.tenmp = tenmp;
    }

    public void setXuatxu(String Xuatxu) {
        this.Xuatxu = Xuatxu;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }
    public void nhapsanpham()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        mamp= sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tenmp= sc.nextLine();
        System.out.print("Nhập nơi xuất xứ: ");
        Xuatxu= sc.nextLine();
        System.out.print("Nhập số lượng: ");
        sl=sc.nextInt();
        System.out.print("Nhập đơn giá sản phẩm: ");
        dongia=sc.nextInt();
        Thtien=sl*dongia;
    }
    public void hiensanpham()
    {
        System.out.printf("%20s", mamp);
        System.out.printf("%20s", tenmp);
        System.out.printf("%20s", Xuatxu);
        System.out.printf("%20d", sl);
        System.out.printf("%20d",dongia);
        System.out.printf("%20d",Thtien);
    }
}

