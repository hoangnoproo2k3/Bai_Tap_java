package BTLJava;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.Serializable;

public class DSHoaDon implements Serializable {
	ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
	Scanner sc = new Scanner(System.in);
	
	public void nhapDShd(ArrayList<KhachHang> dskh, ArrayList<NhanVien> dsnv, ArrayList<Phong> dsp) {
	 	   System.out.println("\nNhập số lượng hóa đơn: ");
	  	   int sl = sc.nextInt();
	  	   for ( int i=0;i<sl;i++ ) {
	  		  System.out.println("\n-----Thông tin hóa đơn thứ: "+(dshd.size()+1));
	  		HoaDon a = new HoaDon() ;
	  		if(dshd.size()==0) {
	  			a.setMaHD(0);
	  		}else {
	  			a.setMaHD(dshd.size());
	  		}
	  		  a.nhapHD(dskh, dsnv, dsp);
	  		  dshd.add(a);
	  	   }
	     }
	
	public void hienDShd() {
	  	   System.out.print("-----DANH SÁCH HÓA ĐƠN-----");
	  	   for(HoaDon hoadon: dshd){
	  		   hoadon.hienHD();
	  	   }
	     }
	       
	public void ghifile() throws IOException{
	        try { 
	       	  	FileOutputStream fos = new FileOutputStream("DSHD.DAT");
	       	  	ObjectOutputStream oos = new ObjectOutputStream(fos);
	  			    oos.writeObject(dshd); 
	  			    oos.close();
	       	  }
	         catch (FileNotFoundException e) {
	       	  	e.printStackTrace();
	       	  	System.out.println("\nGhi File thất bại!"+e.toString());
	         	}
	         catch(IOException e) {
	       	  	e.printStackTrace();
	         }
	     }   
	      
	public void docfile() throws IOException {
	    try {
	   		    FileInputStream fis = new FileInputStream("DSHD.DAT");
	   	    	ObjectInputStream ois = new ObjectInputStream(fis);
	   	    	ArrayList<HoaDon> ds = (ArrayList<HoaDon>) ois.readObject();
	   	    		ois.close();
	   	    		fis.close();
	   	    	dshd.clear();
	   	    	dshd=ds;
	   	    	hienDShd();
	   	   	} 
	   	 catch (ClassNotFoundException | FileNotFoundException e) {
	   		   e.printStackTrace();
	   		   System.out.println("\nĐọc File thất bại!"+e.toString());
	   	 }
    }
	       
	public void tongtien() {
		float tongtien = 0;
		for(HoaDon hoadon: dshd) {
			tongtien += hoadon.getThanhTien();
		}
		System.out.printf("\n\tTổng tiền của các hóa đơn: %.1f" ,tongtien);
	}

	 public void timkiemHD() {
  	   String ma ;
  	   sc.nextLine();
  	   System.out.print("\nNhập mã hóa đơn cần tìm: ");
  	   ma = sc.nextLine() ;
	   System.out.println("\n----THÔNG TIN HÓA ĐƠN CẦN TÌM ----");
  	   for ( HoaDon hd : dshd) {
  		   if (hd.getMaHD()==ma) {
  			   hienDShd();
  		   }   
  	       else {
  			   System.out.println("Không có mã hóa đơn cần tìm");
  	       }
  	   }
	 }
}
