package testvui;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class Sach implements INhomSach{
    private String ten, ngaysx, loaisach;

    public Sach() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysx() {
        return ngaysx;
    }

    public void setNgaysx(String ngaysx) {
        this.ngaysx = ngaysx;
    }

    public String getLoaisach() {
        return loaisach;
    }

    public void setLoaisach(String loaisach) {
        this.loaisach = loaisach;
    }
    public void nhapSach(){
        System.out.println("Nhập tên: ");
        ten= new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày sản xuất: ");
        ngaysx= new Scanner(System.in).nextLine();
        
        int n;
        do{
            System.out.println("chọn loại sách: ");
            System.out.println("1. Sách giáo khoa");
            System.out.println("2. Sách bài tập");
            n= new Scanner(System.in).nextInt();
            switch (n) {
                case 1:
                    loaisach= SachGK;
                    break;
                case 2: 
                    loaisach= SachBT;
                    break;
                default:
                    break;
            }
        }while(n!=3);
    }

    @Override
    public String toString() {
        return "Sach{" + "ten=" + ten + ", ngaysx=" + ngaysx + ", loaisach=" + loaisach + '}';
    }
}
