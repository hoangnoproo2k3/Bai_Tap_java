package bai14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class DSxe {

    ArrayList<xe> ds = new ArrayList<>();
    xe x;

    public void nhapDs(int chon) {
        switch (chon) {
            case 1:
                x = new xeDap();
                x.nhap();
                ds.add(x);
                break;
            case 2:
                x = new xeMay();
                x.nhap();
                ds.add(x);
                break;
            case 3:
                x = new xeTai();
                x.nhap();
                ds.add(x);
                break;
            case 4:
                x = new xeKhach();
                x.nhap();
                ds.add(x);
                break;
            case 5:
                this.xuatDs();
                break;
            default:
                break;
        }

    }

    public void xuatDs() {
        for (xe x : ds) {
            x.hien();
        }
    }
    public void menu(){
        int chon;
    do {
            System.out.println("=========MENU=========");
            System.out.println("1.Xe dap  ");
            System.out.println("2.Xe may  ");
            System.out.println("3.Xe tai  ");
            System.out.println("4.Xe khach  ");
            System.out.println("0.Thoat.  ");
            System.out.print("Chon xe so: ");
            chon = new Scanner(System.in).nextInt();
            nhapDs(chon);
        } while (chon != 0);
}
}
