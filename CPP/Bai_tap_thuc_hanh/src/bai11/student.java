package bai11;

/**
 *
 * @author AS
 */
public class student extends person {
    private float mon1;
    private float mon2;

    public student() {
    }

    

    public student(float mon1, float mon2, String name, String address) {
        super(name, address);
        this.mon1 = mon1;
        this.mon2 = mon2;
    }

    public float getMon1() {
        return mon1;
    }

    public void setMon1(float mon1) {
        this.mon1 = mon1;
    }

    public float getMon2() {
        return mon2;
    }

    public void setMon2(float mon2) {
        this.mon2 = mon2;
    }
    public float diemTrungBinh() {
        return (this.mon1 + this.mon2) / 2;
    }
   
    public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.        
        System.out.println("Diem mon 1 = "+ this.mon1);
        System.out.println("Diem mon 2 = "+ this.mon2);
        System.out.println("Diem TB = "+ diemTrungBinh());      
    }
    
}
