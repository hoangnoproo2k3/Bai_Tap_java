package KDQuanAo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DSSanPham {
	ArrayList<SanPham> dssp = new ArrayList<>();
	public void nhapDSSP() {
		int n;
		System.out.print("Nhap so luong san pham: ");
		n= new Scanner(System.in).nextInt();
		for(int i=0; i<n; i++) {
			SanPham sp = new SanPham();
			System.out.println("\nNhap thong tin san pham thu "+(dssp.size()+1));
			sp.nhap();
			dssp.add(sp);
		}
	}
	public void hienDSSP() {
		System.out.println("Danh sach san pham: ");
		try {
			for(SanPham sp:dssp) 
				System.out.println(sp.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ghiFileSP() throws IOException {
		File f = new File("SanPham.dat");
		FileOutputStream fout = new FileOutputStream(f);
	    ObjectOutputStream objout = new ObjectOutputStream(fout);
	    objout.writeObject(dssp);
	    objout.close();
	    fout.close();
	}
	public void docFileSP() throws IOException, ClassNotFoundException {
		File f = new File("SanPham.dat");
		FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        dssp = new ArrayList<SanPham>();
        dssp = (ArrayList) objin.readObject();
        objin.close();
        fin.close();
	}
	public SanPham timKiemSP(String maSP) throws ClassNotFoundException, IOException {
		docFileSP();
		SanPham sp = null;
		for(SanPham sanPham : dssp) {
			if(sanPham.getMaSP().equalsIgnoreCase(maSP)) {
				return sanPham;
			}
		}
		return null;
	}

}

