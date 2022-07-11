package BTLHDTJava;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class main {

    public static void Menu() {
        System.out.println("\n ----------------MENU----------------- \n");
        System.out.println("1. Nhập danh sách sách: ");
        System.out.println("2. Hiện danh sách sách: ");
        System.out.println("3. Nhập danh sách độc giả đến tìm sách: ");
        System.out.println("4. Hiện danh sách độc giả: ");
        System.out.println("5. Sắp xếp độc giả theo tên: ");
        System.out.println("6. Xóa 1 độc giả khỏi danh sách: ");
        System.out.println("7. Liệt kê danh sách độc giả là nam: ");
        System.out.println("8. Sửa thông tin độc giả: ");
        System.out.println("9. Nhập danh sách hóa đơn: ");
        System.out.println("10. Hiện danh sách hóa đơn: ");
        System.out.println("11. Tính tổng thành tiền của các hóa đơn: ");
        System.out.println("12. Tìm kiếm hóa đơn theo mã hóa đơn: ");
        System.out.println("13. Ghi file: ");
        System.out.println("14. Đọc file và hiện ra danh sách hóa đơn: ");
        System.out.println("");
        System.out.println("0. Thoát chương trình! ");
    }
    public static void menuKT(){
        System.out.println("===");
        System.out.println("15. Nhập vào sách nhập");
        System.out.println("16. Hiện");
        System.out.println("17. Ghi File");
        System.out.println("18. Đọc file ");
        System.out.println("19. Xử lý giảm giá < x ");
        System.out.println("20. Chèn");
        
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        SachNhap a= new SachNhap();
        qldsSachNhap b= new qldsSachNhap();
        DSSach x = new DSSach();
        DSDocGia y = new DSDocGia();
        DSHoaDon z = new DSHoaDon();
        ArrayList<HoaDon> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
//            Menu();
            menuKT();
            System.out.print("\nMời chọn chức năng: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    x.nhapDSs();
                    break;
                case 2:
                    x.hienDSSach();
                    break;
                case 3:
                    y.nhapDSdg();
                    break;
                case 4:
                    y.hienDSdg();
                    break;
                case 5:
                    y.sapxeptheoten();
                    break;
                case 6:
                    y.xoaDG();
                    break;
                case 7:
                    y.docGiaNam();
                    break;
                case 8:
                    y.suaDG();
                    break;
                case 9:
                    z.nhapDSHD(x.dsSach, y.dsDG);
                    break;
                case 10:
                    z.hienDShd();
                    break;
                case 11:
                    z.tongTien();
                    break;
                case 12:
                    z.timKiem();
                    break;
                case 13:
                    z.ghiFile();
                    break;
                
                case 14:
                    z.hiendshdsaukhidocFile(list);
                    break;
                case 15: 
                    b.nhapdsSN();
                    break;
                case 16: 
                    b.hiendssn();
                    break;
                case 17:
                    b.ghiFile();
                    break;
                case 18:
                    b.hiendsDocFile();
                    break;
                case 19: 
                    b.xuLyDieuKien();
                    break;
                case 20:
                    b.chenThemSachNhap();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời chọn lại!!! ");
            }
        } while (chon != 0);
    }
}
