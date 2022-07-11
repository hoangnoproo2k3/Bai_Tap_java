package bai5;

import java.util.Scanner;

public class HCNTest {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        classHCN a= new classHCN();
        System.out.println("Nhập vào chiều dài: ");
        a.dai=x.nextDouble();
        System.out.println("Nhập vào chiều rộng: ");
        a.rong=x.nextDouble();
        a.dienTich();
        a.chuVi();
        a.toString();
    }
}
