package bai3;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maithuyha
 */
public class QuanLySach {
    public static void main(String[] args) throws ParseException {
        XuLySach xls = new XuLySach();
        System.out.println("Nhap danh sach sach: ");
        xls.nhapDsSach();
        System.out.println("Hien ds sach: ");
        xls.hienDSSach();
        System.out.println("Tong tien theo loai: " );
        xls.tongTienTheoLoai();
        System.out.println("TBC sach tk: " + xls.tbcSTK());
        System.out.println("Nhap ten nxb can tim: ");
        String nxb = new Scanner(System.in).nextLine();
        ArrayList<Sach> kq = xls.timKiemSachTheoNXB(nxb);
        if(kq!=null){
            System.out.println("Danh sach sach cua nha xuat ban " + nxb);
            for (Sach sach : kq) {
                System.out.println(""+ sach);
            }
        }else{
            System.out.println("k tim thay sach nao cua nha xuat ban " + nxb);
        }
    }
}
