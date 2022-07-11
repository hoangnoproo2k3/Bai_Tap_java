package baitap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhsach {
    Scanner in= new Scanner(System.in);
    int sodt;
    ArrayList<doanthang> lstDT;
    public doanthang testdt(){
        doanthang dt= new doanthang();
        System.out.println("diem dau: ");
        dt.setA();
        System.out.println("diem cuoi: ");
        dt.setB();
        return dt;  
    }
    public void nhapsdt(){
        System.out.println("Số đoạn thẳng là: ");
        sodt=in.nextInt();
        lstDT= new ArrayList<doanthang>();
        for(int i=0;i<sodt;i++){
            System.out.println("Đoạn thẳng thứ "+(i+1)+"");
            doanthang x=new doanthang();
            lstDT.add(testdt());
        }
    }
    public void hien(){
        for(doanthang dthang: lstDT){
            System.out.println(""+dthang.toString());
        }
    }
    public void maxLength(){
        double max= lstDT.get(0).doDai();
        for(doanthang dthang: lstDT){
            if(dthang.doDai()>max){
                max=dthang.doDai();
            }
        }
        System.out.println("Độ dài của đoạn thẳng lớn nhất là: "+max);
    }
    public double tongdodai(){
        double tong=0;
        for(doanthang dthang: lstDT){
            tong+=dthang.doDai();
        }
        return tong;
    }
}
