/*
 Viết hoa kí tự đầu tiên trong Java
 */
package baitapchuoi;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        String str= x.nextLine();
        System.out.println("Chuỗi ban đầu: "+str);
        //Đây là chỉ viết chữ Hoa kí tự đầu tiên
//        String s1=str.substring(0, 1);// tách ra kí tự đầu tiên
//        String s2=str.substring(1, str.length());
//        s1=s1.toUpperCase();// hàm in hoa kí tự
//        str =s1+s2;
//        System.out.println("Chuỗi sau khi viết hoa chữ đầu: "+str);
         // Viết Hoa cho các kí tự sau dấu cách
         // đổi sang mảng char
         char []arr=str.toCharArray();
         boolean kt=true;
         //vòng lặp kiểm tra
         for(int i=0;i<arr.length;i++){
             //hàm kiểm tra đó là kí tự chữ cái
             if(Character.isLetter(arr[i])){
                 //xét khoảng trắng trước đó
                 if(kt){
                     arr[i]=Character.toUpperCase(arr[i]);
                     kt=false;
                 }
                     
             }
             else kt=true;
         }
         // chuyển mảng sang string
         str=String.valueOf(arr);
         System.out.print("Chuỗi sau khi đổi: "+ str);
    }
}
