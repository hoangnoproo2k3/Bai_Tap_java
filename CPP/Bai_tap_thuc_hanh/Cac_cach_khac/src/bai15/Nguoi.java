package bai15;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class Nguoi {

    private String hoTen;
    private int tuoi;
    private boolean gtinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, boolean gtinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gtinh = gtinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public boolean isGtinh() {
        return gtinh;
    }

    public void nhap() {
        System.out.print("Nhap ho ten: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nam sinh: ");
        this.tuoi = new Scanner(System.in).nextInt();
        System.out.print("Nữ-True : Nam-False ");
        this.gtinh = new Scanner(System.in).nextBoolean();
    }
}
