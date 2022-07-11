package bai7;

/**
 *
 * @author AS
 */
import java.util.Scanner;

public class test {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số đường thẳng: ");
        int n = sc.nextInt();
        doanthang[] a = new doanthang[n];
        nhapdoanthang(a,n);
        hiends(a,n);
        maxlength(a,n);
        
        
    }
    
    public static void nhapdoanthang(doanthang[] a, int n) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++)
        {
            System.out.println("Đoạn thẳng thứ " + (i+1));
            a[i] = new doanthang();
            a[i].nhap();
            
        }
    }
    
    public static void hiends(doanthang[] a, int n) {
        for(int i=0; i<n; i++)
        {
            System.out.println(" "+a[i].toString());
        }
    }
    
    
    public static void maxlength(doanthang[] a, int n) {
        double max = 0;
        for(int i=0; i<n; i++)
        {
            if(a[i].dodai() > max)
            {
                max=a[i].dodai();
            }
        }
        System.out.println("Đoạn thẳng có độ dài lớn nhất : "+max);
        double tong=0;
        for(int i=0; i<n; i++)
        {
            tong+=a[i].dodai();
        }
        System.out.println("Tổng độ dài là: "+tong);
}
}