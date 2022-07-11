package BTLJava;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.Serializable;

public class DSNhanVien implements Serializable {
    ArrayList<NhanVien> dsNV= new ArrayList<NhanVien>();
	
	public void nhapDSnv() {
		Scanner sc= new Scanner(System.in);
		int n;
		while(true) {
			try {
				System.out.println("Nhập số lượng nhân viên: ");
				n=sc.nextInt();
				break;
			} catch(Exception e) {
				System.out.println("Bạn hãy nhập lại! ");
				sc.nextLine();
			}
		}
		for(int i=0;i<n;i++) {
			NhanVien nv= new NhanVien();

			if(dsNV.size()==0) {
				nv.setMaNV(0);
			}else {
				nv.setMaNV(dsNV.size());
				}
			
			System.out.println("\nNhập thông tin nhân viên thứ " +(dsNV.size()+1)+ ": ");
			nv.nhapNV();
			dsNV.add(nv);
		}
	}
	
	public void hienDSnv() {
		System.out.printf("\n%-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-12s","Mã NV","Tên NV","SDT","Năm sinh","GT","Hệ số lương","Lương");
		for(NhanVien nv: dsNV) {
			System.out.println(nv.toString());
		}
	}
	
	public void sxDSNVtheoten() {
		System.out.println("Danh sách khi sắp xếp theo tên nhân viên: ");
		Collections.sort(dsNV);
		hienDSnv();
	}
	
//	public void suaNV() {
//		Scanner sc= new Scanner(System.in);
//		String maNV;
//		System.out.println("Nhập mã nhân viên muốn sửa: ");
//		maNV=sc.nextLine();
//		for(NhanVien nv: dsNV) {
//	if(nv.getMaNV().equals(maNV)) {
//				nv.nhapNV();
//			}
//		}
//	}
	
	public void xoaNV() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập tên nhân viên cần xóa: ");
		String name=sc.nextLine();
		Boolean kiemtra=false;
		for(NhanVien nv: dsNV) {
			if(nv.getTenNV().equals(name)) {
				dsNV.remove(nv);
				kiemtra=true;
				break;
			}
		}
		if(!kiemtra) {
			System.out.println("Không tìm thấy nhân viên có tên "+name);
		}
	}
	
	public void lietkenvcoluongtren2000000() {
		Boolean cokhong=false;
		for(NhanVien nv: dsNV) {
			if(nv.tinhLuong()>2000000){
				
				if(!cokhong) {
					System.out.println("Danh sách nhân viên có lương trên 2000000: ");
					System.out.printf("\n%-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-12s","Mã NV","Tên NV","SDT","Ngày sinh","GT","Hệ số lương","Lương");
				}
				
				System.out.println(nv.toString());
				cokhong=true;
			}
		}
		
		if(!cokhong) {
			System.out.println("Không có nhân viên có lương trên 2000000!");
		}
	}
}