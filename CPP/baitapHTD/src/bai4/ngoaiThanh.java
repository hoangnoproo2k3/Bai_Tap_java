package bai4;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class ngoaiThanh extends chuyenXe {
    private String noiden;
    private int soNgay;

    public ngoaiThanh() {
    }

    public ngoaiThanh(String noiden, int soNgay) {
        this.noiden = noiden;
        this.soNgay = soNgay;
    }

    public ngoaiThanh(String noiden, int soNgay, String machuyen, String tentaixe, int soxe, float doanhthu) {
        super(machuyen, tentaixe, soxe, doanhthu);
        this.noiden = noiden;
        this.soNgay = soNgay;
    }

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return "ngoaiThanh{"+super.toString() + "noiden=" + noiden + ", soNgay=" + soNgay + '}';
    }
    public void nhapinfo(){
        super.nhapinfo();
        System.out.print("Nhập nơi đến: ");
        noiden= new Scanner(System.in).nextLine();
        System.out.print("Nhập số ngày: ");
        soNgay= new Scanner(System.in).nextInt();
    }
    
}
