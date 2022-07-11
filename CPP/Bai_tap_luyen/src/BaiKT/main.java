/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiKT;


import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int chon;
        xuliLaiXe lx = new xuliLaiXe();
        XuLiTuyen tuyen = new XuLiTuyen();
        do {
            System.out.println("1. nhap thong tin lai xe , ghi file LAIXE.DAT ");
            System.out.println("2. hien thi danh sach tu file LAIXE.DAT ");
            System.out.println("3. Nhap danh sach tuyen, ghi file TUYEN.DAT ");
            System.out.println("4. hien thi tu file TUYEN.DAT ");
          
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    lx.nhapDS();
                    lx.hiendsLaiXe();
                    break;
                case 2:
                    tuyen.nhapDSTuyen();
                    tuyen.hiendsTuyen();
                    break;
                case 3:   
                    
                    break;
                default:
                    break;
    
            }
        } while (chon != 6);
    }
}
