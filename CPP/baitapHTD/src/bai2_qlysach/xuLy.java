package bai2_qlysach;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class xuLy {
    public ArrayList<sach> dsSach= new ArrayList<>();
    public void nhapDsSach() {
        int loai;
        do{
            System.out.println("Chon loai sach: ");
            System.out.println("1. Sach giao khoa");
            System.out.println("2. Sach tham khao");
            System.out.println("3. ket thuc nhap");
            System.out.println("Hay chon 1-3: ");
            loai = new Scanner(System.in).nextInt();
            switch(loai){
                case 1:
                case 2:
                    dsSach.add(nhapSach(loai));
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }while(loai!=3);
    }
    public sach nhapSach(int loai) {
        sach Sach=null;
        if(loai ==1){
            System.out.println("Nhap sach giao khoa: ");
            Sach = new sachgk();
            Sach.nhap();
            System.out.println("Nhap tinh trang sach: ");
            String tinhTrang= new Scanner(System.in).nextLine();
            if(tinhTrang.equals("moi"))
               ((sachgk) Sach).setTinhTrang(true);
            else if(tinhTrang.equals("cu"))
               ((sachgk) Sach).setTinhTrang(false);
        }else if(loai ==2){
            System.out.println("Nhap sach tham khao: ");
            sachtk sachTK = new sachtk();
            sachTK.nhap();
            System.out.println("Nhap muc thue: ");
            sachTK.setThue(new Scanner(System.in).nextDouble());
            Sach = sachTK;
        }
        return Sach;
    }
    public void hienDSSach(){
        for (sach Sach : dsSach) {
            System.out.println("" + Sach.toString());
        }
    }
    public void tongTienTheoLoai(){
        System.out.println("hi");
        double tongGK =0, tongTK =0;
        for (sach Sach : dsSach) {
            if(Sach instanceof sachgk){
                //thuc hien tinh tong tien sgk
                tongGK += ((sachgk) Sach).thanhTien();
            }else if(Sach instanceof sachtk){
                //thuc hien tinh tong tien stk
                tongTK += ((sachgk) Sach).thanhTien();
            }
        }
        System.out.println("Tong thanh tien sgk: " + tongGK);
        System.out.println("Tong thanh tien stk: " + tongTK);
    }
    
    public double tbcSTK(){
        int dem=0;
        double tongTien =0;
        for (sach s : dsSach) {
            if(s instanceof sach){
                dem++;
                tongTien +=((sachtk) s).thanhTien();
            }
        }   
        double tbc=0;
        try {
           tbc= tongTien/dem;
        } catch (Exception e) {
            System.out.println(""+ e.getMessage());
            
        }
       return tbc;
    }
    
    public ArrayList<sach> timKiemNXB(){
        String nxb= new Scanner(System.in).nextLine();
        
        ArrayList<sach> kq = new ArrayList<>();
        for (sach s : dsSach) {
            if(s.getNhaXB().equals(nxb)){
                //add doi tuong Sach vao ls kq
                kq.add(s);
            }
        }
        return kq;
    }
}
