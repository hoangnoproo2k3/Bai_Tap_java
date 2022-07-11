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
public class danhSachMuaHang {
    ArrayList<MatHang> listMH = new ArrayList<>();
	
	public void nhapDsMH() {
		          Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong mat hang: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			MatHang MH = new MatHang();
			MH.nhapMH();
			listMH.add(MH);
		}
	}

	public void hienDS() {
		for (MatHang matHang : listMH) {
			System.out.println("" + matHang.toString());
		}
	}

	public void ghiFileMH() throws IOException, FileNotFoundException{
        File f = new File("mh.dat");
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(listMH);
        objout.close();
        fout.close();
    }

    public void docFileMH() throws IOException, ClassNotFoundException {
        File f = new File("mh.dat");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        listMH = (ArrayList)objin.readObject();
        objin.close();
        fin.close();
    }
}
