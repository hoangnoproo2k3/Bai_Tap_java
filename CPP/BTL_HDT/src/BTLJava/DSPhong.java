package BTLJava;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.Serializable;

public class DSPhong implements Serializable {
	ArrayList<Phong> dsP= new ArrayList<Phong>();
	
	public void nhapDSp() {
		Scanner sc= new Scanner(System.in);
		int n;
		while(true) {
			try {
				System.out.println("Nhập số lượng phòng: ");
				n=sc.nextInt();
				break;
			} catch(Exception e) {
				System.out.println("Bạn hãy nhập lại! ");
				sc.nextLine();
			}
		}
		for(int i=0;i<n;i++) {
			Phong p=new Phong();
			if(dsP.size()==0) {
				p.setSoP(0);
			}else {
				p.setSoP(dsP.size());
			}
			
			System.out.println("\nNhập thông tin phòng thứ " +(dsP.size()+1)+ ": ");
			p.nhapP();
			dsP.add(p);
		}
	}
	
	public void hienDSp() {
		System.out.printf("\n%-10s | %-20s | %-20s | %-20s","Số P","Giá P","Loại P","Trạng thái");
		for(Phong p: dsP) {
			System.out.println(p.toString());
		}
	}
}
