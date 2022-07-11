package bai8;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class taikhoan {
    public String so;
    public String ten;
    public double tien;
    public float laisuat;
    public taikhoan() {
        tien =100;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public float getLaisuat() {
        return laisuat;
    }

    public void setLaisuat(float laisuat) {
        this.laisuat = (float)0.05;
    }
    public void nhap(){
        
        System.out.println("Nhập số tài khoản: ");
        so= new Scanner(System.in).nextLine();
        System.out.println("Nhập tên tài khoản: ");
        ten=new Scanner(System.in).nextLine();
        
        
    }
    
    
}
