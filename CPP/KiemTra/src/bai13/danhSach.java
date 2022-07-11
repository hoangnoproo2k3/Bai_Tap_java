package bai13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhSach {

    ArrayList<canBo> ds = new ArrayList<canBo>();
    canBo cb;

    public void nhapDs(int chon) {
        switch (chon) {
            case 1:
                cb = new chuyenVien();
                cb.nhap();
                ds.add(cb);
                break;
            case 2:
                cb = new giangVien();
                cb.nhap();
                ds.add(cb);
                break;
            case 3:
                cb = new quanLy();
                cb.nhap();
                ds.add(cb);
                break;
            case 4:
                this.hienDs();
                break;
            default:
                break;
        }
    }

    public void hienDs() {
        for (canBo cb : ds) {
            cb.hien();
        }
    }

    public void menu() {
        int chon;
        do {
            System.out.println("=========MENU=========");
            System.out.println("1.Chuyen vien  ");
            System.out.println("2.Giang vien  ");
            System.out.println("3.Ten quan ly  ");
            System.out.println("4.Hien danh sach  ");
            System.out.println("0.Thoat.  ");
            System.out.print("Chon so: ");
            chon = new Scanner(System.in).nextInt();
            nhapDs(chon);
        } while (chon != 0);
    }

}
