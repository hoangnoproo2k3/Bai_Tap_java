package bai4;


public class mainBai4 {
    public static void main(String[] args) {
        danhSach a= new danhSach();
        a.nhapDs();
        System.out.println("ID"+"    "+"Tên"+"\t\t\t\t"+"Lớp"+"\t \t"+"Số buổi ăn"+"\t"+"Tiền");
        a.hienDs();
        a.tongTien();
        System.out.println("Sau khi sắp xếp tăng dần theo tiền");
        a.sapXep();
        System.out.println("Danh sách có số buổi ăn trên 20 buổi");
        a.tesT();
    }
}
