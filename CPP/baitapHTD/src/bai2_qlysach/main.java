package bai2_qlysach;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class main {
    public static void main(String[] args)  {
        xuLy x = new xuLy();
        x.nhapDsSach();
        x.hienDSSach();
        x.tongTienTheoLoai();
        System.out.println("TBC sach tk: " + x.tbcSTK());
        System.out.println("Nhap ten nxb can tim: ");
        String nxb = new Scanner(System.in).nextLine();
        ArrayList<sach> kq = x.timKiemNXB();
        if(kq!=null){
            System.out.println("Danh sach sach cua nha xuat ban " + nxb);
            for (sach s : kq) {
                System.out.println(""+ s);
            }
        }else{
            System.out.println("k tim thay sach nao cua nha xuat ban " + nxb);
        }
    }
    
}
