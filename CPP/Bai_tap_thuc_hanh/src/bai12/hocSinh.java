package bai12;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class hocSinh extends nguoi {

    private String lop;

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void nhap() {
        super.nhap();
        System.out.println("Nhập vào tên lớp: ");
        lop = new Scanner(System.in).nextLine();

    }

    public void hien() {
        super.hien();
        System.out.println("Tên lớp: " + this.lop);
    }

    

}
