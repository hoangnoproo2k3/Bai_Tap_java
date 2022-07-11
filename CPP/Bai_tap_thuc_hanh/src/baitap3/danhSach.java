package baitap3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhSach {

    ArrayList<nguoi> ds = new ArrayList<>();

    public void Nhapds() {

        nguoi Ng;
        System.out.print("Nhap vao so luong hoc sinh: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            Ng = new hocSinh();
            Ng.nhap();
            ds.add(Ng);

        }
    }

    public void hienDs() {
        for (nguoi Ng : ds) {
            Ng.hien();
        }
    }

}
