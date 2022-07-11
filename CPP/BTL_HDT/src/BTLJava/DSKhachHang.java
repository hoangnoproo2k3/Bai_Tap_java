package BTLJava;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Serializable;

public class DSKhachHang implements Serializable {
	ArrayList<KhachHang> dsKH= new ArrayList<KhachHang>();
	
	public void nhapDSkh() {
		Scanner sc= new Scanner(System.in);
		int n;
		while(true) {
			try {
				System.out.println("Nhập số lượng khách hàng: ");
				n=sc.nextInt();
				break;
			} catch(Exception e) {
				System.out.println("Bạn hãy nhập lại! ");
				sc.nextLine();
			}
		}
		for(int i=0;i<n;i++) {
			KhachHang kh= new KhachHang();

			if(dsKH.size()==0) {
				kh.setMaKH(0);
			}else {
				kh.setMaKH(dsKH.size());
				}
			
			System.out.println("\nNhập thông tin khách hàng thứ " +(dsKH.size()+1)+ ": ");
			kh.nhapKH();
			dsKH.add(kh);
		}
	}
	
	public void hienDSkh() {
		System.out.printf("\n%-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-15s","Mã KH","Tên KH","GT","Ngày sinh","SDT","Quốc tịch","CMND");
		for(KhachHang kh: dsKH) {
			System.out.println(kh.toString());
		}
	}
	
	public void sxDSKHtheoten() {
		System.out.println("Danh sách khi sắp xếp theo tên khách hàng: ");
		Collections.sort(dsKH);
		hienDSkh();
	}
//	public void suaKH() {
//		Scanner sc= new Scanner(System.in);
//		String maKH;
//		System.out.println("Nhập mã khách hàng muốn sửa: ");
//		maKH=sc.nextLine();
//		for(KhachHang kh: dsKH) {
//			if(kh.getMaKH().equals(maKH)) {
//				kh.nhapKH();
//			}
//		}
//	}
	
	public void xoaKH() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập tên khách hàng cần xóa: ");
		String name=sc.nextLine();
		Boolean kiemtra = false;
		for(KhachHang kh: dsKH) {
			if(kh.getTenKH().equals(name)) {
				dsKH.remove(kh);
				kiemtra=true;
				break;
			}
		}
		
		if(!kiemtra) {
			System.out.println("Không tìm thấy người có tên %s" +name);
		}
	}

	public void lietkekhGTnu() {
		Boolean cokhong = false;

		for(KhachHang kh: dsKH) {
			
//			if(!cokhong) {
//				System.out.println("Danh sách khách hàng có giới tính là nữ: ");
//				System.out.printf("\n%-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-15s","Mã KH","Tên KH","GT","Ngày sinh","SDT","Quốc tịch","CMND");
//			}
			
			if(!kh.getGtKH()) {
				System.out.println(kh.toString());
				cokhong=true;
			}
		}
		
		if(!cokhong) {
			System.out.println("Không có khách hàng nữ!");
		}
	}
}