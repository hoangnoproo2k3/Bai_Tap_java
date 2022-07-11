package bai2;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class MatHang {

    private int maHang;
    private String tenHang;
    private String nhomHang;
    private int giaHang;

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNhomHang() {
        return nhomHang;
    }

    public void setNhomHang(String nhomHang) {
        this.nhomHang = nhomHang;
    }

    public int getGiaHang() {
        return giaHang;
    }

    public void setGiaHang(int giaHang) {
        this.giaHang = giaHang;
    }

    public MatHang() {
    }

    public MatHang(int maHang, String tenHang, String nhomHang, int giaHang) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaHang = giaHang;
    }

    public void nhapMH() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ma hang:");
        do {
            maHang = Integer.parseInt(sc.nextLine());
        } while (maHang < 1000 && maHang > 10000);

        System.out.println("nhap ten hang: ");
        tenHang = sc.nextLine();

        System.out.println("nhap nhom hang: ");
        nhomHang = sc.nextLine();

        System.out.println("nhap gia hang: ");
        giaHang = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "KhachHang [maHang=" + maHang + ", tenHang=" + tenHang + ", nhomHang=" + nhomHang + ", giaHang="
                + giaHang + "]";
    }
}
