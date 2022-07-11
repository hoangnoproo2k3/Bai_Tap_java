package bai7;

/**
 *
 * @author AS
 */
public class main {
    public static void main(String[] args) {
        danhSach ds=new danhSach();
        ds.nhapsodt();
        ds.hienDSDT();
        ds.maxLength();
        System.out.println("Tổng các độ dài: "+ds.tongDoDai());
    }
}
