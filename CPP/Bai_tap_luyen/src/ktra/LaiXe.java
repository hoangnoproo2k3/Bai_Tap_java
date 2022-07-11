/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btthiguaky;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author nguyentungduong
 */
public class LaiXe implements ITrinhDo,IHoatDong, Serializable{
    private String MaLX;
    private String HoTen;
    private String DiaChi;
    private String TrinhDo;

    public String getMaLX() {
        return MaLX;
    }

    public void setMaLX(String MaLX) {
        this.MaLX = MaLX;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }
     

    @Override
    public void nhap() {
        System.out.println("Nhap ma lai xe: ");
        MaLX = new Scanner(System.in).nextLine();
        System.out.println("Nhap Ho Ten lai xe : ");
        HoTen =new Scanner(System.in).nextLine();
        System.out.println("Nhap dia chi: ");
        DiaChi = new Scanner(System.in).nextLine();
        int chon;
             System.out.println("Chon Trinh do lai xe: ");
             System.out.println("1. Trinh do loai A");
             System.out.println("2. Trinh do loai B");
             System.out.println("3. Trinh do loai C");
             System.out.println("4. Trinh do loai D");
             System.out.println("5. Trinh do loai E");
             System.out.println("6. Trinh do loai F");
             chon = new Scanner(System.in).nextInt();
             switch(chon){
                 case 1:
                     TrinhDo = LoaiA;
                     break;
                 case 2:
                     TrinhDo = LoaiB;
                     break;
                 case 3:
                     TrinhDo = LoaiC;
                     break;
                 case 4:
                     TrinhDo = LoaiD;
                     break;
                 case 5:
                     TrinhDo = LoaiE;
                     break;
                 case 6:
                     TrinhDo = LoaiF;
                     break;
                 default:
                     break;
             }
    }

    @Override
    public String toString() {
        return "LaiXe{" + "MaLX=" + MaLX + ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + ", TrinhDo=" + TrinhDo + '}';
    }
    
    
}
