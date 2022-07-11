package baitap3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhSachlop {
    ArrayList<danhSach> dslop= new ArrayList<>();
    public void nhapDsLop(){
        
        System.out.print("Nhap vao so luong lop: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào lớp thứ "+(i+1));
            danhSach x= new danhSach();
            x.Nhapds();
            dslop.add(x);

           
        }
    }
    public void hienDslop() {
        for (danhSach ds: dslop) {
            ds.hienDs();
        }
    }
}
