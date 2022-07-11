package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PhanCong {
    ArrayList<LaiXe> list = new ArrayList<>();
    ArrayList<Tuyen> listt = new ArrayList<>(), listt2 = new ArrayList<>();
    ArrayList<String> strings = new ArrayList<String>(), strings2 = new ArrayList<String>();

    public PhanCong() {

    }

    public void NhapDsTong() {
        Scanner sc = new Scanner(System.in);
        int n, r;
        System.out.print("\nNhap so luong tai xe: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            LaiXe x = new LaiXe();
            System.out.print("\nNhap ma lai xe: ");
            String s = sc.next();
            System.out.print("Nhap ten lai xe: ");
            String v = new Scanner(System.in).nextLine();
            strings.add("Ma lai xe: "+s);
            strings.add("Ho ten lai xe: "+v);
            strings2.add("Ma lai xe: "+s);
            strings2.add("Ho ten lai xe: "+v);
            x.setMaLx(s);
            x.setHoTen(v);
            //list.add(x);
            System.out.print("\nNhap so luong tuyen xe: ");
            r = sc.nextInt();
            float sum = 0;
            for (int z = 0; z < r; z ++) {
                sum = 0;
                Tuyen a = new Tuyen();
                System.out.println("---------Tuyen thu" + (z + 1) +"---------");
                a.NhaptL();

                //listt.add(a);
                listt2.add(a);
                strings2.add(a.toString());
            }
            for (Tuyen b : listt2) {
                sum = sum + b.Tong();
            }
            strings.add("Tong quang duong la: " + sum + " \n");
            listt2.clear();

        }
        try {
            FileOutputStream fos = new FileOutputStream("PHANCONG.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(strings2);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void TongKc() {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public void Doc() {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("PHANCONG.DAT");
            ObjectInput ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                obj = ois.readObject();
               System.out.println(obj);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
