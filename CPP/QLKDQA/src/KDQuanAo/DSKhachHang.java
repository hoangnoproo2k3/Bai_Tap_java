package KDQuanAo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DSKhachHang {
	ArrayList<KhachHang> dskh = new ArrayList<>();
	public void nhapDSKH() {
		int n;
		System.out.print("Nhap so luong khach hang: ");
		n= new Scanner(System.in).nextInt();
		for(int i=0; i<n; i++) {
			KhachHang kh = new KhachHang();
			System.out.println("\nNhap thong tin khach hang thu "+(dskh.size()+1));
			kh.nhap();
			dskh.add(kh);
		}
	}
	public void hienDSKH() throws ClassNotFoundException, IOException {
		docFileKH();
		System.out.println("Danh sach khach hang: ");
		try {
			for(KhachHang kh:dskh)
				System.out.println(kh.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public void ghiFileKH() throws IOException {
		File f = new File("KhachHang.dat");
		FileOutputStream fout = new FileOutputStream(f);
	    ObjectOutputStream objout = new ObjectOutputStream(fout);
	    objout.writeObject(dskh);
	    objout.close();
	    fout.close();
	}
	public void docFileKH() throws IOException, ClassNotFoundException {
		File f = new File("KhachHang.dat");
		FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        dskh = new ArrayList<KhachHang>();
        dskh = (ArrayList) objin.readObject();
        objin.close();
        fin.close();
	}
	public KhachHang timKiemKH(String maKH) throws ClassNotFoundException, IOException {
		docFileKH();
		KhachHang kh = null;
		for(KhachHang khachHang : dskh) {
			if(khachHang.getMaKH().equalsIgnoreCase(maKH)) {
				return khachHang;
			}
		}
		return null;
	}
	public KhachHang themKhachHang() throws ClassNotFoundException, IOException {
		docFileKH();
		KhachHang kh1 = new KhachHang();
		kh1.nhap();
		dskh.add(kh1);
		ghiFileKH();
		return kh1;
	}
	
}
