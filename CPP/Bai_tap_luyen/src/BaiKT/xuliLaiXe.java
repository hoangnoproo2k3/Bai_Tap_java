/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiKT;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class xuliLaiXe {

    ArrayList<LaiXe> lsds = new ArrayList<>();
    public static final String FNAME = "LAIXE.DAT";

    public void nhapDS() throws IOException {
        System.out.print("Nhap so luong lai xe : ");
        int soluong = new Scanner(System.in).nextInt();
        for (int i = 0; i < soluong; i++) {
            LaiXe laixe = new LaiXe();
            laixe.nhap();
            ghifileLaiXe(laixe);
        }
    }

    public void ghifileLaiXe(LaiXe laixe) throws IOException {
        File f = new File(FNAME);
        boolean append = f.exists();
        FileOutputStream fout = new FileOutputStream(f, append);
        AppendObjectOutputStream out = new AppendObjectOutputStream(fout, append);
        out.writeObject(laixe);
        out.close();
    }

    public void docfileLaiXe() throws IOException, ClassNotFoundException {
        lsds.clear();
        boolean check = true;
        FileInputStream fin = new FileInputStream(FNAME);
        ObjectInputStream in = new ObjectInputStream(fin);
        while (check) {
            try {
                LaiXe laixe = (LaiXe) in.readObject();
                lsds.add(laixe);
            } catch (EOFException e) {
                check = false;
            }
            fin.close();
            in.close();
        }
    }

    public void hiendsLaiXe() throws IOException, ClassNotFoundException {
        docfileLaiXe();
        for (LaiXe laixe : lsds) {
            System.out.println("" + lsds.toString());
        }
    }
}
