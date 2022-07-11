package QuanLyThue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class index {
	public static void main(String  ags[]) throws IOException, FileNotFoundException, ClassNotFoundException  {
		Scanner sc = new Scanner(System.in);
		DSTK tk = new DSTK();
//		tk.menu();
//                toKhaiThue x= new toKhaiThue();
//                x.nhapTK();
//                x.xuatTK();
                dsToKhaiThue ds= new dsToKhaiThue();
                ds.nhapds();
                ds.hiends();
                ds.ghiFile();
                ds.doctuFile();
	}
}
