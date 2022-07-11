/*
    Ngân hàng ABC muốn lưu trữ thông tin của mỗi tài khoản như sau:

Mỗi tài khoản chứa các thông tin:
Số tài khoản ( Kiểu long)
Tên tài khoản (kiểu chuỗi)
Số tiền trong tài khoản (kiểu double)
Thiết kế lớp Account để lưu trữ các thông tin, lớp bao gồm các phương thức sau:

Constructor: Có 2 constructor ( mặc định và đầy đủ tham số)
Các phương thức get, set cho từng thuộc tính
Phương thức toString để trả về chuỗi chứa toàn bộ thông tin tài khoản, yêu cầu định dạng tiền tệ.
Thêm các thông tin sau vào lớp Account:

+)Hằng số lãi suất có giá trị khởi tạo 0.035
Constructor có 2 đối số: số tài khoản, tên tài khoản. Constructor này sẽ khởi tạo số tiền mặc định là 50
Phương thức nạp tiền vào tài khoản: Lấy số tiền hiện tại trong tài khoản + số tiền nạp vào
Phương thức rút tiền: Lấy số tiền hiện tại trong tài khoản – (số tiền muốn rút+phí rúttiền)
Phương thức đáo hạn: Mỗi lần đến kỳ đáo hạn thì số tiền trong tài khoản = số tiền trong tài khoản + số tiền 
trong tài khoản * LAISUAT
Phương thức chuyển khoản từ tài khoản này sang tài khoản khác
Chú ý: Mỗi thao tác phải kiểm tra số tiền nạp, rút, chuyển có hợp lệ hay không? (VD: tiền nhập vào <0, 
tiền rút nhiều hơn tiền trong tài khoản thì thông báo không hợp lệ và yêu cầu nhập lại)
 */
package QL_nganhang;

import java.util.Scanner;

public class run_nganhang {

    static Scanner x = new Scanner(System.in);

    static void Nhap(Class_nganhang tk) {
        System.out.print("Nhập vào STK: ");
        tk.setStd(x.nextLong());
        x.nextLine();
        System.out.print("Nhập vào tên chủ TK: ");
        tk.setName(x.nextLine());
        tk.setTien(50000);
    }
    
    public static void main(String[] args) {
        Class_nganhang a[] = null;
        int chon, n = 0;
        long s, m;
        boolean KT = true;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\t\t\t=======MeNu========");
            System.out.println("1.Nhập thông tin các khách hàng");
            System.out.println("2.Hiện thị danh sách khách hàng");
            System.out.println("3.Nạp tiền");
            System.out.println("4.Rút tiền");
            System.out.println("5.Đáo hạn");
            System.out.println("6.Chuyển khoản");
            System.out.println("7.Thoát");
            System.out.print("Mời chọn: ");
            chon = x.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhập vào số tài khoản cần thông tin");
                    n = x.nextInt();
                    a = new Class_nganhang[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập vào tên khách hàng " + (i + 1));
                        a[i] = new Class_nganhang();
                        Nhap(a[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s \n", "STK", "Tên chủ TK", "Số tiền");
                    for (int i = 0; i < n; i++) {
                        a[i].in();
                    }
                    break;
                case 3:
                    System.out.print("Nhập vào số tài khoản cần nạp tiền: ");
                    s = x.nextLong();

                    for (int i = 0; i < n; i++) {

                        m = a[i].getStd();
                        if (s == m) {
                            System.out.println("Tài khoản " + m);
                            a[i].napTien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập vào số tài khoản cần rút tiền: ");
                    s = x.nextLong();
                    for (int i = 0; i < n; i++) {
                        m = a[i].getStd();
                        if (s == m) {
                            System.out.println("Tài khoản " + m);
                            a[i].rutTien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập vào số tài khoản đảo hạn: ");
                    s = x.nextLong();
                    for (int i = 0; i < n; i++) {
                        m = a[i].getStd();
                        if (s == m) {
                            System.out.println("Tài khoản " + m);
                            a[i].daoHan();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 6:
                    System.out.println("");
                default:
                    KT = false;
                    break;
            }
            
        } while (KT);
         
    }  
 }

