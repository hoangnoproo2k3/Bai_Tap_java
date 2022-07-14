package bai7;

import java.util.Scanner;

public class doanthang {
    Scanner in = new Scanner(System.in);
    private diem A, B;

    public doanthang() {
        this.A= new diem();
        this.B = new diem();
    }

    public doanthang(float x1, float y1, float x2, float y2) {
        this.A = new diem(x1,y1);
        this.B = new diem(x2,y2);
    }
    public diem dau(){
        
        diem x= new diem();
        System.out.print("x=");
        x.setX(in.nextFloat());
        System.out.print("y=");
        x.setY(in.nextFloat());
        return x;
        
    }
    public diem cuoi(){
        
        diem y= new diem();
        System.out.print("x=");
        y.setX(in.nextFloat());
        System.out.print("y= ");
        y.setY(in.nextFloat());
        return y;
    }

    public diem getA() {
        return A;
    }

    public void setA() {
        this.A = dau();
    }

    public diem getB() {
        return B;
    }

    public void setB() {
        this.B = cuoi();
    }
    public double doDai(){
        double t= Math.pow(A.getX()-B.getX(), 2)+Math.pow(A.getY()-B.getY(), 2);
        double doDai = Math.sqrt(t);
        return doDai;
    }
    @Override
    public String toString() {
        return "doanthang{" +  ", A=" + A.toString() + ", B=" + B.toString() + '}';
    }
    
}
