package bai4;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class chuyenXe {
    private String machuyen;
    private String tentaixe;
    private int soxe;
    private float doanhthu;

    public chuyenXe() {
    }

    public chuyenXe(String machuyen, String tentaixe, int soxe, float doanhthu) {
        this.machuyen = machuyen;
        this.tentaixe = tentaixe;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }

    public String getMachuyen() {
        return machuyen;
    }

    public void setMachuyen(String machuyen) {
        this.machuyen = machuyen;
    }

    public String getTentaixe() {
        return tentaixe;
    }

    public void setTentaixe(String tentaixe) {
        this.tentaixe = tentaixe;
    }

    public int getSoxe() {
        return soxe;
    }

    public void setSoxe(int soxe) {
        this.soxe = soxe;
    }

    public float getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(float doanhthu) {
        this.doanhthu = doanhthu;
    }

    @Override
    public String toString() {
        return "chuyenXe{" + "machuyen=" + machuyen + ", tentaixe=" + tentaixe + ", soxe=" + soxe + ", doanhthu=" + doanhthu + '}';
    }
    public void nhapinfo(){
        System.out.print("Nhập mã chuyến: ");
        machuyen= new Scanner(System.in).nextLine();
        System.out.print("Nhập tên tài xế: ");
        tentaixe= new Scanner(System.in).nextLine();
        System.out.print("Nhập số xe: ");
        soxe= new Scanner(System.in).nextInt();
        System.out.print("Nhập vào doanh thu: ");
        doanhthu= new Scanner(System.in).nextFloat();
    }
}
