package bai6;

import java.util.Scanner;

public class congNhan {
    protected static float  luongcb;
    protected float heSo;
    protected String name;
    protected float luong;

    public float getHeSo() {
        return heSo;
    }

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void nhap(){
        Scanner x=new Scanner(System.in);
        System.out.print("Nhập vào tên: ");
        name=x.nextLine();
        luongcb=1150;
        System.out.print("Nhập vào hệ số lương: ");
        heSo=x.nextFloat();
        luong=luongcb*heSo;
    }
    public void hien(){
        System.out.println(name +"\t\t"+luongcb+"\t\t"+heSo+"\t\t"+luong);
    }
}
