package QL_nganhang;

import java.text.NumberFormat;
import java.util.Scanner;

public class Class_nganhang {

    private long std;
    private String name;
    private double tien;

    public long getStd() {
        return std;
    }

    public void setStd(long std) {
        this.std = std;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public Class_nganhang() {
    }

    public Class_nganhang(long std, String name, double tien) {
        this.std = std;
        this.name = name;
        this.tien = tien;
    }

    @Override
    public String toString() {
        return "Class_nganhang{" + "std=" + std + ", name=" + name + ", tien=" + tien + '}';
    }
    Scanner x = new Scanner(System.in);

    public void napTien() {

        System.out.print("Nhập vào số tiền nạp vào: ");
        double a = x.nextDouble();
        if (a > 0) {
            System.out.println("Số tiền sau khi nạp vào: " + (tien + a));
        } else {
            System.out.println("Vui lòng nhập lại tiền nạp vào!");
        }
    }

    public void rutTien() {
        System.out.print("Nhập vào phí rút tiền: ");
        double phi = x.nextDouble();
        System.out.print("Nhập vào số tiền cần rút: ");
        double rut = x.nextDouble();
        if (rut > tien - phi || rut < 0) {
            System.out.println("Vui lòng nhập lại!");

        } else {
            tien = tien - rut - phi;
            System.out.println("Bạn vừa rút: " + rut);
            System.out.println("Số tiền còn lại là: " + tien);
        }

    }

    public double daoHan() {
        double laisuat = 0.035;
        tien = tien + tien * laisuat;
        System.out.println("Bạn vừa được đảo hạn! Số tiền trong tài khoản là: " + tien);
        return tien;
    }

    void in() {
        System.out.printf("%-10s %-20s %-20s \n", std, name, tien);
    }
    
}
