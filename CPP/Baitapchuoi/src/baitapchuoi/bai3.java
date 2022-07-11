/*
    Cách chuyển chuỗi ban đầu về chuỗi in hoa
 */
package baitapchuoi;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.print(" Nhập chuỗi: ");
        String str=x.nextLine();
        //Cách 1
        // chuyển string về mảng char
//        char []arr=str.toCharArray();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>=97&&arr[i]<122) arr[i]-=32;
//        }
//        // chuyển đổi char sang string
//        str=String.valueOf(arr);
//        System.out.println("Chuỗi sau khi in hoa: "+str);
        //Cách 2 dùng hàm toUppercase
        System.out.println("Sau khi in hoa:");
        System.out.println(str.toUpperCase());
    }
}
