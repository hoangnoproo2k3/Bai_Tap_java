package testvui;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class DocGia {
    private String ten, madg;
    private boolean gtinh;
    public DocGia() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMadg() {
        return madg;
    }

    public void setMadg(String madg) {
        this.madg = madg;
    }

    public boolean isGtinh() {
        return gtinh;
    }

    public void setGtinh(boolean gtinh) {
        this.gtinh = gtinh;
    }

    
    public void nhap(){
        System.out.println("Nhập tên: ");
        ten= new Scanner(System.in).nextLine();
        System.out.println("Nhập mã độc giả: ");
        madg= new Scanner(System.in).next();
        
        Scanner sc= new Scanner(System.in);
        while(true){
            try {
                System.out.println("Nhập giới tính: Nam: true - Nữ: false");
                sc.nextBoolean();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Nhập lại!");
                sc.nextLine();
            }
        }
    }

    @Override
    public String toString() {
        String gt="";
        if(this.gtinh){
            gt="Nam";
        }else{
            gt="Nữ";
        }
        return "DocGia{" + "ten=" + ten + ", madg=" + madg + ", gtinh=" + gt + '}';
    }
    
    
}
