/*
 * tìm phần tử xuất hiện nhiều nhất trong mảng
 */
package bai_tap_luyen; 

import java.util.Scanner;

public class bai02 {

    static void display(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (a[i] == a[j]) {
                    b[i]++; // thêm vào giá trị ở các phần tử trùng nhau
                }
            }
        }

        int max = b[0];
        for (int i = 0; i < a.length; i++) {
            if (b[i] > max) {
                max = b[i]; // tìm phần tử có giá trị lớn nhất
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (max == b[i]) {
                System.out.println("Phần tử xuất hiện nhiều nhất "
                        + a[i] + " có số lần xuất hiện là " + max); // xuất ra giá trị max
            }
        }
    }

    static void nhap() {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = x.nextInt();
        }
        display(a);
    }

    public static void main(String[] args) {

        nhap();
    }
}
