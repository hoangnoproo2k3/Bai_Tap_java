/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btlhuongdoituong;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author VHC
 */
public class Btlhuongdoituong {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) throws IOException, ClassNotFoundException {
      
        DSCongAn dsca = new DSCongAn();
        DSDoiTuong dt = new DSDoiTuong();
        xulyVuAn iva = new xulyVuAn();
        VuAn va = new VuAn();
        int chon;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("-> 1. Nhập danh sách các công an và ghi vào file DANHSACHCÔNGAN.dat ");
            System.out.println("-> 2. Đọc file DANHSACHCONGAN.dat và in kết quả ra mà hình");
            System.out.println("-> 3. Nhập danh sách các đối tượng trong vụ án và ghi vào file DANHSACHDOiTUONGTRONGVUAN.dat");
            System.out.println("-> 4. Đọc file DANHSACHDOiTUONGTRONGVUAN.dat và in kết quả ra mà hình");
            System.out.println("-> 5. Nhập thông tin bảng nguyện vọng và ghi vào file DANHSACHTHONGTINTUYENSINH.dat");
            System.out.println("-> 6. Đọc thông tin từ file DANHSACHTHONGTINTUYENSINH.dat và in ra mà hình kết quả");
            System.out.println("-> 7. Kết quả trúng tuyển của tất cả thí sinh");
            System.out.println("-> 8. Thêm bảng thông tin và ghi file DANHSACHTHONGTINTUYENSINH.dat");
            System.out.println("-> 9. Xóa 1 bảng thông tin theo số báo danh của thí sinh và ghi file DANHSACHTHONGTINTUYENSINH.dat");
            System.out.println("-> 10. Tìm kiếm thông tin của các thí sinh theo giới tính");
            System.out.println("-> 11. Tra cứu kết quả theo số báo danh");
            System.out.println("-> 12. Tìm thủ khoa của trường");
            System.out.println("-> 13. Tìm khoa lấy điểm đầu vào cao nhất");
            System.out.println("-> 14. Số lượng thí sinh đăng kí vào ngành (khoa) được nhập từ bàn phím");
            System.out.println("-> 15. Nhấn số khác bất kì để thoát chương trình");
            System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.print("Mời chọn option: ");
            chon = input.nextInt();
            switch (chon) {
                case 1: {
                    dsca.nhapDSCA();
                    dsca.ghiFileDSCongAn();
                    break;
                }
                case 2: {
                    dsca.hienDSCA();
                    break;
                }
                case 3: {
                   iva.nhapDSDTVA();
                    break;
                }
                case 4: {
                   
                    break;
                }
//                case 5: {
//                    lTuyenSinh.nhapDSTT();
//                    lTuyenSinh.ghiFileDSTT();
//                    break;
//                }
//                case 6: {
//                    lTuyenSinh.hienDSTT();
//                    break;
//                }
//                case 7: {
//                    lTuyenSinh.ketQuaTrungTuyen();
//                    break;
//                }
//                case 8: {
//                    lTuyenSinh.themThongTin();
//                    break;
//                }
//                case 9: {
//                    lTuyenSinh.xoaThongTin();
//                    break;
//                }
//                case 10: {
//                    lTuyenSinh.thongTinThiSinhTheoGioiTinh();
//                    break;
//                }
//                case 11: {
//                    lTuyenSinh.traCuuKetQuaTheoSoBaoDanh();
//                    break;
//                }
//                case 12: {
//                    lTuyenSinh.timThuKhoa();
//                    break;
//                }
//                case 13: {
//                    lTuyenSinh.timKhoaCoDiemDauVaoCaoNhat();
//                    break;
//                }
//                case 14: {
//                    System.out.println(lTuyenSinh.demSoThiSinhDangKyVaoKhoa());
//                    break;
//                }
                default:
                    System.out.println("Cảm ơn đã sử dụng!");
                    System.exit(0);
            }
        } while (true);
    }
 

    
}

