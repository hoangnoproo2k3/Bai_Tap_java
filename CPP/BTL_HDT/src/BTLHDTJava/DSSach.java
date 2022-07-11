package BTLHDTJava;

import java.util.ArrayList;
import java.util.Scanner;

public class DSSach {

    ArrayList<Sach> dsSach = new ArrayList<Sach>();

    public void nhapDSs() {
        Scanner sc = new Scanner(System.in);
        int n;
         System.out.print("Nhập số lượng sách mượn: ");
                n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Sach s = new Sach();
            System.out.println("\nNhập thông tin sách thứ " + (dsSach.size() + 1) + ": ");
            s.nhap();
            dsSach.add(s);
        }
    }

    public void hienDSSach() {
        System.out.println("Thông tin sách: ");
        for (Sach sach : dsSach) {
            System.out.println(sach.toString());
        }
    }
}
