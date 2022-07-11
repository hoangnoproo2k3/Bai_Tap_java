/*Tạo ngẫu nhiên một mảng A[n]
1. sắp xếp lại mảng
2. loại bỏ các phần tử trùng nhau
 */
package bai_tap_luyen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
     int n=x.nextInt();
     int a[]= new int [n];
     Random random = new Random(); // tạo ra một random
     int count=0;// khởi tạo giá giá trị đầu của mảng a
     while( count< n){
     a[count++]=random.nextInt(100);} // a[count++] tương đương với a[count] và count++
     int b[]=new int [n];
     int bsize=0;//khởi tạo cho phần tử đầu tiên của mảng b
     boolean KT=false;// đặt cờ hiệu
     for(int i=0;i<n;i++){
         KT=false;
         for(int j=0;j<bsize;j++)
             if(a[i]==a[j]){
                 KT=true;
                 break;
             }
         if(!KT){
             b[bsize++]=a[i];
         }           
     }
        System.out.println("Trước khi sắp xếp");
        System.out.println(Arrays.toString(a));  // sử dụng hàm của mảng trong util
        // Thao tác 1 : sắp xếp lại dãy
        Arrays.sort(a);
        System.out.println("Sau khi sắp xếp");
        System.out.println(Arrays.toString(a));
        // Thao tác 2: Xử lí các phần tử trùng nhau
        b = Arrays.copyOfRange(b, 0, bsize);// copy sang mảng b
        Arrays.sort(b);
        System.out.println("Mảng chỉ chứa các phần tử đơn");
        System.out.println(Arrays.toString(b));       
    }
}
