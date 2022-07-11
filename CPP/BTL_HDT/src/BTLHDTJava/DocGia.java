package BTLHDTJava;

import BTLJava.KhachHang;
import java.io.Serializable;
import java.util.Scanner;

public class DocGia implements Comparable, Serializable, INhap {

    private String ten, maThe, diaChi, sdt;
    private int tuoi;
    private boolean gtinh;

    public DocGia() {
    }

    public DocGia(String ten, String maThe, String diaChi, String sdt, int tuoi, boolean gtinh) {
        this.ten = ten;
        this.maThe = maThe;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.gtinh = gtinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGtinh() {
        return gtinh;
    }

    public void setGtinh(boolean gtinh) {
        this.gtinh = gtinh;
    }

    @Override
    public String toString() {
        String gt = "";
        if (this.gtinh) {
            gt = "nam";
        } else {
            gt = "nữ";
        }
        return  " Tên: " + ten + "\t Mã thẻ: " + maThe + "\t Địa chỉ: " + diaChi + "\t SDT:" + sdt + "\t Tuổi: "
                + tuoi + "\t Giới tính: " + gt;
    }

    public int compareTo(Object o) {
        return ten.compareTo(((DocGia) o).getTen());
    }

    @Override
    public void nhap() {
        System.out.print("Nhập mã độc giả: ");
        maThe = new Scanner(System.in).nextLine();
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên độc giả: ");
        ten = sc.nextLine();
        System.out.print("Số điện thoại: ");
        sdt = new Scanner(System.in).nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = new Scanner(System.in).nextInt();
        while (true) {
            try {
                System.out.print("Giới tính (true:Nam : false:Nữ): ");
                gtinh = sc.nextBoolean();
                sc.nextLine();
                break;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Nhập lại!");
            }
        }
        System.out.print("Nhập địa chỉ: ");
        diaChi = new Scanner(System.in).nextLine();

    }
}
