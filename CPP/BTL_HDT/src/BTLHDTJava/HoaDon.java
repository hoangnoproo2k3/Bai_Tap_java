package BTLHDTJava;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon implements Serializable{

    private String maHD, ngayLap;
    private int soNgayMuon;
    private float tienMuon;
    Sach sach = new Sach();

    DocGia dGia = new DocGia();

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public int getSoNgayMuon() {
        return soNgayMuon;
    }

    public void setSoNgayMuon(int soNgayMuon) {
        this.soNgayMuon = soNgayMuon;
    }

    public float getTienMuon() {
        return tienMuon;
    }

    public void setTienMuon(float tienMuon) {
        this.tienMuon = tienMuon;
    }

    public HoaDon() {
    }

    public HoaDon(String maHD, String ngayLap, int soNgayMuon, float tienMuon) {
        this.maHD = maHD;
        this.ngayLap = ngayLap;
        this.soNgayMuon = soNgayMuon;
        this.tienMuon = tienMuon;
    }

    public void nhapHD(ArrayList<Sach> dssach, ArrayList<DocGia> dsdg) {
        System.out.println("Nhập mã hóa đơn: ");
        maHD= new Scanner(System.in).next();
        System.out.print("Nhập ngày mượn sách: ");
        ngayLap = new Scanner(System.in).nextLine();

        System.out.print("Nhập số ngày mượn: ");
        soNgayMuon = new Scanner(System.in).nextInt();

        while (true) {
            System.out.print("Nhập mã thẻ độc giả: ");
            String maDG = new Scanner(System.in).nextLine();
            boolean kt = false;
            for (DocGia dgia : dsdg) {
                if (dgia.getMaThe().equals(maDG)) {
                    dGia = dgia;
                    kt = true;
                    break;
                }
            }
            if (kt) {
                break;
            }
            System.out.println("Mã độc giả không hợp lệ. Nhập lại!");
        }
        while (true) {
            System.out.print("Nhập tên sách: ");
            String tsach = new Scanner(System.in).nextLine();
            boolean kt = false;
            for (Sach s : dssach) {
                if (s.getTenSach().equals(tsach)) {
                    sach = s;
                    kt = true;
                    break;
                }
            }
            if (kt) {
                break;
            }
            System.out.println("Tên sách không hợp lệ! Nhập lại!");
        }
        tienMuon = sach.getGiaMuon() * soNgayMuon;
    }

    public void hienHD() {
        System.out.println("Mã hóa đơn: " + maHD);
        System.out.println("Ngày mượn: " + ngayLap);
        System.out.println("Số ngày mượn sách: " + soNgayMuon);
        System.out.println("Thông tin sách mượn: ");
        System.out.println(sach.toString() + " Số tiền mượn: "+tienMuon);
        System.out.println(dGia.toString()+" ");
    }
}
