package bai2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhSachKhachHang {

    ArrayList<KhanhHang> listkh = new ArrayList<>();

    public void nhapDsKH() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong khach hang: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            KhanhHang kh = new KhanhHang();
            kh.nhapKH();
            listkh.add(kh);
        }
    }

    public void hienDsKH() {
        for (KhanhHang khachHang : listkh) {
            System.out.println("" + khachHang.toString());
        }
    }

    public void ghiFile() throws IOException, FileNotFoundException {
        File f = new File("kh.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(listkh);
        objout.close();
        fout.close();
    }

    public void docFile() throws IOException, ClassNotFoundException {
        File f = new File("kh.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        listkh = (ArrayList) objin.readObject();
        objin.close();
        fin.close();
    }
}
