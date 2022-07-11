package BTL;
import java.io.Serializable;
import java.util.*;
public class SP implements Serializable {
	private String masp;
	private String mancc;
	private String tensp;
	private int sl;
	private float giaban;
	
	public SP()
	{
		this.masp = "";
		this.mancc = "";
		this.tensp = "";
		this.sl = 0;
		this.giaban = 0;
	}
	public SP(String masp, String mancc, String tensp, int sl, float giaban, Scanner sc) {
		super();
		this.masp = masp;
		this.mancc = mancc;
		this.tensp = tensp;
		this.sl = sl;
		this.giaban = giaban;
	}
	public String getMasp1() {
		return masp;
	}
	public void setMasp(String masp) {
		this.masp = masp;
	}
	public String getMancc() {
		return mancc;
	}
	public void setMancc(String mancc) {
		this.mancc = mancc;
	}
	public String getTensp() {
		return tensp;
	}
	public void setTensp(String tensp) {
		this.tensp = tensp;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}

	public float getGiaban() {
		return giaban;
	}
	public void setGiaban(float giaban) {
		this.giaban = giaban;
	}
	public void nhapSP()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Mã Sản Phẩm:");
		setMasp(sc.nextLine());
		System.out.print("Mã Nhà Cung Cấp:");
		setMancc(sc.nextLine());
		System.out.print("Tên Sản Phẩm:");
		setTensp(sc.nextLine());
//		Vòng lặp bắt sự kiện nhập sai
		while(true) {
			try {
				System.out.print("Số Lượng:");
				setSl(sc.nextInt());
				System.out.print("Giá Bán:");
				setGiaban(sc.nextFloat());
				if(getSl()<0||getGiaban()<0) throw new Exception(); 	/*số mặt hàng không âm*/
				break;
			} catch (Exception e) {
				System.out.println("Nhập sai giá trị nhập lại!");
				sc.nextLine();
			}
		}
	}
	public void hienSP()
	{
		System.out.printf("%-13s|%-20s|%-20s|%-10d|%-10.2f\n",getMasp1(),getMancc(),getTensp(),getSl(),getGiaban());
	}
}
