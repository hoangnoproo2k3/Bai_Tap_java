package bai5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class Giaodich {
    private String ma;
    private Date ngay;
    private float dongia;
    private int soluong;

    public Giaodich() {
    }

    public Giaodich(String ma, Date ngay, float dongia, int soluong) {
        this.ma = ma;
        this.ngay = ngay;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public void nhap() throws ParseException{
        System.out.println("Nhập mã: ");
        ma= new Scanner(System.in).nextLine();
        System.out.println("Nhập ngày (dd-MM-yyyy): ");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");        
        Date date = dateFormat.parse(new Scanner(System.in).nextLine());
        ngay = date;
        System.out.println("Nhập vào đơn giá: ");
        dongia= new Scanner(System.in).nextFloat();
        System.out.println("Nhập số lượng: ");
        soluong= new Scanner(System.in).nextInt();
        
    }
    public void hien(){
        System.out.println("Mã: "+ma+"\t Ngày: "+ngay +"\t Đơn giá"+dongia+"\t Số lượng"+soluong);
    }
}
