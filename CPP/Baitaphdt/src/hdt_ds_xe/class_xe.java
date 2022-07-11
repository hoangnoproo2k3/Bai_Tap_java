
package hdt_ds_xe;

public class class_xe {
    private String  name, mau;
    private int ID,dung_tich;
    private double gia;

    public class_xe() {
    }

//    public class_xe(int ID, String name, String mau, int dung_tich, double gia) {
//        this.ID = ID;
//        this.name = name;
//        this.mau = mau;
//        this.dung_tich = dung_tich;
//        this.gia = gia;
//    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getDung_tich() {
        return dung_tich;
    }

    public void setDung_tich(int dung_tich) {
        this.dung_tich = dung_tich;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
//    void in(){
//        System.out.print(+ID+name+dung_tich+gia+mau);
//        
//    }
    public String toString(){
        return ID+"-"+name+"-"+dung_tich+"-"+gia+"-"+mau;
    }
    void in(){
        System.out.printf("%-7s %-20s %-15s %-15s %-12s \n",ID,name,dung_tich,gia,mau);
    }
}
