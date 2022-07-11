package BTLHDTJava;

import java.io.Serializable;
import java.util.Scanner;

public class Sach implements INhomSach, Serializable, INhap {

    private String tenSach, tenTgia, nhaXB;
    private float giaMuon;
    private String nhomSach;
    private int soLuong;

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTgia() {
        return tenTgia;
    }

    public void setTenTgia(String tenTgia) {
        this.tenTgia = tenTgia;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public String getNhomSach() {
        return nhomSach;
    }

    public void setNhomSach(String nhomSach) {
        this.nhomSach = nhomSach;
    }

    public float getGiaMuon() {
        return giaMuon;
    }

    public void setGiaMuon(float giaMuon) {
        this.giaMuon = giaMuon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Sach() {
    }

    public Sach(String tenSach, String tenTgia, String nhaXB, float giaMuon, String nhomSach, int soLuong) {
        this.tenSach = tenSach;
        this.tenTgia = tenTgia;
        this.nhaXB = nhaXB;
        this.giaMuon = giaMuon;
        this.nhomSach = nhomSach;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return " tenSach=" + tenSach + ", tenTgia=" + tenTgia + ", nhaXB=" + nhaXB + ", giaMuon=" + giaMuon + ", nhomSach=" + nhomSach + ", soLuong=" + soLuong ;
    }

    
    

   
    @Override
    public void nhap() {
        System.out.print("Nhập tên sách: ");
        tenSach = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên tác giả: ");
        tenTgia = new Scanner(System.in).nextLine();
        System.out.print("Nhap nhà xuất bản: ");
        nhaXB = new Scanner(System.in).nextLine();
        System.out.println("Nhập số lượng sách: ");
        soLuong= new Scanner(System.in).nextInt();
        int chon;
        do {
            System.out.println("Chọn loại sách: ");
            System.out.println("1. Sách giáo khoa");
            System.out.println("2. Sách bài tập");
            System.out.println("3. Sách nâng cao");
            System.out.println("4. Tạp chí");
            System.out.println("5. Ket thuc");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    nhomSach = SachGK;
                    break;
                case 2:
                    nhomSach = SachBT;
                    break;
                case 3:
                    nhomSach = SachNC;
                    break;
                case 4:
                    nhomSach = TapChi;
                    break;
                default:
                    break;
            }
        } while (chon != 5);

        System.out.print("Nhập vào giá mượn: ");
        giaMuon = new Scanner(System.in).nextFloat();
    }
}
