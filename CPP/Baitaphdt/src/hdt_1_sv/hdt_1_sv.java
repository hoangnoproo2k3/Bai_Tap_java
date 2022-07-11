/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hdt_1_sv;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class hdt_1_sv {

    public static void main(String[] args) {
        
        Scanner x= new Scanner(System.in);
        System.out.println("Nhập vào tên sinh viên");
        String ten=x.nextLine();
        System.out.println("NHập vào địa chỉ");
        String dia_chi=x.nextLine();
        System.out.println("Nhập vào số điện thoại");
        String sdt=x.next();
        System.out.println("Nhập vào gmail");
        String mai=x.next();
        System.out.println("Nhập vào ID sinh viên");
        String id=x.next();
        System.out.println("=====================");
        sinhvien tam=new sinhvien(ten,dia_chi,sdt,mai,id);
        System.out.println("Tên: "+tam.getName());
        System.out.println("Địa chỉ: "+tam.getAdress());
        System.out.println("SDT: "+tam.getStd());
        System.out.println("Email: "+tam.getMail());
        System.out.println("ID: "+tam.getID());
        tam.Free();
        tam.do_homework();
        tam.Test();
        
    }
    
}
