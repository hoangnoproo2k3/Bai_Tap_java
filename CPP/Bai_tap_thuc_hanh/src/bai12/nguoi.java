package bai12;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class nguoi {
    private String ten;
    private String gtinh;
    public nguoi() {
    }
    
    public void nhap(){
        System.out.println("Nhập vào họ tên: ");
        ten= new Scanner(System.in).nextLine();
        System.out.println("Nhập vào giới tính: ");
        gtinh= new Scanner(System.in).next();
    }
    public void hien(){
        System.out.println("Tên: "+this.ten);
        System.out.println("Giới tính: "+this.gtinh);
    }
}
