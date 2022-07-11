/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiKT;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class LaiXe implements  Serializable{

    private String MaLX;
    private String Hoten;
    private String diachi;
    private String TrinhDo;

    public LaiXe() {
    }

    public String getMaLX() {
        return MaLX;
    }

    public void setMaLX(String MaLX) {
        this.MaLX = MaLX;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String TrinhDo) {
        this.TrinhDo = TrinhDo;
    }

    public void nhap() {
        System.out.print("Nhap ma lai xe: ");
        MaLX = new Scanner(System.in).nextLine();
        System.out.print("Nhap ho ten : ");
        Hoten = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi : ");
        diachi = new Scanner(System.in).nextLine();
        int chon;
        do {
            
            System.out.println("1. A");
            System.out.println("2. B");
            System.out.println("3. C");
            System.out.println("4. D");
            System.out.println("5. E");
            System.out.println("6. F");
            System.out.println("Chon trinh do(1->6) : ");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    TrinhDo = "A";
                    break;
                case 2:
                    TrinhDo = "B";
                    break;
                case 3:
                    TrinhDo = "C";
                    break;
                case 4:
                    TrinhDo = "D";
                    break;
                case 5:
                    TrinhDo = "E";
                    break;
                case 6:
                    TrinhDo = "F";
                    break;
                default:
                    break;
            }
        } while (chon <= 0 || chon >= 7);

    }

    @Override
    public String toString() {
        return "Lái Xe [ mã : " + MaLX + " , ho tên: " + Hoten + " , địa chỉ : "
                + diachi + " , trình độ : " + TrinhDo + "]";
    }
}
