package test;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhanCong a = new PhanCong();
        Ds b = new Ds();
        LaiXe c = new LaiXe();

        Scanner sc = new Scanner(System.in);
        int option;
        while (true) {
            System.out.print("--------------------Menu-------------------" + "\n1. Nhap Lai Xe" + "\n2. Nhap Tuyen" + "\n3. Nhap Phan Cong" + "\n4. Hien Lai Xe" + "\n5. Hien Tuyen" + "\n6. Hien Phan Cong" + "\n7. Tong quang duong");
            System.out.print("\nChon: ");
            option = sc.nextInt();
            System.out.print("\n-----------------------------------\n");
            switch (option) {
                case 1:
                    Laixe(b);
                    break;
                case 2:
                    tuyen(c);
                    break;
                case 3:
                    pc(a);
                    break;
                case 4:
                    HLaixe(b);
                    break;
                case 5:
                    Htuyen(c);
                    break;
                case 6:
                    Hpc(a);
                    break;
                case 7:
                    Tong(a);
                    break;
                default:
                    System.out.println("\nOption khong co trong menu...");
                    break;
            }
        }
    }

        public static void Laixe (Ds b){
            b.NhapDsLx();
        }
        public static void HLaixe (Ds b){
            b.DocFile1();
        }
        public static void tuyen (LaiXe c){
            c.NhapDsT();
        }
        public static void Htuyen (LaiXe c){
            c.DocFile2();
        }
        public static void pc (PhanCong a ){
            a.NhapDsTong();
        }
        public static void Hpc (PhanCong a ){
            a.Doc();
        }
        public static void Tong (PhanCong a ){
            a.TongKc();
        }

}
