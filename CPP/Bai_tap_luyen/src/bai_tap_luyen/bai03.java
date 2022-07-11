/*
 *Nhập 1 dãy số a có n phần tử là số nguyên, nhập vào X. Xác định 
vị trí của số nguyên tố a[i] có giá trị gần X nhất.
 */
package bai_tap_luyen;

import static java.lang.Math.abs;
import java.util.Scanner;

public class bai03 {

     static boolean snt(int n) {
        if (n < 2) {
            return false;
        } else {
            if (n == 2) {
                return true;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
     static void display(int []a, int x){
        int temp=0;
        
        for(int i=0;i<a.length;i++){
            if(snt(a[i]))
             temp=a[i];// tìm phần tử snt đầu tiên để xét
                break;
        }
        for(int i=0;i<a.length;i++){
            if(snt(a[i])&&(abs(a[i]-x)<abs(temp-x))) // tìm phần tử a[i] khác là số nguyên tố gần nhất
                temp=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]); // hiện lại mảng a
        }
        System.out.println("");
        for(int i=0;i<a.length;i++){
            if(snt(a[i])&&(abs(a[i]-x)==abs(temp-x))) // gán trở lại để nhận vị trí thứ i
                System.out.println("phần tử thứ "+i);
        }
    }
     static void nhap(){
        Scanner x=new Scanner(System.in);
        System.out.print("Nhập vào số lượng của mảng: ");
        int n=x.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Nhập từng phần tử a["+i+"]=");
            a[i]=x.nextInt();
        }
            System.out.println("Nhập vào phần tử X: ");
        int y=x.nextInt();
        display(a,y);
    }
    public static void main(String[] args) {
        nhap();
    }
}
