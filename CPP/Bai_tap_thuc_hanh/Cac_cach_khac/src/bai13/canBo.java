package bai13;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class canBo {
    private String ten;
    private String maThe;
    private String gioiTinh;
    private int tuoi;
    float hsl;

    public float getHsl() {
        return hsl;
    }

    public canBo() {
    }

    public canBo(String ten, String maThe, String gioiTinh, int tuoi, float hsl) {
        this.ten = ten;
        this.maThe = maThe;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.hsl = hsl;
    }

    
    public void nhap(){
        System.out.print("Nhập têm: ");
        ten= new Scanner(System.in).nextLine();
        System.out.print("Nhập mã thẻ: ");
        maThe = new Scanner(System.in).next();
        System.out.print("Nhập giới tính: ");
        gioiTinh= new Scanner(System.in).next();
        System.out.print("Nhập tuổi: ");
        tuoi= new Scanner(System.in).nextInt();
        System.out.print("Nhập HSL: ");
        hsl= new Scanner(System.in).nextFloat();
    }

    public void hien(){
        System.out.print("Tên: "+ten+"\t Mã thẻ: "+maThe+"\t Giới tính: "+gioiTinh+"\t Tuổi: "+tuoi+"\t HSL: "+hsl);
    }
}
