package QuanLyThue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class dsToKhaiThue {
    ArrayList<toKhaiThue> ds= new ArrayList<>();
    public void nhapds(){
        System.out.println("Nhập số lượng tờ khai thuế: ");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Tờ thứ: "+(ds.size()+1));
            toKhaiThue x= new toKhaiThue();
            x.nhapTK();
            ds.add(x);
        }
    }
    public void hiends(){
        for(toKhaiThue x: ds){
            x.xuatTK();
        }
    }
    public void ghiFile() throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("ds.txt");
        ObjectOutputStream Objout = new ObjectOutputStream(fout);
        Objout.writeObject(ds);
        System.out.println("Ghi file thành công!");
        fout.close();
        Objout.close();
    }

    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("ds.txt");
        ObjectInputStream Objin = new ObjectInputStream(fin);
        ds = (ArrayList<toKhaiThue>) Objin.readObject();
        fin.close();
        Objin.close();
       
    }
    public void doctuFile() throws IOException, FileNotFoundException, ClassNotFoundException{
        docFile();
         for(toKhaiThue x: ds){
            x.xuatTK();
        }
    }
    
}
