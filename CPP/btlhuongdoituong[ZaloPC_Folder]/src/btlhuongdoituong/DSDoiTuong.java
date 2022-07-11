/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlhuongdoituong;

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
public class DSDoiTuong implements Serializable {
     ArrayList<DoiTuong> dsDT = new ArrayList<>();
  DoiTuong a;
      public static final String FNAME = "DANHSACHDOiTUONG.dat";
          public void nhapDSDT() {
        Scanner input = new Scanner(System.in);
        int sl;
        do {
            System.out.print("\tNhập số lượng đối tượng cần quản lí: ");
            sl = input.nextInt();
            if(sl < 0){
                System.out.println("\tSố lượng đối tượng không hợp lệ, mời nhập lại.");
            }
        } while (sl < 0);
        for (int i = 0; i < sl; i++) {
            a = new DoiTuong();
            a.nhap();
            dsDT.add(a);
        }
    }

    public void ghiFileDSDoiTuong() throws IOException {
        File f = new File(FNAME);
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(dsDT);
        out.close();
        fout.close();
    }

    public void docFileDSDoiTuong() throws IOException, ClassNotFoundException {
        File f = new File(FNAME);
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
        dsDT.clear();
        dsDT = (ArrayList) in.readObject();
        in.close();
        fin.close();
    }

    public void hienDSDT() throws IOException, ClassNotFoundException {
        docFileDSDoiTuong();
        System.out.printf("%-15s%-20s%-15s%-15s\n", "Số CCCD", "Họ và tên",
                "Ngày sinh", "Giới tính");
        for (DoiTuong dt :
                dsDT) {
            System.out.print(dt.toString());
        }
    }
}
