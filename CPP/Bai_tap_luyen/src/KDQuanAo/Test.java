package KDQuanAo;

import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void Menu() {
		System.out.println("\n---------MENU---------\n");
		System.out.println("1. Nhap danh sach nhan vien va luu file");
		System.out.println("2. Hien danh sach nhan vien");
		System.out.println("3. Nhap danh sach san pham va luu file");
		System.out.println("4. Hien danh sach san pham");
		System.out.println("5. Nhap danh sach khach hang va luu file");
		System.out.println("6. Hien danh sach khach hang");
		System.out.println("7. Nhap danh sach hoa don va luu file");
		System.out.println("8. Hien danh sach hoa don");
		System.out.println("9. Them 1 hoa don moi vao file  ");
		System.out.println("10. Sap xep theo gia tien");
		System.out.println("11. Tim kiem 1 hoa don");
		System.out.println("12. Xoa 1 hoa don");
		System.out.println("13. Hoa don max");
		System.out.println("0. Thoat chuong trinh!");
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DSNhanVien dsnv = new DSNhanVien();
		DSSanPham dssp = new DSSanPham();
		DSKhachHang dskh = new DSKhachHang();
		XuLyHoaDon xlhd = new XuLyHoaDon();
		int chon;
		do {
			Menu();
			System.out.println("\nMoi ban chon chuc nang!");
			chon = new Scanner(System.in).nextInt();
			switch(chon) {
			case 1:
				dsnv.nhapDSNV();
				dsnv.ghiFileNV();
				break;
			case 2:
				dsnv.docFileNV();
				dsnv.hienDSNV();
				break;
			case 3:
				dssp.nhapDSSP();
				dssp.ghiFileSP();
				break;
			case 4:
				dssp.docFileSP();
				dssp.hienDSSP();
				break;
			case 5:
				dskh.nhapDSKH();
				dskh.ghiFileKH();
				break;
			case 6:
				dskh.docFileKH();
				dskh.hienDSKH();
				break;
			case 7:
				xlhd.nhapDSHD();
				xlhd.ghiFileHD();
				break;
			case 8:
				xlhd.docFileHD();
				xlhd.hienDSHD();
				break;
			case 9:
				xlhd.themHoaDon();
				break;
			case 10:
				xlhd.sapXepHoaDon();
				break;
			case 11:
				xlhd.timKiemHD();
				break;
			case 12:
				xlhd.xoa();
				break;
			case 13:
				xlhd.docFileHD();
				xlhd.HDMax();
				break;
			case 0:
				System.exit(0);
				break;
			default: 
				System.out.println("Moi chon lai!");
			}
		}while(chon!=0);
	}

}
