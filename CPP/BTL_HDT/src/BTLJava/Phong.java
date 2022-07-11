package BTLJava;
import java.io.Serializable;
import java.util.Scanner;

public class Phong implements Serializable{
	private int soP;
	private float giaP;
	private String loaiP;
	private boolean trangthai;
	
	public int getSoP() {
		return soP;
	}
	public void setSoP(int soP) {
		this.soP = soP;
	}
	public float getGiaP() {
		return giaP;
	}
	public void setGiaP(float giaP) {
		this.giaP = giaP;
	}
	public String getLoaiP() {
		return loaiP;
	}
	public void setLoaiP(String loaiP) {
		this.loaiP = loaiP;
	}
	public boolean isTrangthai() {
		return trangthai;
	}
	public void setTrangthai(boolean trangthai) {
		this.trangthai = trangthai;
	}
	
	
	public Phong(int soP, float giaP, String loaiP, boolean trangthai) {
		super();
		this.soP = soP;
		this.giaP = giaP;
		this.loaiP = loaiP;
		this.trangthai = trangthai;
	}
	
	public Phong() {
	}
	
	public void nhapP() {
		Scanner sc = new Scanner(System.in);

		int chonphong;
		while(true) {
			try {
				System.out.println("Nhập loại phòng: 1.Phòng thường đơn  | 2.Phòng thường đôi | 3.Phòng Vip đơn | 4.Phòng vip đôi");
				chonphong = sc.nextInt();
				if(chonphong >=1 && chonphong <= 4) {
					switch(chonphong) {
					case 1: loaiP = "Phòng thường đơn";
					giaP = 1000000;
					break;
			case 2: loaiP = "Phòng thường đôi";
					giaP = 1500000;
					break;
			case 3: loaiP = "Phòng Vip đơn";
					giaP = 2000000;
					break;
			case 4: loaiP = "Phòng Vip đôi";
					giaP = 2500000;
					break;
					}
				}
				else {
					throw new Exception();
				}
					break;
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("Chỉ nhập số từ 1 đến 4");
			}
		}
		
		while(true) {
			try {
				System.out.println("Trạng thái phòng: True:Còn trống | False:Đã thuê");
				trangthai = sc.nextBoolean();
				break;
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("Không hợp lệ! Mời nhập lại");
			}
	}
}
	
	public String toString() {
		String tt;
		if(trangthai) {
			tt= "Còn trống";
		}
		else {
			tt = "Đã thuê";
		}
		return String.format("\n%-10d | %-20s | %-20.1f | %-20s ", soP, loaiP, giaP, tt);
	}
}
