package baitap2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class mathang {
    private String nameHang;
    private int idHang;
    private String nuocsx;
    public mathang() {
    }

    public mathang(String nameHang, int idHang, String nuocsx, ArrayList<tulanh> dstl) {
        this.nameHang = nameHang;
        this.idHang = idHang;
        this.nuocsx = nuocsx;
    }
    
    
    public String getNameHang() {
        return nameHang;
    }

    public void setNameHang(String nameHang) {
        this.nameHang = nameHang;
    }

    public int getIdHang() {
        return idHang;
    }

    public void setIdHang(int idHang) {
        this.idHang = idHang;
    }

    public String getNuocsx() {
        return nuocsx;
    }

    public void setNuocsx(String nuocsx) {
        this.nuocsx = nuocsx;
    }

    
    @Override
    public String toString() {
        return "mathang{" + "nameHang=" + nameHang + ", idHang=" + idHang + ", nuocsx=" + nuocsx + '}';
    }
    
}
