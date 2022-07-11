package baitap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class quanlytulanh {
    public tulanh nhap(){
        tulanh x= new tulanh();
        System.out.print("Nhập dung tích: ");
        x.setDungTich(new Scanner(System.in).nextInt());
        System.out.print("Nhập  màu sác : ");
        x.setMausac(new Scanner(System.in).nextLine());
        System.out.print("Nhập hãng sản xuất: ");
        x.setHangsx(new Scanner(System.in).nextLine());
        System.out.print("Nhập số lượng: ");
        x.setSoluong( new Scanner(System.in).nextInt());
        System.out.print("Nhập đơn giá: ");
        x.setDongia(new Scanner(System.in).nextFloat());
        return x;
    }
    public void hien(tulanh x){
        System.out.println(""+x.toString());
    }
    public static ArrayList<tulanh> lst= new ArrayList<>();
    public ArrayList<tulanh> nhapds(){
        System.out.println("nhập số tủ lạnh: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            tulanh tl= nhap();
            lst.add(tl);
        }
        return lst;
    }   
    public void hiends(){
        for(tulanh tlanh: lst){
            hien(tlanh);
    }
    }
    public void lietke(){
        System.out.print("Nhập tên hãng sản xuất: ");
        String x= new Scanner(System.in).nextLine();
        System.out.println("Các tủ lạnh cùng hãng: ");
        for(tulanh tl:lst){
            if(tl.getHangsx().equals(x)){
                hien(tl);
            }
        }
    }
    public void tongTien(){
        float tong=0;
        for(tulanh tl:lst){
            tong+=tl.getDongia();
        }
        System.out.println("Tồng tiền các tủ lạnh có trong danh sách được nhập: "+tong);
    }
    public void xuly(){
        System.out.println("Tủ lạnh có dung tích trên 200l");
        for(tulanh tl:lst){
            if(tl.getDungTich()>200){
                hien(tl);
            }
        }
    }
    
    public void sapxep(){
        Collections.sort(lst,new sapxxep());
        System.out.println("Sắp xếp giảm dần theo số lượng");
        hiends();
//        for (int i = 0; i < lst.size(); i++) {
//            
//            hiends();
//    }
    }
}

