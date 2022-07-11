package btvn;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhsachxe {
    int n;
    vehicle []a;
    
   
    public void nhapds(){
        System.out.println("Nhập vào số xe: ");
        n=new Scanner(System.in).nextInt();
        a= new vehicle[n];
        for(int i=0;i<n;i++){
            a[i]=new vehicle();
            System.out.println("Nhập xe thứ "+(i+1));
            a[i].nhap();
        }
    }
    public void hientn(){
        for(int i=0;i<n;i++){
            if(a[i].xilanh<100){
                System.out.print("Thuế là của xe thứ "+(i+1));
                System.out.println(" là"+a[i].gia*0.01 + " xe có xilanh <100 và giá xe là "+a[i].gia);
            }
            if(a[i].xilanh>=100&&a[i].xilanh<=200){
                System.out.print("Thuế của xe thứ "+(i+1));
                System.out.println(" là "+a[i].gia*0.03+" xe có xilanh >=100 và <=200 giá xe là "+a[i].gia);
            }
            if(a[i].xilanh>200){
                System.out.print("Thuế của xe thứ "+(i+1));
                System.out.println(" là"+a[i].gia*0.05+" xe có  xi lanh >200 giá xe là "+a[i].gia);
            }
        }
    }
}
