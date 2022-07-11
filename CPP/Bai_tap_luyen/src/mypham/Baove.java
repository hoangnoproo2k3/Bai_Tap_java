package mypham;

import java.io.Serializable;
import java.util.Scanner;

public class Baove extends NhanVien implements Serializable {
    public String Catruc;

    public Baove(String ma, String ten, String diachi, String SDT, String cmt, int hsl, long luongnv, String catruc) {
        super(ma, ten, diachi, SDT, cmt, hsl, luongnv);
        Catruc = catruc;
    }

    public Baove() {

    }
    public void nhapBaove(){
        super.nhapnv();
        Scanner SC = new Scanner(System.in);
        System.out.print("Nhap ca truc: ");
        Catruc = SC.next();
    }
    public void hienBaove(){
        super.hiennv();
        System.out.printf("%20s" , Catruc);

    }
}
