/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btthiguaky;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nguyentungduong
 */
public class XuLyTuyen {
    ArrayList<Tuyen> lstuyen =new ArrayList<>();
    public static final String FNAME="TUYEN.DAT";
    
    public void nhapDSTuyen() throws IOException{
        System.out.println("Nhap so luong Tuyen xe: ");
        int soLuong = new Scanner(System.in).nextInt();
        for(int i=0;i<soLuong;i++){
            Tuyen tx = new Tuyen();
            tx.nhap();
            //ghi doi tuong vao file
            ghiFileTuyen(tx);
        }
    }
    
    public void ghiFileTuyen(Tuyen tx) throws FileNotFoundException, IOException{
        File f = new File(FNAME);
        boolean append = f.exists();
        FileOutputStream fout = new FileOutputStream(f, append);
        AppendObjectOutputStream out = 
                new AppendObjectOutputStream(fout, append);
        out.writeObject(tx);
        //dong file
        fout.close();
        out.close();
    }
    
    public void docFileTuyen() throws FileNotFoundException, IOException, ClassNotFoundException{
        lstuyen.clear();
        boolean isCheck =true;
        FileInputStream fin = new FileInputStream(FNAME);
        ObjectInputStream in = new ObjectInputStream(fin);
        while(isCheck){
            try {
                Tuyen tx = (Tuyen)in.readObject();
                lstuyen.add(tx);
            } catch (EOFException e) {
                isCheck=false;
            }
        }
        //dong file
        fin.close();
        in.close();
    }
    
    public void hienDSTuyen() throws IOException, FileNotFoundException, ClassNotFoundException{
        docFileTuyen();
        for (Tuyen tuyen : lstuyen) {
            System.out.println(""+tuyen.toString());
        }
    }
    
    public Tuyen timKiemTuyen(String MaTuyen) throws IOException, FileNotFoundException, ClassNotFoundException{
        docFileTuyen();
        for (Tuyen tuyen : lstuyen) {
            if(tuyen.getMaTuyen().equalsIgnoreCase(MaTuyen)){
                return tuyen;
            }
        }
        return null;
    }
    
}
        

