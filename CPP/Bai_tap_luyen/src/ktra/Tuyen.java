/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btthiguaky;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author nguyentungduong
 */
public class Tuyen implements IHoatDong, Serializable {
    private String MaTuyen;
    private int KhoangCach;
    private String DiemDung;
    private int SoLuot;
    public void nhap() {
       System.out.println("Nhap ma tuyen: ");
        MaTuyen =new Scanner(System.in).nextLine();
        System.out.println("Nhap khoang cach: ");
        KhoangCach=new Scanner(System.in).nextInt();
        System.out.println("Nhap diem dung: ");
        DiemDung =new Scanner(System.in).nextLine();
    }

    public String getMaTuyen() {
        return MaTuyen;
    }

    public void setMaTuyen(String MaTuyen) {
        this.MaTuyen = MaTuyen;
    }

    public int getKhoangCach() {
        return KhoangCach;
    }

    public void setKhoangCach(int KhoangCach) {
        this.KhoangCach = KhoangCach;
    }

    public String getDiemDung() {
        return DiemDung;
    }

    public void setDiemDung(String DiemDung) {
        this.DiemDung = DiemDung;
    }

    public int getSoLuot() {
        return SoLuot;
    }

    public void setSoLuot(int SoLuot) {
        this.SoLuot = SoLuot;
    }
  

    @Override
    public String toString() {
        return "Tuyen{" + "MaTuyen=" + MaTuyen + ", KhoangCach=" + KhoangCach + ", DiemDung=" + DiemDung + '}';
    }

}
