/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_test;

import student.Student;
import cat.Cat;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class Class_test {

    
    public static void main(String[] args) {
        Cat tom= new Cat();
        Cat jerry=new Cat();
        System.out.println("Nhập tên: ");
        tom.setName("Mèo đen");
        System.out.println("Tên: "+tom.getName());
        jerry.setName("Chuột bạch");
        System.out.println("Tên: "+jerry.getName());
        tom.space();
        jerry.sleep();
        
        System.out.println("-----------------");
        Student mai=new Student();
        mai.setName(new Scanner(System.in).nextLine());
        System.out.println("ID: "+mai.getId());
        mai.study("");
        Student hoang= new Student();
        hoang.setId("23123");
        System.out.println("ID: "+hoang.getId());
    }
    
    
}
