package BTLJava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BTL_main {
	public static void Menu() {
		System.out.println("\n ----------------MENU----------------- \n");
		System.out.println("1. Nhập danh sách phòng: ");
		System.out.println("2. Hiện danh sách phòng: ");
		System.out.println("3. Nhập danh sách nhân viên: ");
		System.out.println("4. Hiện danh sách nhân viên: ");
		System.out.println("5. Sắp xếp danh sách nhân viên theo tên: ");
		System.out.println("6. Liệt kê danh sách nhân viên có lương trên 2000000: ");
		System.out.println("7. Xóa 1 nhân viên khỏi danh sách: ");
		System.out.println("8. Nhập danh sách khách hàng: ");
		System.out.println("9. Hiện danh sách khách hàng: ");
		System.out.println("10. Sắp xếp danh sách khách hàng theo tên: ");
		System.out.println("11. Liệt kê danh sách khách hàng là nữ: ");
		System.out.println("12. Xóa 1 khách hàng khỏi danh sách: ");
		System.out.println("13. Nhập danh sách hóa đơn: ");
		System.out.println("14. Hiện danh sách hóa đơn: ");
		System.out.println("15. Tìm kiếm hóa đơn theo mã hóa đơn: ");
		System.out.println("16. Tính tổng thành tiền của các hóa đơn: ");
		System.out.println("17. Ghi file: ");
		System.out.println("18. Đọc file: ");
		System.out.println("0. Thoát chương trình! ");
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		DSPhong dsp= new DSPhong();
		DSNhanVien dsnv= new DSNhanVien();
		DSKhachHang dskh= new DSKhachHang();
		DSHoaDon dshd= new DSHoaDon();
		int chon;
		do {
			Menu();
			while(true) {
				try {
					System.out.print("\nMời chọn chức năng: ");
					chon=Integer.parseInt(sc.nextLine());
					break;
				} catch(Exception e) {
					System.out.println("Bạn hãy nhập lại! ");
					sc.nextLine();
				}
			}
			switch(chon) {
			case 1: dsp.nhapDSp(); break;
			case 2: dsp.hienDSp(); break;	
			case 3: dsnv.nhapDSnv(); break;
			case 4: dsnv.hienDSnv(); break;
			case 5: dsnv.sxDSNVtheoten(); break;
			case 6: dsnv.lietkenvcoluongtren2000000(); break;
			case 7: dsnv.xoaNV(); break;
			case 8: dskh.nhapDSkh(); break;
			case 9: dskh.hienDSkh(); break;
			case 10: dskh.sxDSKHtheoten(); break;
			case 11: dskh.lietkekhGTnu(); break;
			case 12: dskh.xoaKH(); break;
			case 13: dshd.nhapDShd(dskh.dsKH, dsnv.dsNV, dsp.dsP); break;
			case 14: dshd.hienDShd(); break;
			case 15: dshd.timkiemHD(); break;
			case 16: dshd.tongtien(); break;
			case 17: dshd.ghifile(); break;
			case 18: dshd.docfile(); break;
			case 0: System.exit(0); break;
			default: System.out.println("Mời chọn lại!!! ");
			}
		} while(chon!=0);
	}
}
