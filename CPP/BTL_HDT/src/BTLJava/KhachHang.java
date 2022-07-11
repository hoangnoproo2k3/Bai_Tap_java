package BTLJava;
import java.io.Serializable;
import java.util.Scanner;

public class KhachHang implements Comparable, Serializable{
	private String maKH, tenKH, sdtKH, quocTichKH, nsKH;
	private String cmndKH;
	private boolean gtKH;
	Scanner sc = new Scanner(System.in);

	public KhachHang() {
		super();

	}
	public KhachHang(String maKH, String tenKH, String sdtKH, String quocTichKH, String cmndKH, String nsKH, Boolean gtKH) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.sdtKH = sdtKH;
		this.quocTichKH = quocTichKH;
		this.cmndKH = cmndKH;
		this.nsKH = nsKH;
		this.gtKH = gtKH;
	}
	
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = "KH"+maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getSdtKH() {
		return sdtKH;
	}
	public void setSdtKH(String sdtKH) {
		this.sdtKH = sdtKH;
	}
	public String getQuocTichKH() {
		return quocTichKH;
	}
	public void setQuocTichKH(String quocTichKH) {
		this.quocTichKH = quocTichKH;
	}
	public String getCmndKH() {
		return cmndKH;
	}
	public void setCmndKH(String cmndKH) {
		this.cmndKH = cmndKH;
	}
	public String getNsKH() {
		return nsKH;
	}
	public void setNsKH(String nsKH) {
		this.nsKH = nsKH;
	}
	public Boolean getGtKH() {
		return gtKH;
	}
	public void setGtKH(Boolean gtKH) {
		this.gtKH = gtKH;
	}

	public void nhapKH() {
		System.out.println("Tên khách hàng: ");
		tenKH=sc.nextLine();
		while(true) {
			try {
			System.out.println("Giới tính (true:Nam : false:Nữ): ");
			gtKH=sc.nextBoolean();
			sc.nextLine();
			break;
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("Nhập không hợp lệ!");
			}
		}
		
		
		while(true) {
			try {
			System.out.println("Số điện thoại: ");
			sdtKH=sc.nextLine();
			Long cmnd=Long.parseLong(sdtKH);
			if(cmnd<0) {
				throw new Exception();
			}
			break;
			}catch(Exception e) {
				System.out.println("Nhập không hợp lệ!");
			}
		}
		
		System.out.println("Ngày sinh: ");
		nsKH=sc.nextLine();
		while(true) {
			try {
			System.out.println("CMND/Căn cước: ");
			cmndKH=sc.nextLine();
			Long cmnd=Long.parseLong(cmndKH);
			if(cmnd<0) {
				throw new Exception();
			}
			break;
			}catch(Exception e) {
				System.out.println("Nhập không hợp lệ!");
			}
		}
		
		System.out.println("Quốc tịch: ");
		quocTichKH=sc.nextLine();
	}
	
	@Override
	public String toString() {
		String gender="";
		if(this.gtKH)
		{
			gender="nam";
		} else {
			gender="nữ";
		}
		return String.format("\n%-10s | %-15s | %-15s | %-10s | %-15s | %-15s | %-15s", maKH, tenKH, nsKH, gender, sdtKH, quocTichKH, cmndKH);

	}
	
	@Override
	public int compareTo(Object o) {
		return tenKH.compareTo(((KhachHang) o).getTenKH());
	}
}
