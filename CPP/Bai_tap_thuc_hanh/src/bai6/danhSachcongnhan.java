package bai6;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhSachcongnhan {
    congNhan ds[];
    int n;
    public Scanner x=new Scanner(System.in);
    public danhSachcongnhan(){
        
        do{
            System.out.print("Nhập vào số công nhân: ");
            n=x.nextInt();
            ds=new congNhan[n];
            if(n<0||n>20){
                System.out.println("Số nhân viên không hợp lệ!");
            }
        }while(n<=0||n>20);
    }
    public void nhapDs(){
        for(int i=0;i<n;i++){
            ds[i]=new congNhan();
            ds[i].nhap();
        }
    }
    public void hienDs(){
        for(int i=0;i<n;i++){
            ds[i].hien();
        }
    }
    public void disPlay(){
        System.out.print("Nhập x: "); float b=x.nextFloat();
        System.out.println("Danh sách có lương lớn hơn x");
        for(int i=0;i<n;i++){
            if(ds[i].luong>b){
                ds[i].hien();
            }
        }
    }
}
