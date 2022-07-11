package QuanLyThue;

import java.io.Serializable;
import java.util.Scanner;

public class ToKhai implements Serializable{
	private String maTK;
	private String ngay;
	NguoiDaiDien nnt = new NguoiDaiDien();
	NhanVien nvtt = new NhanVien();
	DaiLyThue dlt = new DaiLyThue();
	
	public String getMaTK() {
		return maTK;
	}
	public String getNgay() {
		return ngay;
	}
	public void setNgay(String ngay) {
		this.ngay = ngay;
	}
	public void setMaTK(String maTK) {
		this.maTK = maTK;
	}
	public void nhapTK() {
		Scanner sc = new Scanner(System.in);
		System.out.print("   Nhap ma to khai: ");
		maTK = sc.nextLine();
		System.out.print("   Nhap ngay viet to khai: ");
		ngay = sc.nextLine();
		nnt.nhapNDD();
		dlt.nhapDLT();
		nvtt.nhapNV();
	}
	public float soTienNop() {
		return (float) (nnt.thuNhap * 0.05);
	}
	public float getTN() {
		return nnt.getThuNhap();
	}
	public void xuatTK() {
		System.out.println("\n=============================***TO KHAI***=============================");
		System.out.print("         Ma to khai: " + maTK + "\t\t\tNgay nhap: " + ngay + "  ");
		System.out.println("\n=======================================================================");
		nnt.xuatNDD();
		System.out.println("\n=======================================================================");
		dlt.xuatDLT();
		System.out.println("\n=======================================================================");
		nvtt.xuatNV();
		System.out.println("\n----------------------------------END----------------------------------");
	}
	@Override
	public String toString() {
		return "ToKhai [maTK=" + maTK + ", ngay=" + ngay + ", nnt=" + nnt.toString() 
				+ ", nvtt=" + nvtt.toString() + ", dlt=" + dlt.toString() + "]";
	}
}
