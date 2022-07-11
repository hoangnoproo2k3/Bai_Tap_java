package mypham;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class KhachHangVip extends KhachHang{
    private float chietKhau;

    public KhachHangVip() {
    }

    public KhachHangVip(float chietKhau, String mathue, String ma, String ten, String diachi, String SDT) {
        super(mathue, ma, ten, diachi, SDT);
        this.chietKhau = chietKhau;
    }

    public KhachHangVip(float chietKhau) {
        this.chietKhau = chietKhau;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }
    
    public void nhapkh(){
        super.nhapkh();
        System.out.println("Nhập chiết khấu: ");
        chietKhau= new Scanner(System.in).nextFloat();
    }
    public void hienkh(){
        
        super.hienkh();
        System.out.printf("%20s",chietKhau);
    }
}
