package btvn;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class test {
    public static void menu(){
        System.out.println("1.Nhập thông tin các xe");
        System.out.println("2.Bảng kê khai tiền thuế cho các loại xe");
        System.out.println("3.Thoát!");
    }
    public static void main(String[] args) {
        danhsachxe x= new danhsachxe();
        do{
            menu();
            System.out.println("Mời chọn!");
            int so=new Scanner(System.in).nextInt();
            switch(so){
                case 1:
                    x.nhapds();
                    break;
                case 2: 
                    x.hientn();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }while(true);
    }
    
    
}
