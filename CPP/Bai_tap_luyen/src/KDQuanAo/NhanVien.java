package KDQuanAo;

import java.util.Scanner;

public class NhanVien extends Person implements IHoatDong{
	private String maNV;
	private double soGioLam;
	private String caLamViec;

	public NhanVien() {
		super();
	}

	public NhanVien(String hoTen, String diaChi, String soDT) {
		super(hoTen, diaChi, soDT);
		
	}
	
	public NhanVien(String maNV, double soGioLam, String caLamViec) {
		super();
		this.maNV = maNV;
		this.soGioLam = soGioLam;
		this.caLamViec = caLamViec;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public double getSoGioLam() {
		return soGioLam;
	}

	public void setSoGioLam(double soGioLam) {
		this.soGioLam = soGioLam;
	}

	public String getCaLamViec() {
		return caLamViec;
	}

	public void setCaLamViec(String caLamViec) {
		this.caLamViec = caLamViec;
	}

	@Override
	public void nhap() {
		System.out.print("Nhap ma nhan vien: ");
		maNV = new Scanner(System.in).nextLine();
		super.nhap();
		System.out.print("Nhap ca lam viec: ");
		caLamViec = new Scanner(System.in).nextLine();
		System.out.print("Nhap so gio lam: ");
		soGioLam = new Scanner(System.in).nextDouble();
		tinhLuong();
	}
	public double tinhLuong() {
		double luong;
		luong = this.soGioLam*25000;
		return luong;		
	}
	@Override
	public String toString() {
		return String.format("\n%-10s | %-15s | %-15s |%-20s | %-17f| %-17s | %-15f", maNV, super.getHoTen(), super.getSoDT(), super.getDiaChi(), soGioLam, caLamViec, tinhLuong());
	}

}
