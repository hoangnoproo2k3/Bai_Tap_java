/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlhuongdoituong;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author VHC
 */
public class CongAn implements IThaoTac, IGioiTinh, Serializable  {
    private String MaSo;
    private String Hoten;
    private String NgaySinh;
    private String GioiTinh;
    private float HSL;

    public String getMaSo() {
        return MaSo;
    }

    public void setMaSo(String MaSo) {
        this.MaSo = MaSo;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public float getHSL() {
        return HSL;
    }

    public void setHSL(float HSL) {
        this.HSL = HSL;
    }
    public CongAn(){};
    public CongAn(String MaSo,String HoTen,String NgaySinh,String GioiTinh,Float HSL){
        this.GioiTinh=GioiTinh;
        this.MaSo= MaSo;
        this.Hoten=HoTen;
        this.HSL=HSL;
        this.NgaySinh=NgaySinh;
};
    public float luong(){
    return HSL*1500000;
            };
    @Override
    public void nhap(){
    Scanner sc= new Scanner(System.in);
    System.out.print("Nhap ma so cong an: ");
    MaSo=sc.nextLine();
    System.out.print("Nhap Ho Ten COng An: ");
    Hoten=sc.nextLine();
    System.out.print("Nhap Ngay Sinh COng An: ");
    NgaySinh=sc.nextLine();
     System.out.print("\tNhập giới tính (1 là nam, 2 là nữ): ");
        GioiTinh = sc.next();
        if (GioiTinh.equals("1")) {
            GioiTinh = gt1;
        } else GioiTinh = gt2;
        System.out.print("Nhập hệ số lương: ");
        HSL=sc.nextFloat();
       
    }
    @Override
    public String toString() {
        return String.format("%-15s%-20s%-15s%-15s%-15s\n", getMaSo(),
                getHoten(), getNgaySinh(), getGioiTinh(), luong());
    }

   

    };
    

