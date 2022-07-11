/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt_ds_xe;

import java.util.Scanner;

public class run_xe {

    static Scanner a = new Scanner(System.in);

    static void nhap(class_xe x) {
        System.out.print("\nNhập vào ID:");
        x.setID(a.nextInt());
        a.nextLine();
        System.out.print("Nhập vào tên chủ xe: ");
        x.setName(a.nextLine());
        System.out.print("Nhập vào dung tích của xe: ");
        x.setDung_tich(a.nextInt());
        System.out.print("Nhập vào giá xe: ");
        x.setGia(a.nextDouble());
        a.nextLine();
        System.out.print("Nhập vào màu sác xe: ");
        x.setMau(a.nextLine());
    }

    public static void main(String[] args) {
        System.out.print(" Nhập vào số lượng xe ");
        int n = a.nextInt();
        class_xe ds[] = new class_xe[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập thông tin xe " + (i + 1));
            ds[i] = new class_xe();
            nhap(ds[i]);
        }
        System.out.printf("%-7s %-20s %-15s %-15s %-12s \n", "Ma xe", "Ten chu", "Dung tich xe", "Gia xe", "Mau sac");
        for (int i = 0; i < n; i++) {
            System.out.println(ds[i].toString());
        }
    }

}
