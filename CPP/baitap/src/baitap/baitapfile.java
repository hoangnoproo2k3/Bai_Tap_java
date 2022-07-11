
package baitap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class baitapfile {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("input.txt");
        Scanner x= new Scanner(file);
        int []a= new int [100];
        //String []b= new String [100];
        int i=0;
        while(x.hasNextInt()){
            int k=x.nextInt();
            a[i]=k;
            i++;    
            if(i>=100) break;
        }
//        while(x.hasNext()){
//            String s=x.next();
//            b[j]=s;
//            j++;
//        }
//        chu(b);
        so(a);
        
    }
    private static void so(int []a){
        for(int i=0;i<a.length;i++){
           if(i==0) break;
            System.out.println(i);
        }
    }
//    private static void chu(String []b){
//        for(String n: b){
//            if(n==null) break;
//            System.out.println(n);
//        }
//    }
}
