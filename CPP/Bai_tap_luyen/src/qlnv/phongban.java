package qlnv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class phongban {
    private String idPhong;
    private String namePhong;
    private ArrayList<nhanvien> dsnv;

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
    }

    public String getNamePhong() {
        return namePhong;
    }

    public void setNamePhong(String namePhong) {
        this.namePhong = namePhong;
    }

    public ArrayList<nhanvien> getDsnv() {
        return dsnv;
    }

    public void setDsnv(ArrayList<nhanvien> dsnv) {
        this.dsnv = dsnv;
    }

    public phongban() {
    }

    public phongban(String idPhong, String namePhong, ArrayList<nhanvien> dsnv) {
        this.idPhong = idPhong;
        this.namePhong = namePhong;
        this.dsnv = dsnv;
    }

    @Override
    public String toString() {
        return "phongban{" + "idPhong=" + idPhong + ", namePhong=" + namePhong + '}';
    }
}