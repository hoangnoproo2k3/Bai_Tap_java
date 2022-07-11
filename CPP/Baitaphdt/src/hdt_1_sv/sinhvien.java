/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt_1_sv;

import java.util.Scanner;

public class sinhvien {
    private String name;
    private String adress;
    private String mail;
    private String std;
    private String ID;
    public void go_study(){
        System.out.println("Đi học");
        while(true){
            
            System.out.println("\t\t=====MeNu");
        }
    }
    public void do_homework(){
        System.out.println("Làm bài tập");
        
        Scanner x=new Scanner(System.in);
        System.out.println("Nhập vào số lượng mảng");
        int m=x.nextInt();
        int a[]=new int [m];
        for(int i=0;i<m;i++){
            System.out.print("Nhập vào phần tử a["+i+"]=");
            a[i]=x.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        
    }
    public void Free(){
        System.out.println("Nộp học phí");
    }
    public void Test(){
        System.out.println("Làm bài kiểm tra");
    }

    public sinhvien() {
    }
    
    public sinhvien(String name) {
        this.name = name;
    }

    public sinhvien(String name, String adress, String mail, String std, String ID) {
        this.name = name;
        this.adress = adress;
        this.mail = mail;
        this.std = std;
        this.ID = ID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
}
