package mypham;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Menu {
    public void menu() throws IOException, FileNotFoundException, ClassNotFoundException
    {
        while(true)
        {
            label3:
            while(true)
            {
                System.out.print("\n=======================================================\n");
                System.out.print("======= CHƯƠNG TRÌNH QUẢN LÝ THÔNG TIN ĐỐI TƯỢNG,KINH DOANH MỸ PHẨM =======\n");
                System.out.print("1. Quản lý Nhân Viên                              \n");
                System.out.print("2. Quản lý Khách Hàng                              \n");
                System.out.print("3. Quản lý Sản Phẩm                                  \n");
                System.out.print("4. Quản lý Hóa Đơn                                  \n");
                System.out.print("0. Thoát khỏi chương trình                           \n");
                System.out.print("=======================================================\n");
                System.out.print("Nhập lựa chọn của bạn: ");
                
                Scanner sc = new Scanner(System.in);
                int chon = sc.nextInt();
                int k;
                switch(chon)
                {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        DanhSachNhanVien a = new DanhSachNhanVien();
                        while(true)
                        {
                            if(chon == -99)
                            {
                                continue label3;
                            }
                            System.out.print("\n=============================\n");
                            System.out.print("QUẢN LÝ ĐỐI TƯỢNG NHÂN VIÊN\n");
                            System.out.print("1. Thêm một nhân viên\n");
                            System.out.print("2. Thêm danh sách nhân viên\n");
                            System.out.print("3. In Danh sách nhân viên\n");
                            System.out.print("4. Xoá một đối tượng khỏi danh sách nhân viên\n");
                            System.out.print("5. Tìm một đối tượng trong danh sách nhân viên\n");
                            System.out.print("6. sắp xếp các đối tượng theo lương\n");
                            System.out.print("7. Ghi danh sách Nhân Viên vào file\n");
                            System.out.print("8. Đọc danh sách Nhân Viên từ file\n");
                            System.out.print("9. Trở về Menu chính\n");
                            System.out.print("0. Thoát khỏi chương trình\n");
                            System.out.print("Nhập lựa chọn của bạn: ");
                            k = sc.nextInt();
                            System.out.println("\n---------------------------- \n");
                            switch(k)
                            {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    a.nhap();
                                    break;
                                case 2:
                                    a.nhapdsnv();
                                    break;
                                case 3:
                                    System.out.println("\n\tDANH SÁCH NHÂN VIÊN\n");
                                    System.out.println("\n\t=================== \n");
                                    a.hiendsnv();
                                    break;
                                case 4:
                                    a.Xoa1NV();
                                    break;
                                case 5:
                                    a.Tim1NV();
                                    break;
                                case 6:
                                    System.out.println("DANH SÁCH SAU KHI ĐÃ SẮP XẾP LÀ:");
                                    a.SapXepLuong();
                                    break;
                                case 7:
                                    a.ghifileNV();
                                    break;
                                case 8:
                                    a.docfileNV();
                                    break;
                                case 9:
                                    chon = -99;
                                case 10:
                                {
                                    a.nhapnvbv();
                                    a.hiennvbv();
                                    System.out.println("Da nhap xong nhan vien la bao ve");
                                }
                            }
                        }
                        case 2:
                        DanhSachKhachHang b = new DanhSachKhachHang();
                        while(true)
                        {
                            if(chon == -99)
                            {
                                continue label3;
                            }
                            System.out.print("\n=============================\n");
                            System.out.print("QUẢN LÝ ĐỐI TƯỢNG KHÁCH HÀNG\n");
                            System.out.print("1. Thêm một Khách Hàng\n");
                            System.out.print("2. Thêm danh sách Khách Hàng\n");
                            System.out.print("3. In Danh sách Khách hàng\n");
                            System.out.print("4. Xoá một đối tượng khỏi danh sách Khách Hàng\n");
                            System.out.print("5. Tìm một đối tượng trong danh sách Khách Hàng\n");
                            System.out.print("6. Sắp xếp các đối tượng theo mã khách hàng\n");
                            System.out.print("7. Ghi danh sách Khách Hàng vào file\n");
                            System.out.print("8. Đọc danh sách Khách Hàng từ file\n");
                            System.out.print("9. Trở về Menu chính\n");
                            System.out.print("0. Thoát khỏi chương trình\n");
                            System.out.print("Nhập lựa chọn của bạn: ");
                            k = sc.nextInt();
                            System.out.println("\n---------------------------- \n");
                            switch(k)
                            {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    b.nhap();
                                    break;
                                case 2:
                                    b.nhaphskh();
                                    break;
                                case 3:
                                    System.out.println("\n\tDANH SÁCH KHÁCH HÀNG\n");
                                    System.out.println("\n\t===================== \n");
                                    b.hiendskh();
                                    break;
                                case 4:
                                    b.Xoa1KH();
                                    break;
                                case 5:
                                    b.Tim1KH();
                                    break;
                                case 6:
                                    System.out.println("DANH SÁCH SAU KHI ĐÃ SẮP XẾP LÀ");
                                    b.SapXepMaKH();
                                    break;
                                case 7:
                                    b.ghifileKH();
                                    break;
                                case 8:
                                    b.docfileKH();
                                    break;
                                case 9:
                                    chon = -99;
                                 
                            }
                        }
                        case 3:
                        DanhSachSanPham c = new DanhSachSanPham();
                        while(true)
                        {
                            if(chon == -99)
                            {
                                continue label3;
                            }
                            System.out.print("\n=============================\n");
                            System.out.print("QUẢN LÝ ĐỐI TƯỢNG SẢN PHẨM\n");
                            System.out.print("1. Thêm một Sản Phẩm\n");
                            System.out.print("2. Thêm danh sách Sản Phẩm\n");
                            System.out.print("3. In Danh sách Sản Phẩm\n");
                            System.out.print("4. Xoá một đối tượng khỏi danh sách sản phẩm\n");
                            System.out.print("5. Tìm một đối tượng trong danh sách sản phẩm\n");
                            System.out.print("6. Sắp xếp các đối tượng theo thành tiền sản phẩm\n");
                            System.out.print("7. Ghi danh sách Sảm Phẩm vào file\n");
                            System.out.print("8. Đọc danh sách Sảm Phẩm từ file\n");
                            System.out.print("9. Trở về Menu chính\n");
                            System.out.print("0. Thoát khỏi chương trình\n");
                            System.out.print("Nhập lựa chọn của bạn: ");
                            k = sc.nextInt();
                            System.out.println("\n---------------------------- \n");
                            switch(k)
                            {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    c.nhap();
                                    break;
                                case 2:
                                    c.nhapds();
                                    break;
                                case 3:
                                    System.out.println("\n\tDANH SÁCH SẢN PHẨM\n");
                                    System.out.println("\n\t=================== \n");
                                    c.hiends();
                                    break;
                                case 4:
                                    c.Xoa1SP();
                                    break;
                                case 5:
                                    c.Tim1SP();
                                    break;
                                case 6:
                                    System.out.println("DANH SÁCH SAU KHI SẮP XẾP LÀ");
                                    c.SapXepthanhtienSP();
                                    break;
                                case 7:
                                    c.ghifileSP();
                                    break;
                                case 8:
                                    c.docfileSP();
                                    break;
                                case 9:
                                    chon = -99;
                                 
                            }
                        }
                        case 4:
                        DanhSachHoaDon d = new DanhSachHoaDon();
                        while(true)
                        {
                            if(chon == -99)
                            {
                                continue label3;
                            }
                            System.out.print("\n=============================\n");
                            System.out.print("QUẢN LÝ ĐỐI TƯỢNG HÓA ĐƠN\n");
                            System.out.print("1. Thêm một Hóa Đơn\n");
                            System.out.print("2. Thêm danh sách Hóa Đơn\n");
                            System.out.print("3. In Danh sách Hóa Đơn\n");
                            System.out.print("4. Xoá một đối tượng khỏi danh sách hóa đơn\n");
                            System.out.print("5. Tìm một đối tượng trong danh sách hóa đơn\n");
                            System.out.print("6. sắp xếp các đối tượng theo tổng tiền hóa đơn\n");
                            System.out.print("7. Lọc các hóa đơn trên 2tr\n");
                            System.out.print("8. Tổng tiền tất cả hóa đơn\n");
                            System.out.print("9. Ghi danh sách hóa đơn vào file\n");
                            System.out.print("10.Đọc danh sách hóa đơn từ file\n");
                            System.out.print("11.Trở về Menu chính\n");
                            System.out.print("0. Thoát khỏi chương trình\n");
                            System.out.print("Nhập lựa chọn của bạn: ");
                            k = sc.nextInt();
                            System.out.println("\n---------------------------- \n");
                            switch(k)
                            {
                                case 0:
                                    System.exit(0);
                                    break;
                                case 1:
                                    d.them();
                                    break;
                                case 2:
                                    d.nhap();
                                    break;
                                case 3:
                                    System.out.println("\n\tDANH SÁCH HÓA ĐƠN \n");
                                    System.out.println("\n\t=================== \n");
                                    d.hien();
                                    break;
                                case 4:
                                    d.XoaHD();
                                    break;
                                case 5:
                                    d.timhoadon();
                                    break;
                                case 6:
                                    System.out.println("DANH SÁCH SAU KHI SẮP XẾP LÀ:");
                                    d.xapxepHD();
                                    break;
                                case 7:
                                    d.locHD();
                                    break;
                                case 8:
                                    d.tongtien();
                                    break;
                                case 9:
                                    d.ghifileHD();
                                    break;
                                case 10:
                                    d.docfileHD();
                                    break;
                                case 11:
                                    chon = -99;
                                 
                            }
                        }
                }
            }
            
        }
    }
    public static void main(String[] args) {
        dsKHvip ds= new dsKHvip();
        ds.nhapdskhv();
        
        ds.hiends();
        ds.chietKhauMax();
    }
}
