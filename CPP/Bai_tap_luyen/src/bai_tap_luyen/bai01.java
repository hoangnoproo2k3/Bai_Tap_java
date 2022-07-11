/*Kiểm tra mảng đối xứng */
package bai_tap_luyen;

import java.util.Scanner;

public class bai01 {

    static boolean doiXung(int[] a) {// hàm kiểm tra mảng đối xứng
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    static void disPlay(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+""); // hiện ra mảng a
        }
        System.out.println("");
        System.out.println("Có phải là mảng đối xứng?"+ doiXung(arr)); // kiểm tra xem có phải là mảng đối xứng hay không
    }
    static void nhap(){
        int n;
        Scanner x= new Scanner(System.in);
        n=x.nextInt();
        int b[]=new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Nhập vào b["+i+"]=");
            b[i]=x.nextInt();
        }
        disPlay(b);
    }
    public static void main(String[] args) {
        nhap();
    }

}
