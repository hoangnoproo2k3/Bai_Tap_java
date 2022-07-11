/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlhuongdoituong;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author VHC
 */
public class VuAn implements IThaoTac, Serializable  {
    private String mavuan;
    private String tenvuan;
    private String NBD;
    private String NKT;
    
    public String getMavuan() {
        return mavuan;
    }

    public void setMavuan(String mavuan) {
        this.mavuan = mavuan;
    }

    public String getTenvuan() {
        return tenvuan;
    }

    public void setTenvuan(String tenvuan) {
        this.tenvuan = tenvuan;
    }

    public String getNBD() {
        return NBD;
    }

    public void setNBD(String NBD) {
        this.NBD = NBD;
    }

    public String getNKT() {
        return NKT;
    }

    public void setNKT(String NKT) {
        this.NKT = NKT;
    }
    public VuAn(){};
    public VuAn(String mavuan,String tenvuan, String NBD,String NKT){
    this.mavuan=mavuan;
    this.tenvuan=tenvuan;
    this.NBD=NBD;
    this.NKT=NKT;
     
    };
    
    @Override
    public void nhap(){
        
    Scanner sc= new Scanner(System.in);
    System.out.print("Nhap ma vu an: ");
    mavuan= sc.nextLine();
    System.out.print("Ten vu an: ");
    tenvuan=sc.nextLine();
    System.out.print("Nhap ngay bat dau: ");
    NBD=sc.nextLine();
    System.out.print("Nhap ngay ket thuc: ");
    NKT=sc.nextLine();
    
    }
   
    
    @Override
    public String toString() {
        return String.format("%-15s%-20s%-15s%-15s\n", getMavuan(),
            getTenvuan(), getNBD(), getNKT());
    }
}
