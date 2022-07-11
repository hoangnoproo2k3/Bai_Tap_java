package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ds implements Serializable{
    ArrayList<LaiXe> listLx = new ArrayList<>();

    public Ds() {

    }

    public void NhapDsLx() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("\nNhap so luong lai xe: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            LaiXe  x = new LaiXe();
            System.out.println("---------Lai xe thu" + (i + 1) +"---------");
            x.Nhaplx();
            listLx.add(x);
        }
        try {
            FileOutputStream fos = new FileOutputStream("LX.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listLx);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void DocFile1() {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("LX.DAT");
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


    public String toString1() {
        return "Ds{" +
                "listLx=" + listLx +
                '}' + "\n";
    }


}
