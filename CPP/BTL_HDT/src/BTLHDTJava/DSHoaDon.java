package BTLHDTJava;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DSHoaDon {

    private String tenThuthu;
    ArrayList<HoaDon> dsHD = new ArrayList<>();

    public DSHoaDon() {
    }

    public void nhapDSHD(ArrayList<Sach> dsSach, ArrayList<DocGia> dsdg) {
        System.out.println("Nhập tên thủ thư làm hóa đơn: ");
        tenThuthu = new Scanner(System.in).nextLine();
        System.out.println("Nhập số lượng hóa đơn mượn sách: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin hóa đơn thứ " + (dsHD.size() + 1));
            HoaDon hd = new HoaDon();
            hd.nhapHD(dsSach, dsdg);
            dsHD.add(hd);
        }
    }

    public void hienDShd() {
        System.out.println("Người làm hóa đơn: " + tenThuthu);
        System.out.println("-----DANH SÁCH HÓA ĐƠN-----");
        for (HoaDon hoadon : dsHD) {
            hoadon.hienHD();
        }
    }
    public void tongTien(){
        float tong=0;
        for(HoaDon hd: dsHD){
           tong+= hd.getTienMuon();
        }
        System.out.println("Tổng tiền mượn trong hóa đơn: "+tong);
    }
    public void timKiem(){
        System.out.println("Nhập mã hóa đơn cần tìm: ");
        String ma= new Scanner(System.in).next();
        boolean kt=false;
        for(HoaDon hd: dsHD){
            if(hd.getMaHD().equals(ma)){
                hd.hienHD();
                kt=true;
            }
            
        }
        if(!kt){
            System.out.println("Mã không tồn tại!");
        }
    }
    public void ghiFile() throws FileNotFoundException, IOException {

        FileOutputStream fout = new FileOutputStream("dshd.txt");
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(dsHD);
        System.out.println("Ghi file thành công!");
        objout.close();
        fout.close();
    }

    public void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("dshd.txt");
        ObjectInputStream objin = new ObjectInputStream(fin);
        dsHD = (ArrayList<HoaDon>) objin.readObject();
        objin.close();
        fin.close();
    }

    void hiendshdsaukhidocFile(ArrayList<HoaDon> list) throws IOException, FileNotFoundException, ClassNotFoundException {
        docFile();
        for (HoaDon hs : dsHD) {
            hs.hienHD();
        }
    }
}
