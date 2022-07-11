import java.util.Scanner;

/*Bài 1: Cho một chuỗi str và số nguyên n >= 0.
 Chia chuỗi str ra làm các phần bằng nhau với n ký tự.
 Nếu chuỗi không chia được thì xuất ra màn hình “KO”.*/
public class bai1 {

    public static void tach() {
        String s;
        int n;
        Scanner x = new Scanner(System.in);
        s = x.next();
        n = x.nextInt();
        int k = s.length() - 1;
        if (k % n != 0) {
            System.out.println("KO");
            return;
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));
                if ((i + 1) % n == 0) {
                    System.out.println(" ");
                }
            }
        }

    }

    public static void main(String[] args) {

        tach();
    }
}
