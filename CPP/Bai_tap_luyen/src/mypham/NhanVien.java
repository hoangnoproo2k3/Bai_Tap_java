package mypham;

import java.io.Serializable;
import java.util.Scanner;


public class NhanVien extends Person implements Serializable{
    public String cmt;
    public int hsl;
    public long lcb=2000000 ;
    public long luongnv;


    public NhanVien( String ma, String ten, String diachi, String SDT,String cmt, int hsl, long luongnv) {
        super(ma, ten, diachi, SDT);
        this.cmt = cmt;
        this.hsl = hsl;
        this.luongnv = luongnv;
    }

    
    

    public NhanVien() {
    }

    public float getLuongnv() {
        return luongnv;
    }

    public float getLcb() {
        return lcb;
    }

    public String getCmt() {
        return cmt;
    }

    public int getHsl() {
        return hsl;
    }

    public void setLcb(long lcb) {
        this.lcb =  lcb;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public void setHsl(int hsl) {
        this.hsl = hsl;
    }

    public void setLuongnv(long luongnv) {
        this.luongnv = luongnv;
    }

    public void nhapnv()
    {
        Scanner sc= new Scanner(System.in);
        super.nhapps();
        System.out.print("Nhập số CCCD: ");
        cmt= sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        hsl= sc.nextInt(); 
        luongnv=hsl*lcb;
    }
    public void table()
    {
        System.out.printf("%20s %20s %20s %20s", "Mã", "Tên","Địa chỉ", "SDT");
        System.out.printf("%18s %18s %18s", "CMT","HSL", "Lương\n");
        
    }
    public void hiennv()
    {
        super.hienps();
        System.out.printf("%20s", cmt);
        System.out.printf("%20d", hsl);
        System.out.printf("%20s", luongnv);
    }
}

