package BTLJava;
import java.io.Serializable;
import java.util.Scanner;

public class NhanVien implements Comparable,Serializable{
	private String maNV, tenNV, sdtNV, nsNV;
	private boolean gtNV;
	private float hslNV;
	public static float LCB=1150000;
	Scanner sc = new Scanner(System.in);
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(String maNV, String tenNV, String sdtNV, String nsNV, Boolean gtNV, float hslNV) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.sdtNV = sdtNV;
		this.nsNV = nsNV;
		this.gtNV = gtNV;
		this.hslNV = hslNV;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = "NV"+maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getSdtNV() {
		return sdtNV;
	}

	public void setSdtNV(String sdtNV) {
		this.sdtNV = sdtNV;
	}

	public String getNsNV() {
		return nsNV;
	}

	public void setNsNV(String nsNV) {
		this.nsNV = nsNV;
	}

	public boolean getGtNV() {
		return gtNV;
	}

	public void setGtNV(boolean gtNV) {
		this.gtNV = gtNV;
	}

	public float getHslNV() {
		return hslNV;
	}

	public void setHslNV(float hslNV) {
		this.hslNV = hslNV;
	}

	public static float getLCB() {
		return LCB;
	}

	public static void setLCB(float lCB) {
		LCB = lCB;
	}
	
	public float tinhLuong() {
		return LCB*hslNV;
	}
	
	//ham nhap
	public void nhapNV() {
		System.out.println("Tên nhân viên: ");
		tenNV=sc.nextLine();
		
		while(true) {
			try {
			System.out.println("Giới tính( True:Nam : False:Nữ ): ");
			gtNV=sc.nextBoolean();
			sc.nextLine();
			break;
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("Nhập không hợp lệ! ");
			}
		}
		
		while(true) {
			try {
			System.out.println("Số điện thoại: ");
			sdtNV=sc.nextLine();
			Long cmnd=Long.parseLong(sdtNV);
			if(cmnd<0) {
				throw new Exception();
			}
			break;
			}catch(Exception e) {
				System.out.println("Nhập không hợp lệ!");
			}
		}
		
		System.out.println("Ngày sinh: ");
		nsNV=sc.nextLine();
		
		while(true) {
			try {
			System.out.println("Hệ số lương: ");
			hslNV=sc.nextFloat();
			break;
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("Nhập không hợp lệ!");
			}
		}
	}

	@Override
	public String toString() {
		String gioitinh;
		if(gtNV)
		{
			gioitinh="nam";
		} else {
			gioitinh="nữ";
		}
		return String.format("\n%-10s | %-15s | %-15s | %-10s | %-15s | %-15.1f | %-12.1f", maNV, tenNV, nsNV, gioitinh, sdtNV, hslNV, tinhLuong());

	}
	
	@Override
	public int compareTo(Object o) {
		return tenNV.compareTo(((NhanVien) o).getTenNV());
	}
}
