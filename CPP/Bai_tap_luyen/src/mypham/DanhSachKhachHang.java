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


public class DanhSachKhachHang {
    int n;
    ArrayList<KhachHang> dskh=new ArrayList<>();
    public void nhap() {
       
        KhachHang x = new KhachHang();
        x.nhapkh();
        this.dskh.add(x);
    }
    public void nhaphskh()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số Khách hàng: ");
        n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.printf("Nhập Khách Hàng Thứ %3d", i+1);
            System.out.println("");
            KhachHang kh= new KhachHang();
            kh.nhapkh();
            dskh.add(kh);
        }
    }
    public void table()
    {
         System.out.printf("%20s","Mã Khách hàng" );
         System.out.printf("%20s", "Tên Khách ");
         System.out.printf("%20s", "Địa chỉ ");
         System.out.printf("%20s", "Số điện thoại");
         System.out.printf("%20s", "Mã thuế");
         System.out.println();
    }
    public void hiendskh()
    {
        table();
         for (KhachHang y: dskh)
         {
             y.hienkh();
             System.out.println("");
         }
    }
    public void Xoa1KH() {
        Scanner SC = new Scanner(System.in);
        System.out.print("\nNhập mã khách hàng cần xoá: ");
        String xString = SC.nextLine();
        for (int i = 0; i < dskh.size(); ++i) {
            if (dskh.get(i).getMa().equals(xString)) {
                this.dskh.remove(i);
                System.out.println("xoá thành công!!!");
            }

        }
        hiendskh();
    }

    public void Tim1KH() {
        Scanner SC = new Scanner(System.in);
        System.out.print("\nNhập mã khách hàng cần tìm: ");
        String xString = SC.nextLine();
        for (int i = 0; i < dskh.size(); ++i) {

            if (dskh.get(i).getMa().equals(xString)) {
                table();
                this.dskh.get(i).hienkh();
            }
        }

    }

    public void SapXepMaKH() {
        Collections.sort(this.dskh, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return (o1.getMa().compareTo(o2.getMa()));
            }
        });
        hiendskh();
    }
    public void ghifileKH() throws FileNotFoundException, IOException
    {
        File f = new File("KhachHang.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(dskh);
        objout.close();
        fout.close();
    }
    public void docfileKH() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("KhachHang.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        dskh = new ArrayList<KhachHang>();
        dskh=(ArrayList)objin.readObject();
        hiendskh();
        objin.close();
        fin.close();
    }
    public void Sua()
    {
        
    }
}

