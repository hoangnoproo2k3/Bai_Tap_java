package KDQuanAo;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon implements Serializable,Comparable<HoaDon>{
	private String maHD;
	private String ngayInHD;
	private int soLuongSP;
	private double thanhTien;
	private KhachHang khachHang;
	private String nhanVien;
	private ArrayList<SanPham> dssp = new ArrayList<>();
	
	private ArrayList<String> s = new ArrayList<>();
	
	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public String getNgayInHD() {
		return ngayInHD;
	}

	public void setNgayInHD(String ngayInHD) {
		this.ngayInHD = ngayInHD;
	}

	public int getSoLuongSP() {
		return soLuongSP;
	}

	public void setSoLuongSP(int soLuongSP) {
		this.soLuongSP = soLuongSP;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public String getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(String nhanVien) {
		this.nhanVien = nhanVien;
	}

	public ArrayList<SanPham> getDssp() {
		return dssp;
	}

	public void setDssp(ArrayList<SanPham> dssp) {
		this.dssp = dssp;
	}
	
	private void nhapKhachHang() throws IOException, ClassNotFoundException {
		String maKH;
		System.out.print("Nhap vao ma khach hang: ");
		maKH = new Scanner(System.in).nextLine();
		KhachHang kh = new DSKhachHang().timKiemKH(maKH);
		if(kh == null) {
			System.out.println("Khach hang moi, nhap du lieu vao he thong!");
//			KhachHang kh1 = new KhachHang();
//			kh1.nhap();
			 
			khachHang = new DSKhachHang().themKhachHang();
			
		}else {
			khachHang = kh;
		}
	}
	private void nhapNhanVien() throws ClassNotFoundException, IOException {
		String hoTen;
		System.out.print("Nhap ho ten nhan vien: ");
		hoTen = new Scanner(System.in).nextLine();
		String nv = new DSNhanVien().timKiemNV(hoTen);
		if(nv == null) {
			System.out.println("Khong ton tai nhan vien nay !");		
		}
		nhanVien = nv;
	}
	private void nhapDSSP() throws ClassNotFoundException, IOException {
		DSSanPham dssp = new DSSanPham();
		String maSP;
		double ttien=0;
		int n;
		System.out.print("Nhap so mat hang: ");
		n = new Scanner(System.in).nextInt();
		dssp.docFileSP();
		dssp.hienDSSP();
		for(int i=0; i<n; i++) {
			System.out.println("\nNhap mat hang thu "+(i+1));
			System.out.print("Nhap ma san pham: ");
			maSP = new Scanner(System.in).nextLine();
			SanPham sp = new DSSanPham().timKiemSP(maSP);
			if(sp == null) {
				System.out.println("Khong ton tai san pham nay!");
				
			}else {
				System.out.print("Nhap so luong san pham : ");
				soLuongSP = new Scanner(System.in).nextInt();
				//Tinh thanh tien cua moi san pham
				ttien = soLuongSP*sp.getGiaBan();
				//Them so luong san pham va thanh tien vao thong tin san pham
				this.s.add(sp.toString() + ", So luong = " + soLuongSP + ", Thanh tien = " + ttien);
				//Tinh tong tien hoa don
				thanhTien += ttien;
			}
		}
	}

	public void nhap() throws IOException, ClassNotFoundException {
		System.out.print("Nhap ma hoa don: ");
		maHD = new Scanner(System.in).nextLine();
		System.out.print("Nhap ngay in hoa don: ");
		ngayInHD = new Scanner(System.in).nextLine();
		nhapNhanVien();
		System.out.println("Nhap thong tin khach hang: ");
		nhapKhachHang();
		System.out.println("\nNhap danh sach san pham: ");
		nhapDSSP();		
	}
	
	public void hienHoaDon() {
		System.out.println("Ma hoa don: "+maHD);
		System.out.println("Ngay in hoa don: "+ngayInHD);
		System.out.println("Ho ten nhan vien: "+nhanVien);
		System.out.println("Thong tin khach hang: "+khachHang);
		System.out.println("Danh sach san pham: ");
		for(String e:s) {
			System.out.println(e);
		}
		System.out.println("TONG : "+thanhTien);
	}

	@Override
	public int compareTo(HoaDon o) {
		if (this.getThanhTien() > o.getThanhTien()) {
			   return 1;
		} else if (this.getThanhTien() < o.getThanhTien()) {
			   return -1;
		}
			  return 0;
		}
}
	


