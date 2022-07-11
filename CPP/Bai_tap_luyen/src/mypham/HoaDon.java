package mypham;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon implements Serializable{
    String mahd,nv,nl,kh;

    public HoaDon(String mahd, String nv, String nl, String kh) {
        this.mahd = mahd;
        this.nv = nv;
        this.nl = nl;
        this.kh = kh;
    }

    public HoaDon() {
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getNv() {
        return nv;
    }

    public void setNv(String nv) {
        this.nv = nv;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }
    public void nhap1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hóa đơn: ");
        mahd = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        nv = sc.nextLine();
        System.out.print("Nhập tên khách hàng: ");
        kh = sc.nextLine();
        System.out.print("Nhập ngày lập: ");
        nl = sc.nextLine();
        nhapmp();
    }
    ArrayList<SanPham> lstMP = new ArrayList<SanPham>(); 
    public void nhapmp()
    {
        Scanner sc = new Scanner (System.in);
        int n;
        do {
            System.out.print("\nNhập số mỹ phẩm: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; ++i) {
            SanPham x = new SanPham();
            System.out.printf("\nNhập sản phẩm thứ %d", i + 1 );
            System.out.println("");
            x.nhapsanpham();
            this.lstMP.add(x);
        }
    }
    public void tble()
    {
        System.out.printf("%20s%20s%20s%20s%20s%20s\n","Mã MP","Tên MP","Xuất Xứ","Số Lượng","Đơn giá","Thành Tiền");
        
    }
    public void hien()
    {
        System.out.println("==========================================================================================================================================");
        System.out.printf("Mã Hóa Đơn: %10s",mahd);
        System.out.println("");
        System.out.printf("Nhân Viên: %10s",nv);
        System.out.println("");
        System.out.printf("Khách Hàng: %10s",kh);
        System.out.println("");
        System.out.printf("Ngày Lập  : %10s",nl);
        System.out.println("");
        tble();
        for(SanPham x: lstMP)
        {
            x.hiensanpham();
            System.out.println("");
        }
        long tg=0;
        for(SanPham x: lstMP)
        {
            tg+=x.Thtien;
        }
        System.out.print("Tổng tiền hóa đơn là: "+tg);
        System.out.println("");
    }
    public long tongtien()
    {
        long tg=0;
        for(SanPham x: lstMP)
        {
            tg+=x.Thtien;
        }
        return tg;
    }
}
