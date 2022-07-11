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
public class DoiTuong implements IThaoTac, IGioiTinh, Serializable{
    private String  scccd;
    private String ten;
    private String gioitinh;
    private String ngaysinh;

    public String getScccd() {
        return scccd;
    }

    public void setScccd(String scccd) {
        this.scccd = scccd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public DoiTuong(){};
    public DoiTuong(String scccd, String gioitinh,String ngaysinh){
    this.gioitinh=gioitinh;
    this.ngaysinh=ngaysinh;
    this.scccd=scccd;
    this.ten=ten;
    };
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap scccd doi tuong: ");
        scccd=sc.nextLine();
        System.out.print("Nhap ten doi tuong: ");
        ten=sc.nextLine();
        System.out.print("Ngay sinh: ");
        ngaysinh=sc.nextLine();
           System.out.print("\tNhập giới tính (1 là nam, 2 là nữ): ");
        gioitinh = sc.next();
        if (gioitinh.equals("1")) {
            gioitinh = gt1;
        } else gioitinh = gt2;      
    };
    @Override
    public String toString() {
        return String.format("%-15s%-20s%-15s%-15s\n", getScccd(),
                getTen(), getNgaysinh(), getGioitinh());
    }
    }
