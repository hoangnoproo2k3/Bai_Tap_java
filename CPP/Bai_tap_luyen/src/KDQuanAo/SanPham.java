package KDQuanAo;

import java.io.Serializable;
import java.util.Scanner;

public class SanPham implements IHoatDong,Serializable{
	private String maSP;
	private String tenSP;
	private double giaBan;
	
	public SanPham() {
		super();
	}

	public SanPham(String maSP, String tenSP, double giaBan) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.giaBan = giaBan;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	@Override
	public void nhap() {
		System.out.print("Nhap ma san pham: ");
		maSP = new Scanner(System.in).nextLine();
		System.out.print("Nhap ten san pham: ");
		tenSP = new Scanner(System.in).nextLine();
		System.out.print("Nhap gia ban : ");
		giaBan = new Scanner(System.in).nextDouble();		
	}

	@Override
	public String toString() {
		return "San Pham [ma SP =" + maSP + ", Ten SP =" + tenSP + ", Gia ban =" + giaBan + "]";
	}

}

