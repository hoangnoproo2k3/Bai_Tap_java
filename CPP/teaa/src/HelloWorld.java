import java.util.Scanner;

public class HelloWorld { 
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                System.out.print("  ");
            }
            them(i);
            System.out.print("\n") ;
        }
 
    }
    public static void them(int n) {
        int t = 1;
        for (int i = 0; i < n - 1; i++) {
            System.out.print(t + " ") ;
            t++;
        }
        for (int i = t - 1; i >= 0; i--) {
            System.out.print(t + " ");
            t--;
        }
    }
    
}