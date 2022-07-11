package bai8;

import java.util.Scanner;

class Taikhoan {

    private String sotaikhoan;
    private String tentaikhoan;
    private double sotien;
    private float laisuat;

    public Taikhoan() {
        sotien = 100;
    }

    public Taikhoan(String sotaikhoan, String tentaikhoan, double sotien, float laisuat) {
        this.sotaikhoan = sotaikhoan;
        this.tentaikhoan = tentaikhoan;
        this.sotien = sotien;
        this.laisuat = laisuat;
    }

    public void setsotaikhoan(String sotaikhoan) {
        this.sotaikhoan = sotaikhoan;
    }

    public String getsotaikhoan() {
        return sotaikhoan;
    }

    public void settentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public String gettentaikhoan() {
        return tentaikhoan;
    }

    public void setsotien(double sotien) {
        this.sotien = sotien;
    }

    public double getsotien() {
        return sotien;
    }

    public void setlaisuat(float laisuat) {
        this.laisuat = (float) 0.05;
    }

    public float getlaisuat() {
        return laisuat;
    }

    public void nhaptt() {

        Scanner nhap = new Scanner(System.in);
        System.out.print("Số tài khoản:");
        sotaikhoan = nhap.nextLine();
        System.out.print("Tên tài khoản:");
        tentaikhoan = nhap.nextLine();
        System.out.print("Tiền:");
        sotien = nhap.nextDouble();
    }

    public void hientt() {
        System.out.println("Số tài khảon:" + sotaikhoan + "");
        System.out.println("tên tài khỏan:" + tentaikhoan + "");
        System.out.println("Tiền:" + sotien + "");
    }

    public void guitien() {
        double sotiennew;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Số tiền gửi vào:");
        do {
            sotiennew = nhap.nextDouble();
            System.out.print("Nhập lại!");
        } while (sotiennew < 0);
        sotien = sotien + sotiennew;
        System.out.println("Thành công! Số tiền của bạn:" + sotien + "");
    }

    public void ruttien() {
        double sotienrut;
        double phiruttien = 0;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Số tiền rút:");
        
            sotienrut = nhap.nextDouble();
            if ((sotienrut + phiruttien) <= sotien) {
                sotien = sotien - (sotienrut + phiruttien);
                System.out.println("Thành công! Số tiền còn lại:" + sotien + "");
            } else {
                System.out.println("Không hợp lệ");
            }
        
    }

    public void daohan() {
        double daohan;
        laisuat = (float) 0.05;
        daohan = sotien + sotien * laisuat;
        System.out.println("Đảo hạn:" + daohan + "");
    }

    @Override
    public String toString() {
        return "" + sotaikhoan + "" + tentaikhoan + "" + sotien;
    }
}
