package bai7;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class testdt {
    public static void main(String[] args) {
        danhSach x= new danhSach();
        x.nhapdt();
        x.hiends();
        System.out.println("Đoạn thẳng có độ dài lớn nhất là: "+x.maxlength());
        System.out.println("Tổng các độ dài là: "+x.tongdodai());
    }
   
}
