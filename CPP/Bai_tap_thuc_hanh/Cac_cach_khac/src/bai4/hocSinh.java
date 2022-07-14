package bai4;

import java.util.Scanner;

public class hocSinh {
    public String id;
    public String name;
    public String lop;
    public int so_buoi;
    public int tien;
    public void nhap(){
        System.out.print("Nhập vào ID: ");
        id=new Scanner(System.in).next();
        System.out.print("Nhập tên: ");
        name= new Scanner(System.in).nextLine();
        System.out.print("Nhập vào lớp: ");
        lop=new Scanner(System.in).next();
        System.out.print("Nhập vào số buổi ăn: ");
        so_buoi=new Scanner(System.in).nextInt();
        tien=so_buoi*30000;
    }
    public void hien(){
        System.out.println(id+"    "+name+"\t\t\t"+lop+"\t \t"+so_buoi+"\t  \t"+tien);
    }
}
