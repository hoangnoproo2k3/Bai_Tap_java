package bai13;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class chuyenVien extends canBo implements tinhLuong{
    private String phong;
    public void nhap(){
        super.nhap();
        System.out.print("Nhập phòng: ");
        phong= new Scanner(System.in).next();
    }
    
    @Override
    public float tienLuong() {
        return this.hsl*1650000;
    }
    
    public void hien(){
        super.hien();
        System.out.print("\t Phòng: "+ phong+"\t Tiền lương: "+tienLuong()+"\n");
    }
}
