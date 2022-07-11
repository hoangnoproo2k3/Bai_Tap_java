package btvn;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class vehicle {
    public float gia;
    public int xilanh;

    public void nhap(){
        System.out.println("Nhập vào giá xe: ");
        gia= new Scanner(System.in).nextFloat();
        System.out.println("Nhập vào xilanh của xe: ");
        xilanh= new Scanner(System.in).nextInt();
    }
    public void hien(){
        System.out.println(""+gia +"  \t "+xilanh);
    }
}
