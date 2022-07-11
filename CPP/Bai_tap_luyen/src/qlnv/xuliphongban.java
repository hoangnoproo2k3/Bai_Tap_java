package qlnv;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class xuliphongban {
    phongban x= new phongban();
    xulynhanvien xlnv = new xulynhanvien();
    public phongban nhappb(){
        System.out.println("Nhập mã phòng: ");
        x.setIdPhong(new Scanner(System.in).next());
        System.out.println("Nhập tên phòng: ");
        x.setNamePhong(new Scanner(System.in).nextLine());
        System.out.println("Nhập danh sách nhân viên phòng ban:");
        
        x.setDsnv(xlnv.nhapDs());
        return x;
    }
    public void hienpb(){
        System.out.println(" "+x.toString());
        System.out.println(" danh sách nhân viên: ");
        xlnv.hienDs();
    }
}


