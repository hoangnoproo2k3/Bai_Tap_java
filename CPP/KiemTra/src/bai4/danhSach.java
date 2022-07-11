package bai4;

import java.util.Scanner;

public class danhSach {

    hocSinh ds[];
    int n, sum = 0;

    public void nhapDs() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sinh viên: ");
        n = Integer.parseInt(x.nextLine());
        ds = new hocSinh[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new hocSinh();
            ds[i].nhap();
        }
    }

    public void hienDs() {
        for (int i = 0; i < n; i++) {
            ds[i].hien();
        }
    }

    public void tongTien() {

        for (int i = 0; i < n; i++) {
            sum += ds[i].tien;
        }
        System.out.println("Tổng tiền là: " + sum);
    }

    public void sapXep() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i].so_buoi > ds[j].so_buoi) {
                    hocSinh a = ds[i];
                    ds[i] = ds[j];
                    ds[j] = a;
                }
            }

        }
        hienDs();
    }

    public void tesT() {

        for (int i = 0; i < n; i++) {
            if (ds[i].so_buoi > 20) {
                ds[i].hien();
            }
        }
    }
}
