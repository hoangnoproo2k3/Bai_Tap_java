package QuanLyThue;

import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable{
	private String hoTen;
	private String sdt;
	 
	public Person () {
	}
	public Person(String hoTen, String sdt) {
		this.hoTen = hoTen;
		this.sdt = sdt;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("      Nhap vao ho ten: ");
		hoTen = sc.nextLine();
		System.out.print("      Nhap vao sdt: ");
		sdt = sc.nextLine();
	}
	public void xuat() {
		System.out.print("\n    Ho ten           : " + hoTen);
    	System.out.print("\n    Phone            : " + sdt);
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
}
