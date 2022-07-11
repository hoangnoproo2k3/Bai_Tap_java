package bai10;

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

    public mathang(String nameHang, int idHang, String nuocsx) {
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
    public void nhap(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập tên hàng tủ lạnh: ");
        nameHang= in.nextLine();
        System.out.print("Nhập id hàng: ");
        idHang = in.nextInt();
        System.out.print("Nhập nước sx: ");
        nuocsx= new Scanner(System.in).nextLine();
    }
    public void hien(){
        System.out.println("\n + Ten hang tủ lạnh: "+nameHang+"\n + Ma hang: "+idHang+"\n + Nuoc SX: "+nuocsx);
    }
}
