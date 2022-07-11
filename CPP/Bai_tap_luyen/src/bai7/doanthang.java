package bai7;

/**
 *
 * @author AS
 */
public class doanthang {
    private diem A;//thuoc tính là doi tuong//
    private diem B;

     public doanthang(){
         A=new diem();
         B=new diem();
         
     }
    public doanthang(int x1,int x2,int y1,int y2){
        A=new diem(x1,y1);
        B=new diem(x2,y2);
   
    }
    public void nhap(){
        System.out.println("Điểm A: ");
        A.nhap();
        System.out.println("Điểm B: ");
        B.nhap();
        
    }
//    public void hien(){
//        System.out.println(A.toString()+"-----"+B.toString());
//    }

    @Override
    public String toString() {
        return A.toString()+"------"+B.toString();
    }
    public double dodai(){
        return A.doDai(B);
    }

  
}