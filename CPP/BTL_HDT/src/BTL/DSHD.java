package BTL;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class DSHD {
	ArrayList<HD> array=new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void nhapds() {
		int n;
		System.out.print("Nhập số lương hóa đơn: "); 
//		Vòng lặp bắt sự kiện nhập sai
		while(true) {
			try {
				n=sc.nextInt();
				if(n<=0) throw new Exception(); 	/*số hóa đơn phải >0*/
				break;
			} catch (Exception e) {
				System.out.print("Nhập sai giá trị nhập lại: ");
				sc.nextLine();
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("----------------------------");
			System.out.println("Nhập hóa đơn thứ "+(i+1));
			HD hd = new HD();
			hd.nhap();
			array.add(hd);
		}
	}
	
	public void hiends() {
		System.out.println("\nDanh sách hóa đơn:");
		for(HD hd:array) {
			System.out.println("----------------------------");
			System.out.print("Hóa đơn thứ "+(array.indexOf(hd)+1));
			hd.hien();
		}
	}
	
	public void timkiem() {
		String x;
		sc.nextLine();
		System.out.print("Nhập mã hóa đơn muốn tìm: "); x=sc.nextLine();
		for(HD hd:array) {
			if(hd.getMahd().equals(x)) {
				System.out.println("\nThông tin hóa đơn cần tìm:");
				System.out.print("----------------------------");
				hd.hien();
				break;
			}
		}
	}
	
	public void tinhtong() {
		int tong=0;
		for(HD hd:array) {
			tong+=hd.tinhtong();
		}
		System.out.println("Tổng tiền các hóa đơn: "+tong);
	}
	
	public void sapxep() {
		Collections.sort(array);
		System.out.println("\nSắp xếp theo tổng tiền tăng dần: ");
		hiends();
	}
	
	public void xoa() {
		String x;
		int i, k=0;
		System.out.println("Nhập mã muốn xóa: "); x=sc.nextLine();
		for(i=0;i<array.size();i++) {
			if(array.get(i).getMahd().equals(x)) {
				array.remove(i);
				k=1;
				break;
			}
		}
		if(k==0) System.out.println("Không có mã hóa đơn này!");
		else {
			System.out.println("Danh sách sau khi xóa:");
			hiends();
		}
	}
	
	public void them() {
		HD hd = new HD();
		hd.nhap();
		array.add(hd);
	}
	
	public void loctren2tr() {
		System.out.println("Danh sách hóa đơn có tổng giá trị trên 2 triệu:");
		for(HD hd:array) {
			if(hd.tinhtong()>2000000) {
				System.out.println("----------------------------");
				hd.hien();
			}
		}
	}
	
	public void GhiFile() throws Exception {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\My Computer\\Desktop\\DSHD.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		try {
		for(HD hd:array) {
			out.writeObject(hd);
		}
		}catch (Exception e) {
			// TODO: handle exception
			out.close();
			fout.close();
		}
		System.out.println("Ghi thành công");
	}
	
	public void DocFile() throws Exception {
		FileInputStream fin = new FileInputStream("C:\\Users\\My Computer\\Desktop\\DSHD.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		try {	
		array.clear();
		HD hd =null;
		while ((hd=(HD) in.readObject())!=null) {
			array.add(hd);
		  }
		}catch (Exception e) {
			// TODO: handle exception
			in.close();
			fin.close();
		}
		System.out.println("Đọc file thành công");
	}
}