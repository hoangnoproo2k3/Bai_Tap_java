package QuanLyThue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.*;

public class DSTK {
	ArrayList<ToKhai> listtk;
	
	public void nhapDS() {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("NHAP SO LUONG TO KHAI: ");
		n=sc.nextInt();
		listtk = new ArrayList();
		for(int i=0;i<n;i++) {
			ToKhai x= new ToKhai();
			System.out.println("NHAP TO KHAI THU " + (i+1) + " : ");
			x.nhapTK();
			listtk.add(x);
		}
	}
	public void xuatDS() {
		System.out.print("\n DSTK: ");
		int i=0;
		for(ToKhai x: listtk) {
			System.out.println("==>>TO KHAI THU " + (i+1));
			i++;
			x.xuatTK();
		}
	}
	public void sapsepTK() {
		Collections.sort(listtk, new Comparator<ToKhai>() {
	        @Override
	        public int compare(ToKhai tk1, ToKhai tk2) {
	            return  tk1.getMaTK().compareTo(tk2.getMaTK());
	        }
	    });
		System.out.println("\nDanh sach to khai sau khi sap xep la: ");
		xuatDS();
	}
	public void xoatheomaTK() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap ma to khai can xoa: ");
		String mtk = sc.nextLine();
			int i_mtk=-1;
		for(ToKhai tk :listtk) {
			if(tk.getMaTK().equalsIgnoreCase(mtk)==true) {
				i_mtk = listtk.indexOf(tk);			
				System.out.println("\nXoa to khai thanh cong");
				break;
			}
		}
		if (i_mtk==-1)
			System.out.print("\n Khong tim thay to khai");
		else
			listtk.remove(i_mtk);
		
	}
	public void inTK() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma to khai: ");
        String mtk = sc.nextLine();
        for (ToKhai tk : listtk) {
            if (tk.getMaTK().equalsIgnoreCase(mtk)) {
                tk.xuatTK();
            }
        }
	}
	public void themTK() {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap so luong to khai ban muon them: ");
	        int them = sc.nextInt();
	        System.out.println("NHAP THONG TIN TO KHAI BAN MUON THEM ");
	        for(int i=0;i<them;i++)
	        {
	            System.out.println("THEM TO KHAI THU "+(i+1));
	            ToKhai tk = new ToKhai();
	            tk.nhapTK();
	            listtk.add(tk);
	        }
	        System.out.println("DANH SACH SAU KHI THEM!!");
	        for(ToKhai h :listtk){
	            h.xuatTK();
	        }
	}
	public void suaTK() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma to khai ban muon sua: ");
		String mtk = sc.nextLine();
		for(ToKhai tk : listtk){
            if(tk.getMaTK().equalsIgnoreCase(mtk)){
                System.out.println("Nhap ma to khai moi: ");
                tk.setMaTK(sc.nextLine());
                System.out.println("Nhap ngay lap to khai moi: ");
                tk.setNgay(sc.nextLine());
            }
		} 
		System.out.println(" DANH SACH TO KHAI SAU KHI SUA");
        for(ToKhai tk : listtk){
            tk.xuatTK();
        }
	}
	public void lietke() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thu nhap N: ");
		float n = sc.nextFloat();
        int dem = 0;
        for(ToKhai tk : listtk){
            if(n < tk.getTN()){
                System.out.println("==>>TO KHAI CO THU NHAP > " +n+ ": ");
                tk.xuatTK();
                dem ++;
            }
        }
        if(dem==0)
        {
            System.out.println("Khong co to khai nao co thu nhap > "+n);
        }
	}
	public void diemTK() {
		Scanner sc = new Scanner(System.in);
		int dem = 0;
        System.out.println("Nhap so tien thue phai nop M: ");
        float m = sc.nextFloat();
        for(ToKhai tk : listtk){
            if(m<tk.soTienNop())
            {
                dem ++;
            }
        }
        System.out.println("==>> so luong to khai co so tien thieu phai nop > M :"+dem);
	}
	public void ghiFile() throws IOException {
		 try
	        {
			 File fname = new File("tokhai.dat");
	            FileOutputStream fout = new FileOutputStream(fname);
	            ObjectOutputStream out = new ObjectOutputStream(fout);
	            out.writeObject(listtk);
	            System.out.println("Ghi file thanh cong!");
	            out.close();
	            fout.close();
	        }
	        catch(Exception ex)
	        {
	            ex.printStackTrace();
	        }
	}
	public void docFile() {
		try
        {
			File fname = new File("tokhai.dat");
            FileInputStream fin = new FileInputStream(fname);
            ObjectInputStream fon = new ObjectInputStream(fin);
            listtk=(ArrayList)fon.readObject();
            fon.close();
            fin.close();
            System.out.println("//Du lieu đuoc lay trong file!//");
        }catch(FileNotFoundException e)
        {
            System.out.println("Khong tim thay file!");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
	}
	
	public void menu() throws IOException {
		Scanner sc = new Scanner(System.in);
		 int chon;
	        do {
	            System.out.println("\n |=====================MENU=====================================|");
	            System.out.println(" | 1. Nhap thong tin vao danh sach và luu vao file tokhai.dat   |");
	            System.out.println(" | 2. In danh sach va đoc thong tin tu file tokhai.dat          |");
	            System.out.println(" | 3. Sap xep danh sach to khai theo ma to khai                 |");
	            System.out.println(" | 4. Xoa to khai theo ma to khai                               |");
	            System.out.println(" | 5. In to khai theo ma to khai                                |");
	            System.out.println(" | 6. Sua to khai theo ma to khai                               |");
	            System.out.println(" | 7. Them to khai vao danh sach to khai                        |");
	            System.out.println(" | 8. Liet ke to khai co thu nhap > N                           |");
	            System.out.println(" | 9. Diem so to khai co tien thue > M                          |");
	            System.out.println(" | 0. Thoat                                                     |");
	            System.out.println(" |==============================================================|");
	            System.out.println("          Moi ban chon (0~9):");
	            chon = sc.nextInt();
	            switch(chon)
	            {
	                case 1:
	                    nhapDS();
	                    ghiFile();
	                    break;
	                case 2:
	                    docFile();
	                	xuatDS();
	                    break;
	                case 3: sapsepTK();break;
	                case 4:
	                	
//	                	System.out.print("Nhap ma to khai can xoa: ");
//	            		String n = sc.nextLine();
	            		xoatheomaTK();
	            		System.out.println("nDanh sach to khai su khi xoa: ");
	            		xuatDS();
	                    break;
	                case 5: inTK();  break;
	                case 6: suaTK(); break;
	                case 7: themTK();break;
	                case 8: lietke();break;
	                case 9: diemTK();break;
	                case 0: 
	                	System.out.println("Ban co chac chan muon thoat?");
	                	System.out.println("Neu muon thoat moi ban an: 0");	
	                	System.out.println("Neu ban muon tiep tuc an : 1");
	                	int m = sc.nextInt();
	                	if(m==1) {
	                		chon=1;
	                	}
	                	break;
	            }
	        }
	        while(chon !=0);
	}
}


  















