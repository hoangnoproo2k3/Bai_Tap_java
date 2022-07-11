package testvui;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class dshoadon {
    ArrayList<HoaDon> dshd= new ArrayList<>();
    public void nhapdshd(ArrayList<Sach> dssach, ArrayList<DocGia> dsdg){
        System.out.println("Nhập số hóa đơn: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            HoaDon x= new HoaDon();
            x.nhaphd(dssach, dsdg);
            dshd.add(x);
        }
    }
    public void hiendshd(){
        for(HoaDon hd: dshd){
            hd.hienhd();
        }
    }
}
