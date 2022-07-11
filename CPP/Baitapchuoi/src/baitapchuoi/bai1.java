/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapchuoi;

import java.util.Scanner;

/*
 Xóa khoảng trắng trong chuỗi vừa nhập
 */
public class bai1 {

    
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ban đầu");
        String str=x.nextLine();
        str=str.replaceAll("  ","" );//thay thế "  " thành ""
        System.out.println("Chuỗi sau khi xóa các khoảng trắng "+str);
    }
    
}
