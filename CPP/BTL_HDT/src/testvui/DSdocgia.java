package testvui;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class DSdocgia {
    ArrayList<DocGia> dsdocgia= new ArrayList<>();
    public void nhapdsdg(){
        System.out.println("Nhập vào số độc giả: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            DocGia x= new DocGia();
            x.nhap();
            dsdocgia.add(x);
        }
    }
    public void hiendsdg(){
        for(DocGia dg: dsdocgia){
            System.out.println(dg.toString());
        }
    }
}
