package bai7;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author AS
 */
public class danhSach {
    static Scanner in = new Scanner(System.in);
    int soDT;
    ArrayList<doanThang> lstSV;
    public doanThang dtInfo(){
        doanThang dt = new doanThang();
        System.out.println("Diem dau: ");
        dt.setA();
        System.out.println("Diem cuoi: ");
        dt.setB();
        return dt;
    }
    public void nhapsodt(){
        System.out.print("Nhap so doan thang: ");
        soDT = in.nextInt();
        lstSV = new ArrayList<doanThang>();
        for (int i=0; i<soDT; i++) {
            System.out.println("\nDoan thang thu "+(i+1)+":");
            doanThang x= new doanThang();
            lstSV.add(dtInfo());
        }
    }
    
    @SuppressWarnings("empty-statement")
    public void hienDSDT() {     
        
       for (doanThang doanthang: lstSV) 
        {
            System.out.println("" + doanthang.toString());
        };    
    }
    public void maxLength(){
        double max = lstSV.get(0).doDai();
        int vitri;
        for (doanThang doanthang: lstSV) {
            if (doanthang.doDai()>max) {
                max = doanthang.doDai();
            }
        }
        System.out.println("Phần tử lớn nhất = " + max);
    }
    public double tongDoDai(){
        double tong=0;
        for (doanThang doanthang: lstSV) {
            tong+=doanthang.doDai();
        }
        return tong;
    }
}