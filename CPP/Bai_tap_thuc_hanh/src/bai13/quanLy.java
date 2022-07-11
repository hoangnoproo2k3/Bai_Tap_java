package bai13;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class quanLy extends canBo implements luong{
    private float heSo;
    private String phong;
    private String khoa;
    @Override
    public float tinhluong() {
        return (this.hsl+this.heSo)*1650000;
    }
    public void nhap() {
        
        super.nhap();
        System.out.print("Nhap Phong: ");
        this.phong =  new Scanner(System.in).nextLine();
        System.out.print("Nhap Khoa: ");
        this.khoa = new Scanner(System.in).nextLine();
        System.out.print("Nhap HSL Phu Cap: ");
        this.hsl = new Scanner(System.in).nextFloat();
    }
    public void hien(){
        super.hien();
        System.out.println("Phong: "+this.phong);
        System.out.println("Khoa: "+this.khoa);
        System.out.println("Luong: "+tinhluong());
    }
}
