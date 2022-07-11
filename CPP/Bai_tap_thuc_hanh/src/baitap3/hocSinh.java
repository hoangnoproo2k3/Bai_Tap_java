package baitap3;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class hocSinh extends nguoi{
    private String lop;
    public void nhap(){
        System.out.println("Nhập vào tên lớp: ");
        lop= new Scanner(System.in).nextLine();
        super.nhap();
        
    }
    public void hien(){
        super.hien();
        System.out.println("Tên lớp: "+this.lop);
    }
}
