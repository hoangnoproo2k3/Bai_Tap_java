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

public class DanhSachHoaDon {
    ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
    public void nhap()
    {
        Scanner sc = new Scanner (System.in);
        int n;
        do {
            System.out.print("\nNhập số hóa đơn : ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; ++i) {
            HoaDon x = new HoaDon();
            System.out.printf("\nNhập hóa đơn thứ %d", i + 1 );
            System.out.println("");
            x.nhap1();
            this.dshd.add(x);
        }
    }
    public void hien()
    {
        for(HoaDon x: dshd)
        {
            x.hien();
        }
    }
    public void timhoadon()
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("\nNhập mã Hóa Đơn cần tìm: ");
        String xString = SC.nextLine();
        for (int i = 0; i < dshd.size(); ++i) {

            if (dshd.get(i).getMahd().equals(xString)) {
                this.dshd.get(i).hien();
            }
        }
    }
    public void XoaHD()
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("\nNhập mã Hóa Đơn cần xóa: ");
        String xString = SC.nextLine();
        for (int i = 0; i < dshd.size(); ++i) {

            if (dshd.get(i).getMahd().equals(xString)) {
                this.dshd.remove(i);
                System.out.println("xoá thành công!!!");
            }
        }
    }
    public void locHD()
    {
        System.out.print("\t\t\t DANH SÁCH HÓA ĐƠN TRÊN 2tr \n");
        for (int i = 0; i < dshd.size(); ++i) {

            if (dshd.get(i).tongtien()>2000000) {
                this.dshd.get(i).hien();
            }
        }
    }
    public void xapxepHD()
    {
        Collections.sort(dshd, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon hd1, HoaDon hd2) {
                if (hd1.tongtien() < hd2.tongtien()) {
                    return 1;
                } else {
                    if (hd1.tongtien() == hd2.hashCode()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        hien();
    }
    public void tongtien()
    {
        long tt=0;
        for(HoaDon x: dshd)
        {
            tt += x.tongtien();
        }
        System.out.println("\nTổng tiền tất cả các hóa đơn: "+ tt);
    }
    public void them()
    {
        
            HoaDon x = new HoaDon();
            System.out.println("");
            x.nhap1();
            this.dshd.add(x);
    }
    public void ghifileHD() throws FileNotFoundException, IOException
    {
        File f = new File("HoaDon.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(dshd);
        objout.close();
        fout.close();
    }
    public void docfileHD() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("HoaDon.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        dshd = new ArrayList<HoaDon>();
        dshd=(ArrayList)objin.readObject();
        hien();
        objin.close();
        fin.close();
    }
}

