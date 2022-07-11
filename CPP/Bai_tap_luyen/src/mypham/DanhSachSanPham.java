package mypham;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSanPham {
    int n;
    ArrayList<SanPham> ds= new ArrayList<SanPham>();
    public void nhap() {
       
        SanPham x = new SanPham();
        x.nhapsanpham();
        this.ds.add(x);
    }
     public void nhapds()
     {
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhập số sản phẩm: ");
         n= sc.nextInt();
         for (int i=0; i<n; i++)
         {
             System.out.printf("Nhập Sản Phẩm Thứ %3d", i+1);
            System.out.println("");
             SanPham sp=new SanPham();
             sp.nhapsanpham();
             ds.add(sp);
         }
     }
     public void table()
     {
         System.out.printf("%20s","Mã" );
         System.out.printf("%20s", "Tên Sản Phẩm");
         System.out.printf("%20s", "Xuất xứ");
         System.out.printf("%20s", "Số Lượng");
         System.out.printf("%20s", "Đơn giá ");
         System.out.printf("%20s", "Thành Tiền ");
         System.out.println();
     }
     public void hiends()
     {
         table();
         for(SanPham x: ds)
         {
             x.hiensanpham();
             System.out.println();
         }
     }
     public void tongtien()
     {
         int Tongtien = 0;
         for(SanPham x: ds)
         {
             Tongtien+= x.Thtien; 
         }
         System.out.printf("Tổng tiền là: %20d",Tongtien);
         
     }
     public void Xoa1SP() {
        Scanner SC = new Scanner(System.in);
        System.out.print("\nNhập mã sản phẩm cần xoá: ");
        String xString = SC.nextLine();
        for (int i = 0; i < ds.size(); ++i) {
            if (ds.get(i).getMamp().equals(xString)) {
                this.ds.remove(i);
                System.out.println("Xoá thành công!!!");
            }

        }
        hiends();
    }

    public void Tim1SP() {
        Scanner SC = new Scanner(System.in);
        System.out.print("\nNhập mã sản phẩm cần tìm: ");
        String xString = SC.nextLine();
        for (int i = 0; i < ds.size(); ++i) {

            if (ds.get(i).getMamp().equals(xString)) {
                table();
                this.ds.get(i).hiensanpham();
            }
        }

    }

    public void SapXepMa() {
        Collections.sort(this.ds, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return (o1.getMamp().compareTo(o2.getMamp()));
            }
        });
        hiends();
    }
    public void SapXepthanhtienSP()
    {
        Collections.sort(ds, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham sp1, SanPham sp2) {
                if (sp1.Thtien < sp2.Thtien) {
                    return 1;
                } else {
                    if (sp1.Thtien == sp2.Thtien) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        hiends();
        
    }
    public void ghifileSP() throws FileNotFoundException, IOException
    {
        File f = new File("SanPham.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(ds);
        objout.close();
        fout.close();
    }
    public void docfileSP() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("SanPham.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        ds = new ArrayList<SanPham>();
        ds=(ArrayList)objin.readObject();
        hiends();
        objin.close();
        fin.close();
    }
}

