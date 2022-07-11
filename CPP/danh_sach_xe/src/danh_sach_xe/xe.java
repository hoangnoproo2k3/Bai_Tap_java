package danh_sach_xe;


public class xe {
    private int maXe,dungTich;
    private double triGia;
    private String chuXe,moTa;
// 
//    public xe(int maXe, int dungTich, double triGia, String chuXe, String moTa) {
//        this.maXe = maXe;
//        this.dungTich = dungTich;
//        this.triGia = triGia;
//        this.chuXe = chuXe;
//        this.moTa = moTa;
//    }
    public xe(){
 
    }
    public int getMaXe() {
        return maXe;
    }
 
    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }
 
    public int getDungTich() {
        return dungTich;
    }
 
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
 
    public double getTriGia() {
        return triGia;
    }
 
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
 
    public String getChuXe() {
        return chuXe;
    }
 
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
 
    public String getMoTa() {
        return moTa;
    }
 
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
 
    public double tinhThue(){
        double thue;
        if(dungTich<100) thue=triGia*0.01;
        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
        else thue = triGia * 0.05;
        return thue;
    }
 
//    @Override
//    public String toString() {
//        return maXe + "-"+chuXe + "-"+dungTich + "-"+triGia + "-"+moTa;
//}
 
    void inThue(){
        System.out.printf("%-10s %-20s %-15s %-15s %-10s %-8s \n",maXe,chuXe,dungTich,triGia,moTa,tinhThue());
    }
}
