
package KT_thucpham;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class class_thucpham {
    private int ID;
    private String name;
    private double gia;
    private Date nsx, hsd;

    public class_thucpham() {
    }

    public class_thucpham(int ID, String name, double gia, Date nsx, Date hsd) {
        this.ID = ID;
        this.name = name;
        this.gia = gia;
        this.nsx = nsx;
        this.hsd = hsd;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public Date getNsx() {
        return nsx;
    }

    public void setNsx(Date nsx) {
        this.nsx = nsx;
    }

    public Date getHsd() {
        return hsd;
    }

    public void setHsd(Date hsd) {
        this.hsd = hsd;
    }

    @Override
    public String toString() {
        // sử dụng phương thức để đưa về ngày tháng
        SimpleDateFormat x=new SimpleDateFormat();
        String Nsx=x.format(nsx);
        String Hsd=x.format(hsd);
        return "Thông tin về sản phầm: \n" + "ID=" + ID + "\n Tên hàng: " + name + 
                "\n Đơn giá: " + gia + 
                "\n NSX: " + Nsx + "\n HSD: " + Hsd ;
    }
     public void setNSX(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nsx = calendar.getTime();
    }
      public void setHSD(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.hsd = calendar.getTime();
    }
    public boolean kt(boolean k){
        if(this.name==""||this.name.isEmpty()) System.out.println("Không được để trống!");
        else k=false;
        return k;
    }
}
