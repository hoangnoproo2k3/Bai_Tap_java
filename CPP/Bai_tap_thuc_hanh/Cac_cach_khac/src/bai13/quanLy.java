package bai13;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class quanLy extends canBo implements tinhLuong{
    private float hstroCap;
    private String khoa;
    private String phongBan;
    public void nhap(){
        super.nhap();
        System.out.print("Nhập hs trợ cấp: ");
        hstroCap= new Scanner(System.in).nextFloat();
        System.out.print("Nhập khoa: ");
        khoa= new Scanner(System.in).next();
        System.out.println("Nhập phòng ban: ");
        phongBan= new Scanner(System.in).next();
    }

    @Override
    public float tienLuong() {
        return (this.hsl+hstroCap)*1650000;
    }
    public void hien(){
        super.hien();
        System.out.print("\t Hệ số trợ cấp: "+hstroCap+"\t Khoa: "+khoa+"\t Phòng ban: "+phongBan+"\t Tiền lương: "+tienLuong()+"\n");
    }
}
