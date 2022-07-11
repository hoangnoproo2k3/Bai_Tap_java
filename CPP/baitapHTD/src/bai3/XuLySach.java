package bai3;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class XuLySach {
    ArrayList<Sach> lsSach = new ArrayList<>();
    public Sach nhapSach(int loai) throws ParseException{
        Sach sach =null;
        if(loai ==1){
            System.out.println("Nhap sach giao khoa: ");
            sach = new SachGK();
            sach.nhapSachInfo();
            System.out.println("Nhap tinh trang sach: ");
            String tinhTrang= new Scanner(System.in).nextLine();
            if(tinhTrang.equals("moi"))
               ((SachGK) sach).setTinhTrang(true);
            else if(tinhTrang.equals("cu"))
               ((SachGK) sach).setTinhTrang(false);
        }else if(loai ==2){
            System.out.println("Nhap sach tham khao: ");
            SachTK sachTK = new SachTK();
            sachTK.nhapSachInfo();
            System.out.println("Nhap muc thue: ");
            sachTK.setThue(new Scanner(System.in).nextDouble());
            sach = sachTK;
        }
        return sach;
    }
    public void nhapDsSach() throws ParseException{
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
                    lsSach.add(nhapSach(loai));
                    break;
                case 2:
                    //them vao ds sach
                    
                case 3:
                    break;
                default:
                    break;
            }
        }while(loai!=3);
    }
    
    public void hienDSSach(){
        for (Sach sach : lsSach) {
            System.out.println("" + sach.toString());
        }
    }
    
    public void tongTienTheoLoai(){
        double tongGK =0, tongTK =0;
        for (Sach sach : lsSach) {
            //instanceof kiem tra doi tuong nay thuoc lop nao
            if(sach instanceof SachGK){
                tongGK += ((SachGK) sach).thanhTien();
            }else if(sach instanceof SachTK){
                tongTK += ((SachTK) sach).thanhTien();
            }
        }
        System.out.println("Tong thanh tien sgk: " + tongGK);
        System.out.println("Tong thanh tien stk: " + tongTK);
    }
    
    public double tbcSTK(){
        int dem=0;
        double tongTien =0;
        for (Sach sach : lsSach) {
            if(sach instanceof SachTK){
                dem++;
                tongTien +=((SachTK) sach).thanhTien();
            }
        }   
        double tbc=0;
        try {
           tbc= tongTien/dem;
        } catch (Exception e) { /*ngoại lệ*/
           //in ra exception
            System.out.println(""+ e.getMessage());
            
        }
       return tbc;
    }
    
    public ArrayList<Sach> timKiemSachTheoNXB(String nxb){
        ArrayList<Sach> kq = new ArrayList<>();
        for (Sach sach : lsSach) {
            if(sach.getNhaXB().equals(nxb)){
                kq.add(sach);
            }
        }
        return kq;
    }
    
}

