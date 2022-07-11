package test;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaiXe implements Serializable{
    private String maLx, hoTen, diaChi, trinhDo;
    ArrayList<Tuyen> listT;

    public LaiXe() {

    }

    public String getMaLx() {
        return maLx;
    }

    public void setMaLx(String maLx) {
        this.maLx = maLx;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public void Nhaplx() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma lai xe: ");
        maLx = sc.next();
        System.out.print("Nhap ho ten lai xe: ");
        hoTen =  new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhap trinh do lai xe: ");
        while(true) {
            trinhDo = sc.next();
            if (trinhDo.equals("A") || trinhDo.equals("B") || trinhDo.equals("C") || trinhDo.equals("D") || trinhDo.equals("E") || trinhDo.equals("F")) break;
        }
    }

    public void NhapLx1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma lai xe: ");
        maLx = sc.next();
        System.out.print("Nhap ho ten lai xe: ");
        hoTen =  new Scanner(System.in).nextLine();
    }

    public void NhapDsT() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("\nNhap so luong tuyen xe: ");
        n = sc.nextInt();
        var listT = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            Tuyen x = new Tuyen();
            System.out.println("---------Tuyen thu" + (i + 1) +"---------");
            x.Nhapt();
            listT.add(x);
        }
        try {
            FileOutputStream fos = new FileOutputStream("TUYEN.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listT);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void DocFile2() {
        Object obj = null;
        try {;
            FileInputStream fis = new FileInputStream("TUYEN.DAT");
            ObjectInput ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                obj = ois.readObject();
                System.out.println(obj);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public String toString2() {
        return "Ds{" +
                "listT=" + listT +
                '}' + "\n";
    }


    public String toString() {
        return "LaiXe{" +
                "maLx='" + maLx + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                '}' + "\n";
    }
}
