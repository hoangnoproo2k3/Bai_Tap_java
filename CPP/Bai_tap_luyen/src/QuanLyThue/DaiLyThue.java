package QuanLyThue;

import java.io.Serializable;
import java.util.Scanner;

public class DaiLyThue implements Serializable{
	private String maDaiLy;
	private String tenDL;
	private String sdtDL;
	private String diaChi;
	private String soFax;
	private String hopDongDL;
	
	public DaiLyThue(){
    }
    public DaiLyThue(String maDaiLy, String tenDL, String sdtDL, String diaChi, String soFax, String hopDongDL) {
		super();
		this.maDaiLy = maDaiLy;
		this.tenDL = tenDL;
		this.sdtDL = sdtDL;
		this.diaChi = diaChi;
		this.soFax = soFax;
		this.hopDongDL = hopDongDL;
	}
	public void nhapDLT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n   DAI LY THUE: ");
        System.out.print("      Nhap ma so thue: ");
        maDaiLy = sc.nextLine();
        System.out.print("      Nhap ten dai ly: ");
        tenDL = sc.nextLine();
        System.out.print("      Nhap sdt dai ly: ");
        sdtDL = sc.nextLine();
        System.out.print("      Nhap vao dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("      Nhap vao so fax: ");
        soFax = sc.nextLine();
        System.out.print("      Nhap vao hop dong dai ly thue: ");
        hopDongDL = sc.nextLine();
    }

    public void xuatDLT(){
    	System.out.print("\n    Ma dai ly thue   : " + maDaiLy);
    	System.out.print("\n    Ten dai ly       : " + tenDL);
    	System.out.print("\n    Sdt              : " + sdtDL);
    	System.out.print("\n    So fax           : " + soFax);
    	System.out.print("\n    Dia chi          : " + diaChi);
    	System.out.print("\n    Hop dong dai ly  : " + hopDongDL);
    }
	@Override
	public String toString() {
        return "SachTK{"+super.toString() + 
        		"maSoThue=" + maDaiLy + 
        		"tenDL=" + tenDL +
        		"sdtDL=" + sdtDL +
                "dia chi:" + diaChi+
                "so fax:" + soFax+
                "hopDongDL:" + hopDongDL+
                '}';
    }
	public String getMaDaiLy() {
		return maDaiLy;
	}
	public void setMaDaiLy(String maDaiLy) {
		this.maDaiLy = maDaiLy;
	}
	public String getTenDL() {
		return tenDL;
	}
	public void setTenDL(String tenDL) {
		this.tenDL = tenDL;
	}
	public String getSdtDL() {
		return sdtDL;
	}
	public void setSdtDL(String sdtDL) {
		this.sdtDL = sdtDL;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoFax() {
		return soFax;
	}
	public void setSoFax(String soFax) {
		this.soFax = soFax;
	}
	public String getHopDongDL() {
		return hopDongDL;
	}
	public void setHopDongDL(String hopDongDL) {
		this.hopDongDL = hopDongDL;
	}   
}
