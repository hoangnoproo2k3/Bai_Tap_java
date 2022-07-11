package BTL;
import java.io.Serializable;
import java.util.*;
public class KH implements Serializable {
	private String cmnd;
	private String hoten;
	private String sdt;
	private String diachi;
	
	public KH(String cmnd, String hoten, String sdt, String diachi) {
		super();
		this.cmnd = cmnd;
		this.hoten = hoten;
		this.sdt = sdt;
		this.diachi = diachi;
	}
	public KH()
	{
		this.cmnd = "";
		this.hoten = "";
		this.sdt = "";
		this.diachi = "";
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public void nhapKH()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("CMND khách hàng:");
		setCmnd(sc.nextLine());
		System.out.print("Tên khách hàng:");
		setHoten(sc.nextLine());
		System.out.print("SDT khách hàng:");
		setSdt(sc.nextLine());
		System.out.print("Địa chỉ khách hàng:");
		setDiachi(sc.nextLine());
	}
	public void hienKH()
	{
		System.out.println("Tên khách hàng:"+getHoten());
		System.out.println("SDT khách hàng:"+getSdt());
		System.out.println("CMND:"+getCmnd());
		System.out.println("Địa chỉ:"+getDiachi());
	}
}

