package bai11;

/**
 *
 * @author AS
 */
public class custome extends person{
    private String namect;
    private float gtrihoadon;

    public custome() {
    }

    public custome(String namect, float gtrihoadon, String name, String address) {
        super(name, address);
        this.namect = namect;
        this.gtrihoadon = gtrihoadon;
    }

    public String getNamect() {
        return namect;
    }

    public void setNamect(String namect) {
        this.namect = namect;
    }

    public float getGtrihoadon() {
        return gtrihoadon;
    }

    public void setGtrihoadon(float gtrihoadon) {
        this.gtrihoadon = gtrihoadon;
    }

   public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ten cong ty: "+this.namect);
        System.out.println("Gia tri hoa don: "+this.gtrihoadon);
    }
    
}
