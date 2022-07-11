/*
Chèn 1 phần tử vào mảng đã được sắp xếp và không làm thay đổi thứ tự tăng dần của mảng
 */
package bai_tap_luyen;

import java.util.Arrays;
import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        
        int a[]; 
        int n,k;
        System.out.print("Nhập số lượng phần tử: ");
        n=x.nextInt();
        System.out.print("Số lượng phần tử mảng "+n+" \n");
        a=new int [n+1];
        for(int i=0;i<n;i++){
            System.out.print("Nhập phần tử a["+i+"]=");
            a[i]=x.nextInt();
        }
        System.out.print("Nhập vào giá trị k: ");
        k=x.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(a[i]>k){
                index=i;
                break;
            }
        }
        if(index==-1) // chèn vào cuối
            a[n]=k;
        else{
            for(int i=n;i>index;i--){ // dịch từ vị trí trước đó
                a[i]=a[i-1];
            }
             a[index]=k;
        }
        System.out.println(Arrays.toString(a));
    }
    
}
