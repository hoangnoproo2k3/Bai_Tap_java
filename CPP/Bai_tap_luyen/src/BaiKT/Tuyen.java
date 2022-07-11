/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiKT;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Tuyen implements Serializable{

    private String MaTuyen;
    private int SoDiemDung;
    private double khoangcach;

    public Tuyen() {
    }

    public String getMaTuyen() {
        return MaTuyen;
    }

    public void setMaTuyen(String MaTuyen) {
        this.MaTuyen = MaTuyen;
    }

    public int getSoDiemDung() {
        return SoDiemDung;
    }

    public void setSoDiemDung(int SoDiemDung) {
        this.SoDiemDung = SoDiemDung;
    }

    public double getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(double khoangcach) {
        this.khoangcach = khoangcach;
    }

    @Override
    public String toString() {
        return "Tuyen [ mã : " + MaTuyen + " , Số điểm dừng : " + SoDiemDung + " , khoảng cách : "
                + khoangcach + "]";
    }

    public void nhap() {
          System.out.print("Moi nhap ma tuyen : ");
          MaTuyen = new Scanner(System.in).nextLine();
           System.out.print("Moi nhap so diem dung : ");
          SoDiemDung = new Scanner(System.in).nextInt();
          System.out.print("Moi nhap khoang cach : ");
          khoangcach = new Scanner(System.in).nextDouble();
    }
}
