/*import danh_sach;*/
import danh_sach_xe.xe;
import java.util.Scanner;
public class test {
    static Scanner sc = new Scanner(System.in);
    //tạo phương thức nhập thông tin cho xe
      static void nhapXe(xe xe){
            System.out.print("Nhập mã xe: ");
            xe.setMaXe(sc.nextInt());sc.nextLine();
            System.out.print("Nhập tên chủ xe: ");
            xe.setChuXe(sc.nextLine());
            System.out.print("Nhập dung tích xe: ");
            xe.setDungTich(sc.nextInt());
            System.out.print("Nhập trị giá xe: ");
            xe.setTriGia(sc.nextDouble());;sc.nextLine();
            System.out.print("Mô tả: ");
            xe.setMoTa(sc.nextLine());
        }
        //tạo phương thức main để chạy các phương thức khác ở class Vehicle
    public static void main(String[] args) {
        

        System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
        int n = sc.nextInt();
        //khai báo mảng v[] để chứa số lượng xe
        xe v[] = new xe[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Xe thứ " + (i + 1));
            v[i] = new xe();
            nhapXe(v[i]);
        }

        System.out.printf("%-10s %-20s %-15s %-15s %-10s %-8s \n", "Mã xe", "Chủ xe", "Dung tích", "Trị giá", "mô tả", "Thuế");
        for (int i = 0; i < n; i++) {
            v[i]=inThue();
        }

    }
}
