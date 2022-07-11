package bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class danhSach {
    int sodt;
    ArrayList<doanthang> lstDT;
    public doanthang testdt(){
        doanthang dt =new doanthang();
        System.out.println("Nhập vào điểm đầu: ");
        dt.setA();
        System.out.println("Nhập vào điểm cuối: ");
        dt.cuoi();
        return dt;
    }
    public void nhapdt(){
        System.out.println(" Nhập vào số đường thẳng: ");
         sodt= new Scanner(System.in).nextInt();
         lstDT= new ArrayList<>();
        for(int i=0;i<sodt;i++){
            System.out.println("Đoạn thẳng thứ "+(i+1)+" ");
            doanthang x= new doanthang();
            lstDT.add(testdt());
        }
    }
    public void hiends(){
        for(doanthang dthang: lstDT){
            System.out.println(" "+ dthang.toString());
        }
    }
    public double maxlength(){
        double max=lstDT.get(0).doDai();
        for(doanthang dthang : lstDT){
            if(dthang.doDai()>max){
                max=dthang.doDai();
            }
        }
        return max;
    }
    public double tongdodai(){
        double tong = 0;
        for(doanthang dthang:lstDT){
            tong +=dthang.doDai();
        }
        return tong;
    }
}
