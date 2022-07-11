package bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class quanlytulanh {

    ArrayList<tulanh> lst = new ArrayList<>();

    int n;

    public void nhapds() {

        System.out.print("Nhập số tủ lạnh: ");
        n = new Scanner(System.in).nextInt();
        lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tulanh x = new tulanh();
            x.nhap();
            lst.add(x);
        }
    }

    public void hiends() {
        for (tulanh tl : lst) {

            tl.hien();
        }
    }

    public void lietke() {
        System.out.print("Nhập tên hãng: ");
        String x = new Scanner(System.in).nextLine();
        System.out.println("Các tủ lạnh cùng hãng: ");
        for (tulanh tl : lst) {
            if (tl.getHangsx().equals(x)) {
                tl.hien();
            }
        }
    }

    public void tongTien() {
        float tong = 0;
        for (tulanh tl : lst) {
            tong += tl.getDongia();
        }
        System.out.println("Tồng tiền: " + tong);
    }

    public void xuly() {
        System.out.println("Tủ lạnh có dung tích trên 200l");
        for (tulanh tl : lst) {
            if (tl.getDungTich() > 200) {
                tl.hien();
            }
        }

    }

    public void hiensx() {
        Collections.sort(lst, new sapxxep());
        System.out.println("Sắp xếp giảm dần theo số lượng");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println("Tu lanh " + (i + 1));
            lst.get(i).hien();
        }
    }
}
