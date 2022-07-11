package bai2;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class KhanhHang {

    private int maKH = 00000;
    private String hoTen;
    private String diaChi;
    private int soDT;
    static int count = 0;

    public KhanhHang(String hoTen, String diaChi, int soDT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
        maKH = ++count;

    }

    public KhanhHang() {
        maKH = ++count;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public void nhapKH() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten khach hang: ");
        hoTen = sc.nextLine();
        System.out.println("nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("nhap so dien thoai: ");
        soDT = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "KhachHang [maKH=" + maKH + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDT=" + soDT + "]";
    }
}
