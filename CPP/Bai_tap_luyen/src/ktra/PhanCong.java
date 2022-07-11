/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btthiguaky;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyentungduong
 */
public class PhanCong implements IHoatDong,Serializable{
    private LaiXe laixe;
    private ArrayList<Tuyen> dstx;

    public LaiXe getLaiXe() {
        return laixe;
    }

    public void setLaiXe(LaiXe lx) {
        this.laixe = laixe;
    }

    public ArrayList<Tuyen> getDsTuyen() {
        return dstx;
    }

    public void setDsTuyen(ArrayList<Tuyen> dstx) {
        this.dstx = dstx;
    }
    
    public PhanCong(){
        laixe = new LaiXe();
        dstx = new ArrayList<>();
    }
    @Override
    public void nhap() {
       
        try {
            System.out.println("Nhap thong tin lai xe: ");
            nhapLaiXe();
            System.out.println("Nhap ds tuyen: ");
            nhapDSTuyen();
        } catch (IOException ex) {
            Logger.getLogger(PhanCong.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PhanCong.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void nhapDSTuyen() throws IOException, FileNotFoundException, ClassNotFoundException{
        String MaTuyen="";
        do{
            System.out.println("Nhap ma tuyen(dung vong lap nhan *): ");
            MaTuyen = new Scanner(System.in).nextLine();
            if(MaTuyen.equals("*"))
                break;
            Tuyen tx= new XuLyTuyen().timKiemTuyen(MaTuyen);
            if(tx!=null){

                System.out.println("nhap so luot chay: ");
                tx.setSoLuot(new Scanner(System.in).nextInt());
                dstx.add(tx);
            }
            else
                System.out.println("Ma tuyen khong tai!");
            
        }while(true);
    }
    
    private void nhapLaiXe() throws IOException, FileNotFoundException, ClassNotFoundException{
        String MaLX="";
        System.out.println("Nhap ma lai xe can tim: ");
        MaLX =new Scanner(System.in).nextLine();
        LaiXe lx = new XuLyLX().timKiemLX(MaLX);
        if(lx==null){
            System.out.println("Tai xe moi, nhap du lieu vao he thong");
            lx = new LaiXe();
            lx.nhap();
            new XuLyLX().ghiFileLX(lx);
            
        }
        laixe = lx; 
    }

    public void hienDSPC(){
        System.out.println("Thong tin tai xe: ");
        System.out.println(""+laixe.toString());
        System.out.println("Danh sach tuyen:");
        for (Tuyen tx : dstx) {
           System.out.println(""+tx.toString()+"{so luot chay: "+tx.getSoLuot()+"}"); 
        }
    }   
}
