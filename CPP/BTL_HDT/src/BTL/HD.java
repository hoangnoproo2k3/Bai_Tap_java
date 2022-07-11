package BTL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class HD extends KH implements Comparable<HD>, Serializable{
	private String mahd, ngaylap,tennv;
	private int somh;
	ArrayList<SP> dssp;
	
	public int getSomh() {
		return somh;
	}

	public void setSomh(int somh) {
		this.somh = somh;
	}

	public String getMahd() {
		return mahd;
	}

	public void setMahd(String mahd) {
		this.mahd = mahd;
	}

	public String getNgaylap() {
		return ngaylap;
	}

	public void setNgaylap(String ngaylap) {
		this.ngaylap = ngaylap;
	}

	public String getTennv() {
		return tennv;
	}

	public void setTennv(String tennv) {
		this.tennv = tennv;
	}

	public HD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HD(String cmnd, String hoten, String sdt, String diachi, String mahd, String ngaylap, String tennv, int somh,
			ArrayList<SP> dssp) {
		super(cmnd, hoten, sdt, diachi);
		this.mahd = mahd;
		this.ngaylap = ngaylap;
		this.tennv = tennv;
		this.somh = somh;
		this.dssp = dssp;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã hóa đơn: "); mahd=sc.nextLine();
		System.out.print("Ngày lập: "); ngaylap=sc.nextLine();
		System.out.print("Tên nhân viên: "); tennv=sc.nextLine();
		super.nhapKH();
		System.out.print("\nSố mặt hàng: "); 
//		Vòng lặp bắt sự kiện nhập sai
		while(true) {
			try {
				somh=sc.nextInt();
				if(somh<0) throw new Exception(); 	/*số mặt hàng không âm*/
				break;
			} catch (Exception e) {
				System.out.print("Nhập sai giá trị nhập lại :");
				sc.nextLine();
			}
		}
		dssp=new ArrayList<>(somh);
		for(int i=0;i<somh;i++) {
			SP sp = new SP();
			System.out.println("\nNhập mặt hàng thứ "+(i+1));
			sp.nhapSP();
			dssp.add(sp);
		}
	}
	
	public void hien() {
		System.out.println("\nMã hóa đơn: "+mahd);
		System.out.println("Ngày lập: "+ngaylap);
		System.out.println("Tên nhân viên: "+tennv);
		super.hienKH();
		System.out.println("\nSố mặt hàng: "+somh);
		System.out.println("Danh sách mặt hàng: ");
		System.out.printf("%-13s|%-20s|%-20s|%-10s|%-10s\n","Mã sản phẩm","Mã nhà cung cấp","Tên sản phẩm","Số lượng","Giá bán");
		for(SP sp:dssp) {
			sp.hienSP();
		}
	}
	
	public int tinhtong() {
		int tong=0;
		for(SP sp:dssp) {
			tong+=(sp.getGiaban()*sp.getSl());
		}
		return tong;
	}

	@Override
	public int compareTo(HD o) {
		// TODO Auto-generated method stub
		if(tinhtong()>o.tinhtong()) return 1;
		else if(tinhtong()<o.tinhtong()) return -1;
		else return 0;
	}
}

