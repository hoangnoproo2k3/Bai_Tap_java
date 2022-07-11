package bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sach {
   private String maSach;
   private Date ngayNhap;
   private double donGia;
   private String nhaXB;
   private int soLuong;

    public Sach() {
    }

    public Sach(String maSach, Date ngayNhap, double donGia, String nhaXB) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.nhaXB = nhaXB;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    @Override
    public String toString() {
        return "maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + 
                 ", soluong=" + soLuong +", nhaXB=" + nhaXB;
    }
   
    public void nhapSachInfo() throws ParseException{
        System.out.println("Nhap ma sach: ");
        maSach = new Scanner(System.in).nextLine();
        System.out.println("Nhap ngay (dd-MM-yyyy): ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");        
        Date date = dateFormat.parse(new Scanner(System.in).nextLine());
        ngayNhap = date;
        System.out.println("Nhap don gia: ");
        donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhap nha xb: ");
        nhaXB = new Scanner(System.in).nextLine();    
        System.out.println("Nhap so luong: ");
        soLuong = new Scanner(System.in).nextInt();
    }

    
   
}
