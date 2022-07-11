/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiKT;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class XuLiTuyen {

    ArrayList<Tuyen> ls = new ArrayList<>();
    public static final String FNAME = "TUYEN.DAT";

    public void nhapDSTuyen() throws IOException {
        System.out.print("Nhap so luong tuyen : ");
        int tuyen = new Scanner(System.in).nextInt();
        for (int i = 0; i < tuyen; i++) {
            Tuyen t = new Tuyen();
            t.nhap();
            ghifileTuyen(t);
        }
    }

    public void ghifileTuyen(Tuyen t) throws FileNotFoundException, IOException {
        File f = new File(FNAME);
        boolean append = f.exists();
        FileOutputStream fout = new FileOutputStream(f, append);
        AppendObjectOutputStream out = new AppendObjectOutputStream(fout, append);
        out.writeObject(t);
        out.close();
    }

    public void docfileTuyen() throws FileNotFoundException, IOException, ClassNotFoundException {
        ls.clear();
        boolean check = true;
        FileInputStream fin = new FileInputStream(FNAME);
        ObjectInputStream in = new ObjectInputStream(fin);
        while (check) {
            try {
                Tuyen t = (Tuyen) in.readObject();
                ls.add(t);
            } catch (EOFException e) {
                check = false;
            }
            fin.close();
            in.close();
        }
    }

    public void hiendsTuyen() throws FileNotFoundException, IOException, ClassNotFoundException {
        docfileTuyen();
        for (Tuyen t : ls) {
            System.out.println(""+t.toString());
        }
    }
}
