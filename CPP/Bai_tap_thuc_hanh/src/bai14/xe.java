package bai14;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public abstract class xe {

    private String tenXe;
    private String hangSx;
    private double giaTri;
    private String mauSac;

    public xe() {
    }

    public xe(String tenXe, String hangSx, double giaTri, String mauSac) {
        this.tenXe = tenXe;
        this.hangSx = hangSx;
        this.giaTri = giaTri;
        this.mauSac = mauSac;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangSx() {
        return hangSx;
    }

    public void setHangSx(String hangSx) {
        this.hangSx = hangSx;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void hien(){
        System.out.print("Tên xe: "+tenXe+"\tHãng sản xuất: "+hangSx+"\tGiá trị: "+giaTri+"\t Màu sắc: "+mauSac +"\n");
    }

    

    public void nhap() {
        System.out.println("Nhập tên xe: ");
        tenXe = new Scanner(System.in).nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        hangSx= new Scanner(System.in).nextLine();
        System.out.println("Nhập vào giá trị: ");
        giaTri = new Scanner(System.in).nextDouble();
        System.out.println("Nhập màu sắc: ");
        mauSac= new Scanner(System.in).nextLine();
    }

    public abstract double tinhThue();
}
