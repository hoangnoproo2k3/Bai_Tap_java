package bai12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhSach {
    public ArrayList<hocSinh> ds= new ArrayList<>();
    public void nhapds(){
        System.out.println("Nhập vào số lượng học sinh: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            hocSinh x = new hocSinh();
            x.nhap();
            ds.add(x);
        }
    }
    public void hiends(){
        for(hocSinh x: ds){
            x.hien();
        }
    }
    public void sapxep(){
        Collections.sort(ds,new sapxep());
        System.out.println("Sắp xếp theo lớp");
        hiends();
    }
}
