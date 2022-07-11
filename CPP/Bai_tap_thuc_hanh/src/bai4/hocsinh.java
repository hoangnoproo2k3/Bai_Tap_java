package bai4;

import java.util.Scanner;

public class hocsinh {
   protected int id;
   protected String name;
   protected String lop;
   protected int so_buoi_an;
   protected int tien;
   public void nhap(){
       Scanner x= new Scanner(System.in);
       System.out.print("Nhập vào ID: ");
       id=x.nextInt(); x.nextLine();
       System.out.print("Nhập vào tên sinh viên: ");
       name=x.nextLine();
       System.out.print("Nhập vào lớp: ");
       lop=x.next();
       System.out.print("Nhập vào só buổi ăn: ");
       so_buoi_an=x.nextInt();    
       tien=so_buoi_an*30000;
   }
   public void hien(){
       System.out.printf(id+"\t\t"+name+"\t\t"+lop+"\t\t"+so_buoi_an+"\t\t"+tien);
   }
    
}