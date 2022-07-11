package bai4;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class noiThanh extends chuyenXe{
    private int soTuyen;
    private int soKm;

    public noiThanh() {
    }

    public noiThanh(int soTuyen, int soKm) {
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public noiThanh(int soTuyen, int soKm, String machuyen, String tentaixe, int soxe, float doanhthu) {
        super(machuyen, tentaixe, soxe, doanhthu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    
    @Override
    public String toString() {
        return "noiThanh{"+super.toString() + "soTuyen=" + soTuyen + ", soKm=" + soKm + '}';
    }
    public void nhapinfo(){
        super.nhapinfo();
        System.out.print("Nhập số tuyến: ");
        soTuyen= new Scanner(System.in).nextInt();
        System.out.print("Nhâp số km: ");
        soKm= new Scanner(System.in).nextInt();
                
    }
}
