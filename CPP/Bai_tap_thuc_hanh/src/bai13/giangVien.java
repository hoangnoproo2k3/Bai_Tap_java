package bai13;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class giangVien extends canBo implements luong {

    private String khoa;

    @Override
    public float tinhluong() {
        return this.hsl * 1650000 + this.hsl * 1650000 * 0.2f;
    }

    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Nhap khoa: ");
        this.khoa = new Scanner(System.in).nextLine();
    }

    public void hien() {
        super.hien();
        System.out.println("Khoa: "+khoa);
        System.out.println("Lương: " + tinhluong());
    }
}
