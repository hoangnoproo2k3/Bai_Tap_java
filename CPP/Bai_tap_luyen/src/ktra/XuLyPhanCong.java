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
import java.util.Collections;
import java.util.Comparator;
//import sun.rmi.server.MarshalInputStream;

/**
 *
 * @author nguyentungduong
 */
public class XuLyPhanCong {
    ArrayList<PhanCong> lsdspc = new ArrayList<>();
    public static final String FNAME="PHANCONG.DAT";
    
    public void ghiFileDSPC(PhanCong dspc) throws FileNotFoundException, IOException{
        File f = new File(FNAME);
        boolean append = f.exists();
        //khai bao cac doi tuong xu ly file
        FileOutputStream fout = new FileOutputStream(f, append);
        AppendObjectOutputStream out = new AppendObjectOutputStream(fout, append);
        out.writeObject(dspc);
        //dong file 
        fout.close();
        out.close();
    }
    
    public void docFileDSPC() throws FileNotFoundException, IOException, ClassNotFoundException{
        lsdspc.clear();
        FileInputStream fin = new FileInputStream(FNAME);
        ObjectInputStream in = new ObjectInputStream(fin);
        boolean isCheck = true;
        while(isCheck){
            try {
                PhanCong dspc = (PhanCong)in.readObject();
                lsdspc.add(dspc);
            } catch (EOFException e) {
                isCheck=false;
            }
        }
        //dong file
        fin.close();
        in.close();
    }
    
    public void TaoDSPC() throws IOException{
        PhanCong dspc = new PhanCong();
        dspc.nhap();
        System.out.println("Ghi cong viec vao file: ");
        ghiFileDSPC(dspc);
    }
    
    public void hienDS() throws IOException, FileNotFoundException, ClassNotFoundException{
        docFileDSPC();
        for (PhanCong dspc : lsdspc) {
            dspc.hienDSPC();
        }
    }
}
