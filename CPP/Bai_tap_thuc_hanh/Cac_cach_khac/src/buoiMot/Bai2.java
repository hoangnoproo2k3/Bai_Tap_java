package buoiMot;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.print("Nhập vào số nguyên : ");
        int n=x.nextInt();
        for(int i=0;i<n;i++){
                System.out.print(So(i)+ " ");
        }
    }
    public static int So(int n){
        int a0=1,a1=1, an=a0+a1;
        if(n==1||n==0) return 1;
        for(int i=2;i<n;i++){
            a0=a1;
            a1=an;
            an=a0+a1;
        }
        return an;
    }
}
