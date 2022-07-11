package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhSachSv {
    ArrayList<sinhVien> lstSv;
    int n;
    
    public sinhVien infor(){
        sinhVien sv= new sinhVien();
        System.out.println("Nhập vào mã sinh viên: ");
        sv.setId( new Scanner(System.in).nextInt());
        System.out.println("Nhập vào họ tên sv: ");
        sv.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập vào địa chỉ: ");
        sv.setAddress(new Scanner(System.in).nextLine());
        do{
            System.out.println("Nhập vào số điện thoại: ");
            sv.setPhone(new Scanner(System.in).next());
        }while(sv.getPhone().length()!=7);
        return sv;
    }
    
    public void nhapds(){
        System.out.println("Nhập vào số sinh viên: ");
        n= new Scanner(System.in).nextInt();
        lstSv = new ArrayList<sinhVien>();
        for(int i=0;i<n;i++){
            System.out.println("Nhập thông tin sinh viên thứ "+(i+1)+"");
            sinhVien x= new sinhVien();
            lstSv.add(infor());
        }
    }
    public void hiends(){
          Collections.sort(lstSv,new sapxxep());
        for(sinhVien svien: lstSv){
            
            System.out.println(" "+svien.toString());
        }
        
        
    }

    
}
