package QuanLyThue;

import java.io.Serializable;
import java.util.Scanner;

public class NhanVien extends Person implements Serializable{
	private String maNV;
	private String chungChiHN;
	
	public NhanVien() {
    }
    public NhanVien(String maNV, String chungChiHN) {
		super();
		this.maNV = maNV;
		this.chungChiHN = chungChiHN;
	}
	public void nhapNV() {
    	System.out.println("\n  NHAN VIEN THU THUE: ");
    	super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("      Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("      Nhap chung chi hanh nghe: ");
        chungChiHN = sc.nextLine();
    }
    
    public void xuatNV(){
        super.xuat();
        System.out.print("\n    Ma nhan vien     : " + maNV);
    	System.out.print("\n    ChunhChi HanhNghe: " + chungChiHN);
    }
	@Override
	public String toString() {
        return  "NhanVien{"+super.toString() + 
        		"chungChiHN=" + chungChiHN + '}';
    }
}
