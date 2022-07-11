package testvui;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class HoaDon {

    private String mahd, ngay;
    DocGia x = new DocGia();
    Sach y = new Sach();

    public HoaDon() {
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public DocGia getX() {
        return x;
    }

    public void setX(DocGia x) {
        this.x = x;
    }

    public Sach getY() {
        return y;
    }

    public void setY(Sach y) {
        this.y = y;
    }

    public void nhaphd(ArrayList<Sach> dssach, ArrayList<DocGia> dsdocgia) {
        System.out.println("Nhập mã:");
        mahd = new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày: ");
        ngay = new Scanner(System.in).nextLine();
        while (true) {
            System.out.println("Nhập mã độc giả: ");
            String ma = new Scanner(System.in).nextLine();
            boolean kt = false;
            for (DocGia dg : dsdocgia) {
                if (dg.getMadg().equals(ma)) {
                    x = dg;
                    kt = true;
                    break;
                }
            }
            if (kt) {
                break;
            }
            System.out.println("Mã độc giả không hợp lệ!");
        }
        while(true){
            System.out.println("Nhập mã sách: ");
            String mas= new Scanner(System.in).nextLine();
            boolean kt= false;
            for(Sach s: dssach){
                if(s.getTen().equals(mas)){
                    y=s;
                    kt=true;
                    break;
                }
            }
            if(kt){
                break;
            }
            System.out.println("Sách không tồn tại!");
        }
    }
    public void hienhd(){
        System.out.println("Mã: "+mahd);
        System.out.println("Ngày: "+ ngay);
        System.out.println(x.toString());
        System.out.println(y.toString());
    }
    
}
