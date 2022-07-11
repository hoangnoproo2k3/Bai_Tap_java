package bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class danhsach {

    hocsinh ds[];
    int n, sum = 0;

    public danhsach() {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhập vào số lượng sinh viên: ");
        n = x.nextInt();
        ds = new hocsinh[n];
    }

    public void nhapDS() {
        for (int i = 0; i < n; i++) {
            ds[i] = new hocsinh();
            ds[i].nhap();
        }
    }

    public void hienDS() {
        System.out.println("Danh sách là: ");
        for (int i = 0; i < n; i++) {
            ds[i].hien();
        }
    }
    public void tongTien() {
        for (int i = 0; i < n; i++) {
            sum += ds[i].tien;
        }
        System.out.println("Tổng tiền là: "+sum);
    }
    public void sapXep(){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(ds[i].so_buoi_an>ds[j].so_buoi_an){
                    hocsinh x;
                    x=ds[i];
                    ds[i]=ds[j];
                    ds[j]=x;
                }
                    
            }
            hienDS();
        }
    }
}
