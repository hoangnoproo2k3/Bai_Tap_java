package bai2_qlysach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class sach {

    private String maSach;
    private String ngayNhap;
    private double donGia;
    private String nhaXB;
    private int soLuong;

    public sach() {
    }

    public sach(String maSach, String ngayNhap, double donGia, String nhaXB, int soLuong) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.nhaXB = nhaXB;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
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
        return "sach{" + "maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", nhaXB=" + nhaXB + ", soLuong=" + soLuong + '}';
    }

    public void nhap() {
        System.out.println("Nhap ma sach: ");
        maSach = new Scanner(System.in).nextLine();

        System.out.println(" Nhap ngay (dd-MM-yyyy)");

        ngayNhap = new Scanner(System.in).nextLine();
        System.out.println("Nhap don gia: ");
        donGia = new Scanner(System.in).nextDouble();
        System.out.println("Nhap nha xb: ");
        nhaXB = new Scanner(System.in).nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = new Scanner(System.in).nextInt();
    }
}
