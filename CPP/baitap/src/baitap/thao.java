package baitap;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class thao {

    public static void main(String[] args) {
        int n, sum=0;
        Scanner x = new Scanner(System.in);
        Random y=new Random();
        System.out.print("Nhập số lượng: ");
        n = x.nextInt();
        int a[]=new int [n];
        int dem=0;
        while(dem<n){
            a[dem]=y.nextInt(100);
            dem++;
        }
//        System.out.println(Arrays.toString(a));
        System.out.println("Mảng tìm được");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
            if(i==0) continue;
            sum+=a[i];
        }
        System.out.println("Tổng "+sum);
    }
}
