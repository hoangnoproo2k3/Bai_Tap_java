package bai7;

/**
 *
 * @author AS
 */
import java.util.Scanner;

public class diem {
    private int x;
    private int y;
    public diem() {
    }
    public diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("x= ");
        x = sc.nextInt();
        System.out.println("y= ");
        y = sc.nextInt();
    }
    public double doDai(diem d) {
        return Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }

}
