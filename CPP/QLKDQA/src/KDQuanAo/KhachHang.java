package KDQuanAo;

import java.util.Scanner;

public class KhachHang extends Person implements IHoatDong{
	private String maKH;

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhachHang(String hoTen, String diaChi, String soDT, String maKH) {
		super(hoTen, diaChi, soDT);
		this.maKH = maKH;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	@Override
	public void nhap() {
		System.out.print("Nhap ma khach hang : ");
		maKH = new Scanner(System.in).nextLine();
		super.nhap();		
	}

	@Override
	public String toString() {
		return "Khach hang [Ma KH=" + maKH + super.toString()+"]";
	}
}
