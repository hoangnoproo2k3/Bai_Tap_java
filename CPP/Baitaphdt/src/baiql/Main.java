/*Viết chương trình quản lý điểm của một lớp tín chỉ, yêu cầu
Nhập và in lại danh sách SV đó
Cho biết tên sinh viên có Điểm học phần <4
…
Lưu DSSV vào file “sinhvien.dat”
Đọc DSSV từ file “sinhvien.dat”
Yêu cầu: Sử dụng ArrayList để lưu danh sách các sinh viên, bang điểm theo mẫu*/
package baiql;

/**
 *
 * @author AS
 */

public class Main {
    public static void main(String[] args) {
        Bangdiem lthdt = new Bangdiem();
        lthdt.NhapBD();
        lthdt.XuatBD();
        lthdt.Sinhvienhoclai();
        lthdt.SapxepDSSV();
    }
}
