/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btlhuongdoituong;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VHC
 */
public class DSCongAn implements Serializable  {
  ArrayList<CongAn> dsCA = new ArrayList<>();
  CongAn a;
      public static final String FNAME = "DANHSACHCONGAN.dat";
          public void nhapDSCA() {
        Scanner input = new Scanner(System.in);
        int sl;
        do {
            System.out.print("\tNhập số lượng công an : ");
            sl = input.nextInt();
            if(sl < 0){
                System.out.println("\tSố lượng công an không hợp lệ, mời nhập lại.");
            }
        } while (sl < 0);
        for (int i = 0; i < sl; i++) {
            int x=i+1;
            a = new CongAn();
            System.out.print("Nhập thông tin công an thứ "+ x +": \n");
            a.nhap();
            dsCA.add(a);
        }
    }

    public void ghiFileDSCongAn() throws IOException {
        File f = new File(FNAME);
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(dsCA);
        out.close();
        fout.close();
    }

    public void docFileDSCongAN() throws IOException, ClassNotFoundException {
        File f = new File(FNAME);
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream in = new ObjectInputStream(fin);
        dsCA.clear();
        dsCA = (ArrayList) in.readObject();
        in.close();
        fin.close();
    }

    public void hienDSCA() throws IOException, ClassNotFoundException {
        docFileDSCongAN();
        System.out.printf("%-15s%-20s%-15s%-15s%-15s\n", "Mã số", "Họ và tên",
                "Ngày sinh", "Giới tính", "Lương");
        for (CongAn ca :
                dsCA) {
            System.out.print(ca.toString());
        }
    }

}
