/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlhuongdoituong;

import static btlhuongdoituong.DSDoiTuong.FNAME;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VHC
 */
public class xulyVuAn implements Serializable {

    ArrayList<VuAn> dsDTVA = new ArrayList<>();
    VuAn a = new VuAn();
    DoiTuong dt = new DoiTuong();
    DSDoiTuong dsdt = new DSDoiTuong();
    public static final String FNAME = "DANHSACHDOiTUONGTRONGVUAN.dat";

    public void nhapDSDTVA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thong tin vu an: \n");
        a.nhap();
        dsDTVA.add(a);
        System.out.print("Nhap so doi tuong trong vu an: ");
        int chon;
        chon = sc.nextInt();
        for (int i = 0; i < chon; i++) {
            dt.nhap();
            

        }
    }

    public void ghiFileDSDoiTuongVA() throws IOException {
        File f = new File(FNAME);
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(dsDTVA);
        out.close();
        fout.close();
    }

    public void docFileDSDoiTuongVA() throws IOException, ClassNotFoundException {
        File f = new File(FNAME);
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
        dsDTVA.clear();
        dsDTVA = (ArrayList) in.readObject();
        in.close();
        fin.close();
    }

    public void hienDSDT() throws IOException, ClassNotFoundException {
        docFileDSDoiTuongVA();
        System.out.printf("%-15s%-20s%-15s%-15s\n", "Số CCCD", "Họ và tên",
                "Ngày sinh", "Giới tính");
        for (VuAn dt1
                : dsDTVA) {
            System.out.print(dt1.toString());
        }
    }
}
