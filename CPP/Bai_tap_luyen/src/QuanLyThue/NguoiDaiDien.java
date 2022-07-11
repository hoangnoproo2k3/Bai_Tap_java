package QuanLyThue;

import java.io.Serializable;
import java.util.Scanner;

public class NguoiDaiDien extends Person implements Serializable{
	String doiTuong;
	String ngaySinh;
	String CMND;
	String linhVuc;
	float thuNhap;
	
	public NguoiDaiDien() {	
	}
	public NguoiDaiDien(String doiTuong, String ngaySinh, String CMND, String linhVuc, float thuNhap) {
		super();
		this.doiTuong = doiTuong;
		this.ngaySinh = ngaySinh;
		this.CMND = CMND;
		this.linhVuc = linhVuc;
		this.thuNhap = thuNhap;
	}
	public void nhapNDD(){
		System.out.println("\n   NGUOI NOP THUE: ");
		super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("      Nhap doi tuong (ca nhan, danh nghiep, to chuc, ho gia dinh): ");
        doiTuong = sc.nextLine();
        System.out.print("      Nhap vao ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("      Nhap vao CMND: ");
        CMND = sc.nextLine();
        System.out.print("      Nhap vao linh vuc: ");
        linhVuc = sc.nextLine();
        System.out.print("      Nhap vao thu nhap: ");
        thuNhap = sc.nextFloat();
    }
    public void xuatNDD() {
    	super.xuat();
    	System.out.print("\n    Ngay sinh        : " + ngaySinh);
    	System.out.print("\n    Doi tuong        : " + doiTuong);
    	System.out.print("\n    CMND             : " + CMND);
    	System.out.print("\n    Linh vuc tham gia: " + linhVuc);
    	System.out.print("\n    Thu nhap/nam     : " + thuNhap);
    }
	public float getThuNhap() {
		return thuNhap;
	}
	public void setThuNhap(float thuNhap) {
		this.thuNhap = thuNhap;
	}
	@Override
	public String toString() {
    
        return "Nguoi dai dien{" +super.toString() +
                "Doi tuong: " + doiTuong +
                "Ngay sinh:" + ngaySinh + 
                "CMDN:" + CMND +
                "Linh vuc:" + linhVuc +
                "Thu nhap:" + thuNhap + '}';
    }
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public String getLinhVuc() {
		return linhVuc;
	}
	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}
}
