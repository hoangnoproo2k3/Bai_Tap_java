/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btthiguaky;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nguyentungduong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, FileNotFoundException, ClassNotFoundException {
        int chon;
        XuLyPhanCong xldspc = new XuLyPhanCong();
        do{
            menu();
            System.out.println("Hay chon 1-7: ");
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1:
                    System.out.println("Nhap thong tin ai xe ");
                    new XuLyLX().nhapDSLX();
                    break;
                case 2:
                    System.out.println("Nhap thong tin tuyen: ");
                    new XuLyTuyen().nhapDSTuyen();
                    break;
                case 3:
                    System.out.println("hien thong tin lai xe: ");
                    new XuLyLX().hienDSLX();
                    break;
                case 4:
                    System.out.println("hien thong tin tuyen: ");
                    new XuLyTuyen().hienDSTuyen();
                    break;
                case 5:
                    System.out.println("Ghi file phan cong cong viec: ");
                    xldspc.TaoDSPC();
                    break;
                case 6:
                    System.out.println("Hien phan cong cong viec: ");
                    xldspc.hienDS();
                    break;
                    /*
                case 7:
                    System.out.println("Bao cao tong khoang cach chay xe cua moi lai xe: ");
                    EM CHƯA LÀM ĐƯỢC Ạ
                    break;
*/
                case 7:
                    System.exit(0);
                 
            }
        }while(chon!=7);
    }
    
    public static void menu(){
        System.out.println("----------QUAN LY LAI XE---------- ");
        System.out.println("1. nhap thong tin lai xe va ghi file ");
        System.out.println("2. nhap thong tin tuyen va ghi file ");
        System.out.println("3. doc file va hien thong tin lai xe ");
        System.out.println("4. doc file va hien thong tin tuyen ");
        System.out.println("5. ghi file phan cong cong viec");
        System.out.println("6. hien phan cong cong viec");
        System.out.println("7. Ket thuc");
    }
    
}
