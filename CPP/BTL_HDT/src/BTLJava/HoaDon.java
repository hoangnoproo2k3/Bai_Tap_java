package BTLJava;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class HoaDon implements Serializable{
	private String maHD;
	private String ngayLap;
	private int soNgayThue;
	private float thanhTien;
	KhachHang KH = new KhachHang();
	NhanVien NV = new NhanVien();
	Phong P = new Phong();
	
	Scanner sc = new Scanner(System.in);

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(int maHD) {
		this.maHD = "HD"+maHD;
	}

	public String getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}
	
	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(float thanhTien) {
		this.thanhTien = thanhTien;
	}

	public void nhapHD(ArrayList<KhachHang> dskh, ArrayList<NhanVien> dsnv, ArrayList<Phong> dsp) {
                System.out.println("Nhập mã hóa đơn: ");
                maHD= new Scanner(System.in).next();
		System.out.println("Nhập ngày lập: ");
		ngayLap = sc.nextLine();
		try {
			System.out.println("Nhập số ngày thuê phòng: ");
			soNgayThue = sc.nextInt();
			sc.nextLine();
		}catch(Exception e) {
			sc.nextLine();
			System.out.println("Mời bạn nhập số!");
		}
		while(true) {
			System.out.println("Nhập mã nhân viên lập hóa đơn: ");
			String maNV = sc.nextLine();
		
			boolean kiemtra = false;
			for(NhanVien nv : dsnv) {
				if(nv.getMaNV().equals(maNV)) {
					NV = nv;
					kiemtra = true;
					break;
				}
			}
				
				if(kiemtra == true) {
					break;
				}
			
			System.out.println("Mã nhân viên không hợp lệ. Nhập lại!");
		}
		while(true) {
			System.out.println("Nhập mã khách hàng đặt phòng: ");
			String maKH= sc.nextLine();
			boolean kiemtra = false;
			for(KhachHang kh:dskh) {
				if(kh.getMaKH().equals(maKH)) {
					KH=kh;
					kiemtra=true;
					break; 
				}
			}
			if(kiemtra==true) {
				break;
			}
			System.out.println("Mã khách hàng không hợp lệ. Nhập lại!");
		}
		while(true) {
			System.out.println("Nhập số phòng: ");
			int soP = sc.nextInt();
			boolean kiemtra = false;
			for(Phong pg: dsp) {
				if(pg.getSoP()==soP) {
					P = pg;
					kiemtra = true;
					break;
				}
			}
			if(kiemtra ==true) {
				break;
			}
			System.out.println("Mã phòng không hợp lệ. Nhập lại!");
		}
	 thanhTien= P.getGiaP() * soNgayThue;
	}
	
	public void hienHD() {
		System.out.printf("\nMã hóa đơn: %s", maHD);
		System.out.printf("\nNgày lập: %s", ngayLap);
		System.out.printf("\nSố ngày thuê phòng: %d", soNgayThue);
		System.out.println("\nNhân viên lập hóa đơn: "+NV.getTenNV());
		System.out.println("Khách hàng thuê phòng: "+KH.getTenKH() + KH.getCmndKH());
		System.out.println("Thông tin phòng thuê: ");
		System.out.printf("\n%-10s | %-20s | %-20s | %-20s%11s", "Số phòng","Loại Phòng","Giá phòng","Tình trạng", "Thành tiền");
		System.out.printf(P.toString() + thanhTien);
	}
}
