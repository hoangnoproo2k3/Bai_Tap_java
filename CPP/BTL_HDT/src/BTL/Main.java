/* quản lí cửa hàng bán mĩ phẩm*/

package BTL;

import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DSHD ds = new DSHD();
		while(true) Menu(ds);
	}

//	Menu điều khiển chương trình
	private static void Menu(DSHD ds) throws Exception {
		int c;
		println("\n---Menu---");
		println("1-Thêm danh sách hóa đơn.");
		println("2-Thêm từng hóa đơn.");
		println("3-Hiện danh sách hóa đơn.");
		println("4-Tìm kiếm hóa đơn theo mã.");
		println("5-Xóa hóa đơn theo mã.");
		println("6-Tổng tiền tất cả các hóa đơn.");
		println("7-Sắp xếp hóa đơn theo tổng tiền.");
		println("8-Danh sách hóa đơn có tổng tiền trên 2000000.");
		println("9-Ghi File.");
		println("10-Đọc File.");
		println("0-Thoát.");
		
		System.out.print("Nhập lệnh: ");
		
		
//		Vòng lặp bắt sự kiện nhập sai
		while(true) {
			try {
				c=sc.nextInt();
				if(!(c>=0&&c<=10)) throw new Exception(); /*Nếu không từ 0 đến 10 thì nhập lại*/
				break;
			} catch (Exception e) {
				System.out.print("Chỉ được phép nhập lệnh theo mẫu, nhập lại: ");
				sc.nextLine();
			}
		}
		
		
		switch (c) {
		case 1: ds.nhapds(); break;
		case 2: ds.them(); break;
		case 3: ds.hiends(); break;
		case 4: ds.timkiem(); break;
		case 5: ds.xoa(); break;
		case 6: ds.tinhtong(); break;
		case 7: ds.sapxep(); break;
		case 8: ds.loctren2tr(); break;
		case 9: ds.GhiFile(); break;
		case 10: ds.DocFile(); break;
		case 0: println("Chương trình kết thúc!"); System.exit(0); 
		}
	}
	
//	Hàm rút gọn thao tác hiện
	private static void println(String n) {
		System.out.println(n);
	}
}
