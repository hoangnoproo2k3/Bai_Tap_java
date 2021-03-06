import java.util.Scanner;

public class ThiSinh implements IThaoTac, IGioiTinh{
    private String soBaoDanh;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String queQuan;
    private double diemUuTien;
    private String khoiThi;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;

    public ThiSinh() {
    }

    public ThiSinh(String soBaoDanh, String hoTen, String ngaySinh, String gioiTinh, String queQuan, double diemUuTien, String khoiThi, double diemMon1, double diemMon2, double diemMon3) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.diemUuTien = diemUuTien;
        this.khoiThi = khoiThi;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getDiemUuTien() {
        return diemUuTien;
    }

    public void setDiemUuTien(double diemUuTien) {
        this.diemUuTien = diemUuTien;
    }

    public String getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(String khoiThi) {
        this.khoiThi = khoiThi;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public double getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(double diemMon3) {
        this.diemMon3 = diemMon3;
    }

    @Override
    public void nhap() {
        int chon;
        Scanner input = new Scanner(System.in);
        System.out.print("Nh???p s??? b??o danh: ");
        soBaoDanh = input.nextLine();
        System.out.print("Nh???p h??? t??n: ");
        hoTen = input.nextLine();
        System.out.print("Nh???p ng??y sinh: ");
        ngaySinh = input.next();
        input.nextLine();
        System.out.print("Nh???p qu?? qu??n: ");
        queQuan = input.nextLine();
        System.out.print("Nh???p ??i???m ??u ti??n: ");
        diemUuTien = input.nextDouble();
        System.out.print("Nh???p kh???i thi: ");
        khoiThi = input.next();
        System.out.print("Nh???p ??i???m m??n 1: ");
        diemMon1 = input.nextDouble();
        System.out.print("Nh???p ??i???m m??n 2: ");
        diemMon2 = input.nextDouble();
        System.out.print("Nh???p ??i???m m??n 3: ");
        diemMon3 = input.nextDouble();
        System.out.print("Nh???p gi???i t??nh (1 l?? nam, 2 l?? n???): ");
        gioiTinh = input.next();
        if(gioiTinh == "1"){
            gioiTinh = gt1;
        }
        else gioiTinh = gt2;

    }

    @Override
    public String toString(){
        String res = String.format("%-15s%-15s%-20s%-15s%-15s%-15.2f%-10s%-15.2f%-15.2f%-15.2f\n",
                getSoBaoDanh(),getHoTen(),getNgaySinh(),getGioiTinh(),getQueQuan(),getDiemUuTien(),getKhoiThi(),getDiemMon1(),
                getDiemMon2(),getDiemMon3());
        return res;
    }

}
