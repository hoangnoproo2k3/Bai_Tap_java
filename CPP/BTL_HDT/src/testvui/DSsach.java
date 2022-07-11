package testvui;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class DSsach {
    ArrayList<Sach> dssach= new ArrayList<>();
    public void nhapds(){
        System.out.println("Nhập vào số lượng sách: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            Sach x= new Sach();
            x.nhapSach();
            dssach.add(x);
        }
    }
    public void hiends(){
        for(Sach s: dssach){
            System.out.println(s.toString());
        }
    }
}
