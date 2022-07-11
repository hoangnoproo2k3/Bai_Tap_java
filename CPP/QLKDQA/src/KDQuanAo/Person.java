package KDQuanAo;

import java.io.Serializable;
import java.util.Scanner;

public class Person implements IHoatDong, Serializable{
	private String hoTen;
	private String diaChi;
	private String soDT;
	
	public Person() {
		super();
	}
	
	public Person(String hoTen, String diaChi, String soDT) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDT = soDT;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	@Override
	public void nhap() {
		System.out.print("Nhap ho ten: ");
		hoTen = new Scanner(System.in).nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = new Scanner(System.in).nextLine();
		System.out.print("Nhap so dien thoai: ");
		soDT = new Scanner(System.in).nextLine();
		
	}

	@Override
	public String toString() {
		return ", Ho ten =" + hoTen + ", Dia chi =" + diaChi + ", So DT =" + soDT;
	}
	

}
