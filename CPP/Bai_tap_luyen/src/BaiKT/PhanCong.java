/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiKT;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class PhanCong extends Tuyen{

    private int sotuyen;
    private int soluot;

    public PhanCong() {
    }

    public int getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(int sotuyen) {
        this.sotuyen = sotuyen;
    }

    public int getSoluot() {
        return soluot;
    }

    public void setSoluot(int soluot) {
        this.soluot = soluot;
    }

    public void nhapPhanCong() {
        
        System.out.print("Mời nhập số tuyến của 1 lái xe : ");
        sotuyen = new Scanner(System.in).nextInt();
        
        int TongSoLuot;
        do {
            TongSoLuot = 0;
            for (int i = 0; i < sotuyen; i++) {
                System.out.print("Mời nhập số lượt của tuyến thứ  " + (i + 1) + " : ");
                soluot = new Scanner(System.in).nextInt();
               
                TongSoLuot += soluot;
                if (TongSoLuot > 15) {
                    System.err.print("Mời nhập lại do đã nhập quá số lượt !");
                    break;
                }
            }

        } while (TongSoLuot <= 15);

    }

    public void hienPhanCong() {
           
    }

}
