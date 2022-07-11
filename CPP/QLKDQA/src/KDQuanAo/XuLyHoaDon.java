package KDQuanAo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class XuLyHoaDon {
	ArrayList<HoaDon> dshd = new ArrayList<>();	
	public void nhapDSHD() throws ClassNotFoundException, IOException {
		int n;
		System.out.println("Nhap so luong hoa don: ");
		n = new Scanner(System.in).nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("----------------------");
			System.out.println("Nhap hoa don thu "+(i+1));
			HoaDon hd = new HoaDon();
			hd.nhap();
			dshd.add(hd);
		}
	}
	
	public void hienDSHD() {
		System.out.println("Danh sach hoa don: ");
		for(HoaDon hd:dshd) {
			System.out.println("----------------------");
			System.out.println("Hoa don thu  "+(dshd.indexOf(hd)+1));
			hd.hienHoaDon();
		}
	}
	
	public void themHoaDon() throws ClassNotFoundException, IOException {
		docFileHD();
		HoaDon hd1 = new HoaDon();
		hd1.nhap();
		dshd.add(hd1);
		ghiFileHD();
	}
	
	public void ghiFileHD() throws IOException {
		File f = new File("HoaDon.dat");
		FileOutputStream fout = new FileOutputStream(f);
	    ObjectOutputStream objout = new ObjectOutputStream(fout);
	    objout.writeObject(dshd);
	    objout.close();
	    fout.close();
	}
	
	public void docFileHD() throws IOException, ClassNotFoundException {
		File f = new File("HoaDon.dat");
		FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);
        dshd = (ArrayList) objin.readObject();
        objin.close();
        fin.close();     
	}
	
	public void sapXepHoaDon() {
		Collections.sort(this.dshd, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return Double.compare(o1.getThanhTien(), o2.getThanhTien());
            }
        });
		hienDSHD();
	}
	
	public void timKiemHD() throws ClassNotFoundException, IOException {
		docFileHD();
		String maHD;
		System.out.println("Nhap ma hoa don can tim: ");
		maHD = new Scanner(System.in).nextLine();
		for(HoaDon hd : dshd) {
			if(hd.getMaHD().equalsIgnoreCase(maHD)) {
				hd.hienHoaDon();
			}
		}	
	}
	
	public void xoa() throws ClassNotFoundException, IOException {
		docFileHD();
		String maHD;
		System.out.println("Nhap hoa don can xoa:");
		maHD = new Scanner(System.in).nextLine();
		for(HoaDon hd : dshd) {
			if(hd.getMaHD().equalsIgnoreCase(maHD)) {
				dshd.remove(hd);
			}
		}
		ghiFileHD();
		hienDSHD();
	}
	
//	public void sua() throws ClassNotFoundException, IOException {
//		docFileHD();
//		hienDSHD();
//		System.out.println("Nhap so thu tu hoa don muon sua : ");
//		String  index = new Scanner(System.in).nextLine();
//		dshd.get(1).setMaHD(index);
//	}
	
	public void HDMax() throws ClassNotFoundException, IOException {
	
		docFileHD();
		System.out.println("Hoa don max: ");
		HoaDon max1 = Collections.max(dshd);
		max1.hienHoaDon();		
	}
}
