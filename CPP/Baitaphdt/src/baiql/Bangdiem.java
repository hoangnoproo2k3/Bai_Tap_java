package baiql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class Bangdiem {
    private String Monhoc;
    private String Giaovien;
    private String HK;
    private String Namhoc;
    private String Ngaythi;
    ArrayList<Sinhvien> lstSV;

    public void NhapBD ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap mon hoc: ");
        Monhoc = sc.nextLine();
        System.out.print("\n Nhap ten giao vien: ");
        Giaovien = sc.nextLine();
        System.out.print("\n Nhap hoc ki: ");
        HK = sc.nextLine();
        System.out.print("\n Nhap nam hoc: ");
        Namhoc = sc.nextLine();
        System.out.print("\n Nhap ngay thi: ");
        Ngaythi = sc.nextLine();
        int n;
        System.out.print("\n Nhap so sinh vien cua bang diem: ");
        n = sc.nextInt();
        lstSV = new ArrayList<Sinhvien>();
        for(int i=0;i<n;i++)
        {
            Sinhvien x = new Sinhvien();
            x.Nhap ();
            lstSV.add(x);
        }
    }
    public void XuatBD()
    {
        System.out.printf("\n Monhoc: %s", Monhoc);
        System.out.printf("     Giao vien: %s", Giaovien);
        System.out.printf("\n Hoc ki: %s", HK);
        System.out.printf("     Nam hoc: %s", Namhoc);
        System.out.printf("\n Ngay thi: %s", Ngaythi);
        for(Sinhvien x: lstSV)
            x.Xuat();
        System.out.print("\n----------------\n");
    }
    public void Sinhvienhoclai()
    {
        System.out.print("\n DANH SACH SINH VIEN HOC LAI \n");
        for(Sinhvien x: lstSV)
        {
            if(x.Diemhocphan() < 4)
                System.out.print(x.getTen());
        }
    }
    public void LuuDSSVfile() throws IOException {
        File f = new File("danhsachsinhvien.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(lstSV);
        out.close();
        fout.close();
    }
    public void DocDSSVfile() throws IOException, ClassNotFoundException {
        File f = new File("danhsachsinhvien.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
        lstSV = new ArrayList<Sinhvien>();
        lstSV = (ArrayList)in.readObject();
        in.close();
        fin.close();
    }
    public void SapxepDSSV()
    {
        Collections.sort(lstSV, new Sinhviencomparator());
        XuatBD(); // in lai bang diem ma DSSV vua sap xep
    }
}


