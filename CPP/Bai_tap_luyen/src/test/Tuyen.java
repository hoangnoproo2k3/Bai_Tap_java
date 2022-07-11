package test;

import java.io.Serializable;
import java.util.Scanner;

public class Tuyen implements Serializable {
    private String maTuyen;
    private float khoangCach;
    private int diemDung, Luot;

    public Tuyen(String maTuyen, float khoangCach, int diemDung, int luot) {
        this.maTuyen = maTuyen;
        this.khoangCach = khoangCach;
        this.diemDung = diemDung;
        Luot = luot;
    }

    public Tuyen() {

    }

    public String getMaTuyen() {
        return maTuyen;
    }

    public void setMaTuyen(String maTuyen) {
        this.maTuyen = maTuyen;
    }

    public float getKhoangCach() {
        return khoangCach;
    }

    public void setKhoangCach(float khoangCach) {
        this.khoangCach = khoangCach;
    }

    public int getDiemDung() {
        return diemDung;
    }

    public void setDiemDung(int diemDung) {
        this.diemDung = diemDung;
    }

    public int getLuot() {
        return Luot;
    }

    public void setLuot(int luot) {
        Luot = luot;
    }

    public void Nhapt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma tuyen: ");
        maTuyen = sc.next();
        System.out.print("Nhap khoang cach: ");
        khoangCach = sc.nextFloat();
        System.out.print("Nhap so diem dung: ");
        diemDung = sc.nextInt();
    }

    public void NhaptL() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma tuyen: ");
        maTuyen = sc.next();
        System.out.print("Nhap khoang cach: ");
        khoangCach = sc.nextFloat();
        System.out.print("Nhap so diem dung: ");
        diemDung = sc.nextInt();
        System.out.print("Nhap so luot: ");
        Luot = sc.nextInt();
    }

    public float Tong() {
        return getLuot()*getKhoangCach();
    }

    public String toString() {
        return "Tuyen{" +
                "maTuyen='" + maTuyen + '\'' +
                ", khoangCach=" + khoangCach +
                ", diemDung=" + diemDung +
                ", Luot=" + Luot +
                '}' + "\n";
    }
}
