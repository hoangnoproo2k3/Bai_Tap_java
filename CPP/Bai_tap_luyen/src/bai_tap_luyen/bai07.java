package bai_tap_luyen;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class bai07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n: ");
        int n;
        n = input.nextInt();
        Tach(n);
    }

    public static boolean checksnt(int x) {
        if (x < 2) {
            return false;
        } else {
            if (x == 2) {
                return true;
            } else {
                for (int i = 2; i < x; i++) {
                    if (x % i == 0) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public static void Tach(int a) {
        int i = 2;
        while (a != 0) {

            if (a % i == 0 && checksnt(i) == true) {
                a = a / i;
                System.out.print(i + " ");
            } else {
                i++;
            }
        }

    }
}
