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
public class XuLyLX {
    ArrayList<LaiXe> lslx = new ArrayList<>();
    public static final String FNAME="LX.DAT";
    public void ghiFileLX(LaiXe lx) throws FileNotFoundException, IOException{
        File F = new File(FNAME);
        //kiem tra xem file da ton tai chua
        boolean append =F.exists();
        FileOutputStream fout =new FileOutputStream(F, append);
        AppendObjectOutputStream out = 
                new AppendObjectOutputStream(fout, append);
        out.writeObject(lx);
        //dong file
        fout.close();
        out.close();
    }
    
    public void docFileLX() throws FileNotFoundException, IOException, ClassNotFoundException{
        lslx.clear();
        boolean isCheck=true;
        FileInputStream fin = new FileInputStream(FNAME);
        ObjectInputStream in = new ObjectInputStream(fin);
        while(isCheck){
            try {
                LaiXe lx =(LaiXe) in.readObject();
                lslx.add(lx);
            } catch (EOFException e) {
                isCheck=false;
            }
        }
        //dong file
        fin.close();
        in.close();
    }
    public void hienDSLX() throws IOException, FileNotFoundException, ClassNotFoundException{
        docFileLX();
        for (LaiXe laixe : lslx) {
            System.out.println(""+ laixe.toString());
        }
    }
    
    public void nhapDSLX() throws IOException{
        int soLuong;
        System.out.println("Nhap so luong tai xe: ");
        soLuong =new Scanner(System.in).nextInt();
        LaiXe lx=null;
        for(int i=0; i<soLuong;i++){
            lx = new LaiXe();
            lx.nhap();
            ghiFileLX(lx);
        }
    }
    public LaiXe timKiemLX(String MaLX) throws IOException, FileNotFoundException, ClassNotFoundException{
        docFileLX();
        for (LaiXe laixe : lslx) {
            if(laixe.getMaLX().equalsIgnoreCase(MaLX)){
                return laixe;
            }
        }
        return null;
    }
}
