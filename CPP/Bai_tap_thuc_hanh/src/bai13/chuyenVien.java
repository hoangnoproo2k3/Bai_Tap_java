package bai13;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class chuyenVien extends canBo implements luong{
    private String phong;
    @Override
    public float tinhluong() {
        return this.hsl*1650000;
    }
    public void nhap() {
        super.nhap(); 
        System.out.print("Nhap Phong: ");
        this.phong = new Scanner(System.in).nextLine();
    }

    public void hien(){
        super.hien();
        System.out.println("Phòng: "+phong);
        System.out.println("Lương: "+tinhluong());
    }
}
