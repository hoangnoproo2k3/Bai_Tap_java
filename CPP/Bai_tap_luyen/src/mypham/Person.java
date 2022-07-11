package mypham;

import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable{
    private String ma;
    private String ten;
    private String diachi;
    private String SDT;
   
    public Person(String ma, String ten, String diachi, String SDT) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.SDT = SDT;
    }

    
    public  Person()
    {
        
    }
    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    public void nhapps()
    {
       Scanner sc= new Scanner(System.in);
        System.out.print("Nhập mã : ");
        ma=sc.nextLine();
        System.out.print("Nhập tên : ");
        ten=sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diachi=sc.nextLine();
        System.out.print("Nhập SĐT: ");
        SDT=sc.nextLine();
    }
    public void hienps()
    {
        
        System.out.printf("%20s",ma);
        System.out.printf("%20s",ten);
        System.out.printf("%20s",diachi);
        System.out.printf("%20s",SDT);
    }
            
    
}