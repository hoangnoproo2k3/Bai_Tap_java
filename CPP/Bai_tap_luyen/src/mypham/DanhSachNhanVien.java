
package mypham;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class DanhSachNhanVien {
    int n;
    ArrayList<NhanVien> dsnv= new ArrayList<NhanVien>();
    public void nhap() {
       
        NhanVien x = new NhanVien();
        x.nhapnv();
        this.dsnv.add(x);
    }
    public void nhapdsnv()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.printf("Nhập Nhân Viên Thứ %3d", i+1);
            System.out.println("");
            NhanVien nv= new NhanVien();
            nv.nhapnv();
            dsnv.add(nv);
        }
    }
    public void table()
    {
        System.out.printf("%20s","Mã Nhân viên" );
         System.out.printf("%20s", "Tên Nhân viên ");
         System.out.printf("%20s", "Địa chỉ ");
         System.out.printf("%20s", "Số điện thoại");
         System.out.printf("%20s", "Số CCCD");
         System.out.printf("%20s", "HSL");
         System.out.printf("%20s", "Lương");
         System.out.println();
    }
    public void hiendsnv()
    {
        table();
        for(NhanVien c: dsnv)
        {
            c.hiennv();
             System.out.println("");
        }
    }
    public void Xoa1NV() {
        Scanner SC = new Scanner(System.in);
        System.out.print("\nNhập mã nhân viên cần xoá: ");
        String xString = SC.nextLine();
        for (int i = 0; i < dsnv.size(); ++i) {
            if (dsnv.get(i).getMa().equals(xString)) {
                this.dsnv.remove(i);
                System.out.println("xoá thành công!!!");
            }

        }
        hiendsnv();
    }

    public void Tim1NV() {
        Scanner SC = new Scanner(System.in);
        System.out.print("\nNhập mã nhân viên cần tìm: ");
        String xString = SC.nextLine();
        for (int i = 0; i < dsnv.size(); ++i) {

            if (dsnv.get(i).getMa().equals(xString)) {
                table();
                this.dsnv.get(i).hiennv();
            }
        }

    }

    public void SapXepMa() {
        Collections.sort(this.dsnv, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return (o1.getMa().compareTo(o2.getMa()));
            }
        });
        hiendsnv();
    }
    public void SapXepLuong()
    {
        Collections.sort(dsnv, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                if (nv1.luongnv < nv2.luongnv) {
                    return 1;
                } else {
                    if (nv1.luongnv == nv2.luongnv) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
        hiendsnv();
        
    }
    public void ghifileNV() throws FileNotFoundException, IOException
    {
        File f = new File("NhanVien.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(dsnv);
        objout.close();
        fout.close();
    }
    public void docfileNV() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        File f = new File("NhanVien.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        dsnv = new ArrayList<NhanVien>();
        dsnv=(ArrayList)objin.readObject();
        hiendsnv();
        objin.close();
        fin.close();
    }
    public void nhapnvbv(){
        Baove bv = new Baove();
        bv.nhapBaove();
        dsnv.add(bv);
    }
    public void hiennvbv(){
        table();
        for(NhanVien i: dsnv){
            i.hiennv();
            System.out.println();
        }
    }
}

