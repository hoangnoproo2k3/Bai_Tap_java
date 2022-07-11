package BTLHDTJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DSDocGia {
    ArrayList<DocGia> dsDG = new ArrayList<DocGia>();
    public void nhapDSdg() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng độc giả đến tìm sách: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            DocGia dg = new DocGia();
            System.out.println("\nNhập thông tin độc giả thứ " + (dsDG.size() + 1) + ": ");
            dg.nhap();
            dsDG.add(dg);
        }
    }

    public void hienDSdg() {
        System.out.println("Thông tin độc giả: ");
        for (DocGia dg : dsDG) {
            System.out.println(dg.toString());
        }
    }

    public void sapxeptheoten() {
        Collections.sort(dsDG);
        hienDSdg();
    }

    public void xoaDG() {
        System.out.print("Nhập tên độc giả không mượn sách: ");
        String name = new Scanner(System.in).nextLine();
        Boolean kt = false;
        for (DocGia dg : dsDG) {
            if (dg.getTen().equals(name)) {
                dsDG.remove(dg);
                kt = true;
                break;
            }
        }

        if (!kt) {
            System.out.println("Không tìm thấy người có tên: " + name);
        }
    }

    public void docGiaNam() {
        Boolean kt = false;

        for (DocGia dg : dsDG) {

            if (dg.isGtinh()) {
                System.out.println(dg.toString());
                kt = true;
                break;
            }
        }

        if (!kt) {
            System.out.println("Không có khách hàng nam!");
        }
    }

    public void suaDG() {
        System.out.println("Nhập mã độc giả cần sửa thông tin: ");
        String maDG = new Scanner(System.in).nextLine();
        for (DocGia dg : dsDG) {
            if (dg.getMaThe().equals(maDG)) {
                dg.nhap();
            }
        }
    }
}
