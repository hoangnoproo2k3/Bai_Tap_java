
package baitap;

import java.util.Scanner;

public class Bai3 {
    public static Scanner x=new Scanner(System.in);
    public static void main(String[] args) {
        double a,b,c;
        System.out.print("Nhập cạnh a: ");
        a=x.nextDouble();
        System.out.print("Nhập cạnh b: ");
        b=x.nextDouble();
        System.out.print("Nhập cạnh c: ");
        c=x.nextDouble();
        double x=a+b-c, y=a+c-b,z=b+c-a,w=a+b+c;
        System.out.println("Công thức Heron: "+Math.sqrt(x*y*z*w)/4);
    }
}
