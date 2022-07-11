package qlnv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class xulynhanvien {
    public nhanvien nhap(){
        nhanvien x= new nhanvien();
        System.out.println("Nhập vào id: ");
        x.setId(new Scanner(System.in).next());
        System.out.println(" Nhập vào tên nhân viên: ");
        x.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập giới tính: ");
        x.setGender(new Scanner(System.in).next());
        System.out.println("NHập vào tuổi: ");
        x.setAge(new Scanner(System.in).nextInt());
        System.out.println("Nhập vào hệ số lương: ");
        x.setHsl(new Scanner(System.in).nextDouble());
        System.out.println("Nhập vào chức vụ: ");
        x.setPosition(new Scanner(System.in).nextLine());
        return x;
    }
    public void hien(nhanvien x){
        System.out.println(" "+x.toString());
    }
    //Nhập danh sách nhân viên
    public static ArrayList<nhanvien> lstnv= new ArrayList<>();
    public ArrayList<nhanvien> nhapDs(){
        
        System.out.println("Nhập vào số nhân viên: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            nhanvien nv= nhap();
            lstnv.add(nv);
        }
        return lstnv;
    }
    public void hienDs(){
        for(nhanvien svien:lstnv){
            hien(svien);
        }
    }
    public void timkiem(){
        System.out.println("Nhập vào mã nhân viên: ");
        String x= new Scanner(System.in).next();
        for(nhanvien nvien: lstnv){
            if(nvien.getId().equals(x))
                hien(nvien);
        }
    }

    
}
