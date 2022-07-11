package bai13;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class giangVien extends canBo implements tinhLuong{
    private String khoa;
    public void nhap(){
        super.nhap();
        System.out.print("Nhập khoa: ");
        khoa= new Scanner(System.in).next();
    }

    @Override
    public float tienLuong() {
        return (float) (this.hsl*1650000*(1+0.02));
    }
    public void hien(){
        super.hien();
        System.out.print("\t Khoa: "+khoa+"\t Tiền lương: "+tienLuong()+"\n");
    }
}
