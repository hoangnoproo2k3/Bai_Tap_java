package bai11;

/**
 *
 * @author AS
 */
public class employee extends person {
    private float hsl;
    private final float luongcb=100;

    public employee() {
    }

    public employee(float hsl, String name, String address) {
        super(name, address);
        this.hsl = hsl;
    }
    public float tinhLuong(){
        return luongcb*hsl;
    }

    public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("He so luong: "+this.hsl);
        System.out.println("Tinh luong: "+ tinhLuong());
    }
    
}
