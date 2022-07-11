package bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class xuLyXe {
    ArrayList<chuyenXe> dschuyenxe= new ArrayList<>();
    public chuyenXe nhap(int loai){
        chuyenXe chxe= null;
        if(loai==1){
            System.out.println("Nội Thành");
            chxe= new noiThanh();
            chxe.nhapinfo();
        }
        if(loai==2){
            System.out.println("Ngoại Thành");
            chxe = new ngoaiThanh();
            chxe.nhapinfo();
        }
        return chxe;
    }
    public void nhapds(){
        int loai;
        do{
            System.out.println("Nhập các chuyến xe");
            System.out.println("1. CÁC CHUYẾN XE NỘI THÀNH");
            System.out.println("2. CÁC CHUYẾN XE NGOẠI THÀNH");
            System.out.println("0. Kết thúc");
            loai= new Scanner(System.in).nextInt();
            switch(loai){
                case 1:
//                    continue;
                case 2:
                    dschuyenxe.add(nhap(loai));
                default: 
                    break;
            }
        }while(loai!=0);
    }
    public void hiends(){
        for(chuyenXe chxe: dschuyenxe){
            System.out.println(""+ chxe.toString());
        }
    }
    public void tongtientheoloai(){
        float Noi=0, Ngoai=0;
        for(chuyenXe x: dschuyenxe){
            if(x instanceof noiThanh){
                Noi+=((noiThanh)x).getDoanhthu();
            }
            else if(x instanceof ngoaiThanh){
                Ngoai+=((ngoaiThanh)x).getDoanhthu();
            }
        }
        System.out.println("Tổng doanh thu Nội Thành: "+Noi);
        System.out.println("Tổng doanh thu Ngoại Thành: "+Ngoai);
    }
}
