/*
 * Chèn mảng vào vị trí cho trước của mảng khác
 */
package bai_tap_luyen;
import java.util.Scanner;
public class bai04 {
    static void nhap() {
        int[] a, b;
        int m, n, k;
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử mảng a");
        n = x.nextInt();
        System.out.print("Nhập vào số phần tử mảng b");
        m = x.nextInt();
        b = new int[m];
        a = new int[m + n];// tạo số lượng phần tử của a có thể chứa

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào mảng a[]=");
            a[i] = x.nextInt();
        }

        for (int i = 0; i < m; i++) {
            System.out.print("Nhập vào mảng b[" + i + "]=");
            b[i] = x.nextInt();
        }
        System.out.println("Mảng a ban đầu");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        do {
            System.out.print("Nhập vào vị trí k cần chèn: ");
            k = x.nextInt();
            if (k < 0) {
                System.out.println("Không có vị trí này");
            }
        } while (k < 0);
        chen(a, b, n, k);
    }

    static void chen(int a[], int b[], int m, int k) {
        if (k >= m) {
            for (int i = 0; i < b.length; i++) {
                a[i + m] = b[i]; // chèn vào sau mảng a
            }
        } else {
            for (int i = a.length - 1; i >= k + b.length; i--) { // đưa các phần tử từ vị trí k về cuối mảng a
                a[i] = a[i - b.length];
            }
            for (int i = k; i < k + b.length; i++) {
                a[i] = b[i - k]; // điền vào các vị trí trống khi đã chuyển ra cuối mảng
            }
        }
        display(a, b);
    }

    static void display(int a[], int b[]) {
        System.out.println("Mảng b");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\n=======");
        System.out.println("Mảng a sau khi chèn");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        nhap();
    }
}
