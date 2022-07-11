package bai11;

public class test {
    public static void main(String[] args) {        
        danhsach dsbll = new danhsach();
        dsbll.nhapDanhSach();
        System.out.println("====Danh sách vừa nhập====");
        dsbll.hienDanhSach();
        System.out.println("====Thông tin người bị xóa====");
        dsbll.xoaNguoi();
        System.out.println("====Sắp xếp theo họ tên====");
        dsbll.sapXepTheoHoTen();
    }
}
