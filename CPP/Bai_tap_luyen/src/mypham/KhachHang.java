package mypham;

import java.io.Serializable;
import java.util.Scanner;

public class KhachHang extends Person implements Serializable{
    public String mathue;

    public KhachHang(String mathue, String ma, String ten, String diachi, String SDT) {
        super(ma, ten, diachi, SDT);
        this.mathue = mathue;
        
    }

    public KhachHang() {
    }

    public String getMathue() {
        return mathue;
    }

    public void setMathue(String mathue) {
        this.mathue = mathue;
    }
    // thực hiện phương thức 
    public void nhapkh()
    {
        Scanner sc= new Scanner(System.in);
        super.nhapps();
        System.out.print("Nhập mã thuế: ");
        mathue=sc.nextLine();
    }
    public void table()
    {
        System.out.printf("%20s %20s %20s %20s", "Mã", "Tên","Địa chỉ", "SDT");
        System.out.printf("%20s", "Mã thuế\n");
    }
    public void hienkh()
    {
        super.hienps();
        System.out.printf("%20s",mathue);
    }
    
    
}
