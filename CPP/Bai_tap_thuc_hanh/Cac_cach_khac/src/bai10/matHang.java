package bai10;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class matHang {
    private String tenHang;
    private int maHang;
    private String nuocSX;

    public matHang() {
    }

    public matHang(String tenHang, int maHang, String nuocSX) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.nuocSX = nuocSX;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }
    public void nhap(){
        System.out.print("Nhập vào tên hàng: ");
        tenHang= new Scanner(System.in).nextLine();
        System.out.print("Nhập vào mã hàng: ");
        maHang = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào nước sản xuất: ");
        nuocSX= new Scanner(System.in).nextLine();
    }
    public void hien(){
        System.out.println("Tên Hàng:"+ tenHang);
        System.out.println("Mã Hàng: "+ maHang);
        System.out.println("Nước sản xuất: "+nuocSX);
    }
}
