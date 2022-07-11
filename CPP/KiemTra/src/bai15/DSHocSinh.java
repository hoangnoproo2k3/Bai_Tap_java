package bai15;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class DSHocSinh {

    ArrayList<HocSinh> dshs = new ArrayList<>();
    int n;
    public static final String fname="hocsinh.DAT";
    public void nhapDS() {
        System.out.println("Nhập số lượng học sinh: ");
        n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            HocSinh x = new HocSinh();
            x.nhap();
            dshs.add(x);
        }
    }

    public void hienDs() {
        for (HocSinh x : dshs) {
            System.out.println("" + x.gioiThieu());
        }
    }

    public void XLtimKiem() {
        System.out.println("Nhập năm sinh: ");
        int nsinh = new Scanner(System.in).nextInt();
        for (HocSinh x : dshs) {
            if (nsinh == x.getTuoi()) {
                System.out.println("" + x.gioiThieu());
            }
        }
    }

    public void ghiFile(HocSinh hs) throws FileNotFoundException, IOException {
        File F = new File(fname);
        FileOutputStream fout = new FileOutputStream(fname);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(dshs);
        out.close();
        fout.close();

    }

    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        dshs.clear();
        boolean kt= true;
        FileInputStream fin = new FileInputStream(fname);
        ObjectInputStream in = new ObjectInputStream(fin);
        dshs = (ArrayList<HocSinh>) in.readObject();
        while(kt){
            try {
                HocSinh hs =(HocSinh) in.readObject();
                dshs.add(hs);
            } catch (EOFException e) {
                kt=false;
            }
        }
        in.close();
        fin.close();
    }
    public void TaoDSPC() throws IOException{
        HocSinh dshs = new HocSinh();
        dshs.nhap();
        System.out.println("Ghi cong viec vao file: ");
        ghiFile(dshs);
    }
    public void hienTudocfile() throws IOException, FileNotFoundException, ClassNotFoundException{
        docFile();
        System.out.println("");
        for(HocSinh hs: dshs){
            System.out.println(""+hs.gioiThieu());
        }
    }
    

}
