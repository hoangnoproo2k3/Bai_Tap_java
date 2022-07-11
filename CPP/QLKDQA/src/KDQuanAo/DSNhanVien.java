package KDQuanAo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DSNhanVien {
	ArrayList<NhanVien> dsnv = new ArrayList<>();
	public void nhapDSNV() {
		int n;
		System.out.print("Nhap so luong nhan vien : ");
		n= new Scanner(System.in).nextInt();
		for(int i=0; i<n; i++) {
			NhanVien nv = new NhanVien();
			System.out.println("\nNhap thong tin nhan vien thu "+(dsnv.size()+1));
			nv.nhap();
			dsnv.add(nv);
		}
	}
	public void hienDSNV() {
		System.out.println("Danh sach nhan vien: ");
		try {
			System.out.printf("\n%-10s | %-15s | %-15s | %-20s | %-17s | %-17s | %-15s","Ma NV","Ho ten","So DT","Dia chi","So gio lam","Ca lam viec","Luong");
			for(NhanVien nv:dsnv) 
				System.out.println(nv.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void ghiFileNV() throws IOException {
		File f = new File("Nhanvien.dat");
		FileOutputStream fout = new FileOutputStream(f);
	    ObjectOutputStream objout = new ObjectOutputStream(fout);
	    objout.writeObject(dsnv);
	    objout.close();
	    fout.close();
	}
	public void docFileNV() throws IOException, ClassNotFoundException {
		File f = new File("Nhanvien.dat");
		FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        dsnv = new ArrayList<NhanVien>();
        dsnv = (ArrayList) objin.readObject();
        objin.close();
        fin.close();
	}
	public String timKiemNV(String hoTen) throws ClassNotFoundException, IOException {
		docFileNV();
		NhanVien nv = null;
		for(NhanVien nv1 : dsnv) {
			if(nv1.getHoTen().equalsIgnoreCase(hoTen)) {
				return nv1.getHoTen();
			}
		}
		return null;		
	}
}
