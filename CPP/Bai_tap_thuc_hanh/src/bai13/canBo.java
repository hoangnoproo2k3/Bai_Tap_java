package bai13;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class canBo {
    private String name;
    private String address;
    private int age;
    float hsl;
    public void nhap(){
        System.out.println("Nhập tên: ");
        name= new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ: ");
        address= new Scanner(System.in).nextLine();
        System.out.println("Nhập tuổi: ");
        age= new Scanner(System.in).nextInt();
        System.out.println("Nhập hsl: ");
        this.hsl= new Scanner(System.in).nextFloat();
        
                
    }
    public void hien(){
        System.out.print("Tên: "+name);
        System.out.print("\tĐịa chỉ: "+address);
        System.out.print("\tTuổi: "+age);
        System.out.print("\tHSL: " +hsl+"\n");
    }
   
}
