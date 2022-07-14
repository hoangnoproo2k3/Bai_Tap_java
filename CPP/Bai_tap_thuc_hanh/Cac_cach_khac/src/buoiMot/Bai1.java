package buoiMot;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử: ");
        int n = x.nextInt();
        int a[] = new int[n];
        System.out.println("Nhập các phần tử: ");
        for (int i = 0; i < n; i++) {
            System.out.println("a["+i+"]=");
            a[i] = x.nextInt();
        }
        hien(a);
        tong(a);
        Le(a);
        min(a);
    }

    public static void hien(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void tong(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        System.out.println("tổng: " + sum);
    }
    public static void Le(int a[]){
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0)
                System.out.print(a[i]);
        }
    }
    public static void min(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min) min=a[i];
        }
        for(int i=0;i<a.length;i++){
            if(min==a[i]) 
                System.out.println("Phần tử nhỏ nhất: "+a[i]+" vị trí "+i);
        }
    }
}
