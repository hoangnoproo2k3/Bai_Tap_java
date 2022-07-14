package bai15;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class HocSinh extends Nguoi implements IhoatDong,Serializable{

    private String tenLop;

    public HocSinh() {
    }

    public HocSinh(String tenLop, String hoTen, int tuoi, boolean gtinh) {
        super(hoTen, tuoi, gtinh);
        this.tenLop = tenLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String gioiThieu() {
       return "Ho ten: "+ getHoTen()+ "\t Nam sinh: "+ getTuoi()+ 
               "\t Gioi tinh:Nữ-True : Nam-False ) "+isGtinh()+ "\t Ten lop: " + getTenLop();
    }
    @Override
    public void nhap(){
         super.nhap(); 
        System.out.print("Nhap ten lop: ");
        this.tenLop = new Scanner(System.in).nextLine();
    }

}
