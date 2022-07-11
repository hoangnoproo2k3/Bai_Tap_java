package mypham;

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
public class dsKHvip {

    ArrayList<KhachHangVip> ds = new ArrayList<>();

    public void nhapdskhv() {
        System.out.println("Nhập số lượng tờ khai thuế: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Tờ thứ: " + (ds.size() + 1));
            KhachHangVip x = new KhachHangVip();
            x.nhapkh();
            ds.add(x);
        }
    }

    public void hiends() {
        for (KhachHangVip x : ds) {
            x.hienkh();
        }
    }

    public void chietKhauMax() {
        float max = 0;
        for (KhachHangVip x : ds) {
            if (x.getChietKhau() > max) {
                max = x.getChietKhau();
            }
        }

        for (KhachHangVip x : ds) {
            if (x.getChietKhau() == max) {
               
                x.hienkh();
            }
        }
    }
}
