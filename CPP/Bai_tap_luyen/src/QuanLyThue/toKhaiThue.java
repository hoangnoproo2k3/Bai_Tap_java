package QuanLyThue;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class toKhaiThue extends ToKhai implements Serializable{
    private String loaihinhKD;
    private float mucThue;

    public toKhaiThue() {
    }

    public toKhaiThue(String loaihinhKD, float mucThue) {
        this.loaihinhKD = loaihinhKD;
        this.mucThue = mucThue;
    }

    public String getLoaihinhKD() {
        return loaihinhKD;
    }

    public void setLoaihinhKD(String loaihinhKD) {
        this.loaihinhKD = loaihinhKD;
    }

    public float getMucThue() {
        return mucThue;
    }

    public void setMucThue(float mucThue) {
        this.mucThue = mucThue;
    }
    public void nhapTK(){
        super.nhapTK();
        System.out.println("Nhập loại hình: ");
        loaihinhKD = new Scanner(System.in).nextLine();
        System.out.println("Nhập mức thuế %: ");
        mucThue= new Scanner(System.in).nextFloat();
    }
    public void xuatTK(){
        super.xuatTK();
        System.out.println("Loại hình kinh doanh: "+loaihinhKD);
        System.out.println("Mức thuế: "+mucThue);
        
    }
}
