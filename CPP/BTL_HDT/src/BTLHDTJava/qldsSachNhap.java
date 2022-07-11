package BTLHDTJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class qldsSachNhap {

    ArrayList<SachNhap> dssn = new ArrayList<>();

    public void nhapdsSN() {
        System.out.print("Nhập vào số lượng sách nhập: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            SachNhap x = new SachNhap();
            System.out.println("Nhập sách thứ " + (dssn.size() + 1));
            x.nhap();
            dssn.add(x);
        }
    }

    public void hiendssn() {
        for (SachNhap sn : dssn) {
            System.out.println(sn.toString());
        }
    }

    public void ghiFile() throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("dssn.txt");
        ObjectOutputStream Objout = new ObjectOutputStream(fout);
        Objout.writeObject(dssn);
        System.out.println("Ghi file thành công!");
        fout.close();
        Objout.close();
    }

    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("dssn.txt");
        ObjectInputStream Objin = new ObjectInputStream(fin);
        dssn = (ArrayList<SachNhap>) Objin.readObject();
        fin.close();
        Objin.close();
    }

    public void xuLyDieuKien() {
        System.out.print("Nhập giá x: ");
        float x = new Scanner(System.in).nextFloat();
        for (SachNhap sn : dssn) {
            if (sn.getGiamGia() < x) {
                System.out.println(sn.toString());
            }
        }
    }

    public void chenThemSachNhap() {

        System.out.print("Nhập tên sách: ");
        String tsach = new Scanner(System.in).nextLine();
        boolean kt = false;
        for (SachNhap s : dssn) {
            if (s.getTenSach().equals(tsach)) {
                System.out.println("Sách đã tồn tại!");
                kt = true;
                break;
            }
        }
        for (SachNhap s : dssn) {
            if (kt) {
                System.out.println("Bổ sung sách: ");
                s.nhap();
                dssn.add(s);
                break;
            }
        }
        System.out.println("Hiện danh sách sau khi thêm vào");
        for(SachNhap s: dssn){
            System.out.println(s.toString());
        }
    }
    public void hiendsDocFile() throws IOException, FileNotFoundException, ClassNotFoundException{
        docFile();
        for(SachNhap s: dssn){
            System.out.println(s.toString());
        }
    }
}
