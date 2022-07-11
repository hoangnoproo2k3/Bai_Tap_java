package bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class xuLy {
    public ArrayList<tuLanh> dsach= new ArrayList<>();
    public void nhapds(){
        
        System.out.print("Nhập vào số tủ lạnh: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            dsach = new ArrayList<>();
            tuLanh x= new tuLanh();
            x.nhap();
            dsach.add(x);
        }
    }
    public void hiends(){
        for(tuLanh tl: dsach){
            tl.hien();
        }
    }
    public void lietKe(){
        System.out.println("Nhập vào tên hãng:  ");
        String x=  new Scanner(System.in).nextLine();
        for(tuLanh tl: dsach){
            if(x.equals(tl.getHangSX())){
                tl.hien();
            }
        }
    }
    public void tongtien(){
        float tong=0;
        for(tuLanh tl: dsach){
            tong+=tl.thanhTien();
        }
        System.out.println(""+tong);
    }
    public void xuly(){
        for(tuLanh tl: dsach){
            if(tl.getDungTich()>200){
                tl.hien();
            }
        }
    }
    public void sapXep(){
        Collections.sort(dsach,new sapxep());
        System.out.println("Sắp xếp giảm dần theo số lượng");
        hiends();
    }
}
