package baitap;
//

import java.util.Scanner;
public class Bai2 {
    public static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {

        int n;
        System.out.print("Nhập vào n: ");
        n = x.nextInt();
        System.out.println("Dãy số: ");
        for (int i = 0; i < n; i++) {
            System.out.print(So(i) + " ");
        }
    }
    public static int So(int n) { 
        int a0 = 1, a1 = 1, an = 2;
        if (n == 0 || n == 1) {
            return 1;
        }
        for (int i = 2; i < n; i++) {
            a0 = a1;
            a1 = an;
            an = a0 + a1;
        }
        return an;
    }
}
