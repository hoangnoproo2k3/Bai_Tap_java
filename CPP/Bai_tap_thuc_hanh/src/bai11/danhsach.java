package bai11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AS
 */
public class danhsach {
    ArrayList<person> listPerSon = new ArrayList<>();

    public person inputStudent() {
        System.out.print("Nhap ho ten: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhap diem mon 1 = ");
        float diemMon1 = new Scanner(System.in).nextFloat();
        System.out.print("Nhap diem mon 2 = ");
        float diemMon2 = new Scanner(System.in).nextFloat();
        return new student(diemMon1, diemMon2, hoTen, diaChi);
    }

    public person inputEmployee() {
        System.out.print("Nhap ho ten: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhap he so luong: ");
        float heSoLuong = new Scanner(System.in).nextFloat();
        return new employee(heSoLuong, hoTen, diaChi);
    }

    public person inputCustomer() {
        System.out.print("Nhap ho ten: ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhap ten cong ty: ");
        String tenCongTy = new Scanner(System.in).nextLine();
        System.out.print("Nhap gtri hoa don: ");
        float giaTriHoaDon = new Scanner(System.in).nextFloat();
        return new custome(tenCongTy, giaTriHoaDon, hoTen, diaChi);
    }
     public void nhapDanhSach() {
        
        int chon;
        while (true) {
            System.out.print("1-Student\n 2-Employee\n 3-Customer\n ");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1: {
                    listPerSon.add(inputStudent());
                    break;
                }
                case 2: {
                    listPerSon.add(inputEmployee());
                    break;
                }
                case 3: {
                    listPerSon.add(inputCustomer());
                    break;
                }
                default: {
                    break;
                }
            }
            System.out.println("Bạn muốn chọn tiếp! \n Có \n Không");
            String x= new Scanner(System.in).next();
            if (x.equalsIgnoreCase("Không")) {
                break;
            }
        }
    }
      public void hienDanhSach(){
        for (int i = 0; i < listPerSon.size(); i++) {
            listPerSon.get(i).hienThongTin();
        }
    }
    public void xoaNguoi(){
        System.out.print("Nhap ten nguoi can xoa: ");
        String hoTen = new Scanner(System.in).nextLine();
        for (int i = 0; i < listPerSon.size(); i++) {
            if (listPerSon.get(i).getName().equalsIgnoreCase(hoTen)) {
                listPerSon.get(i).hienThongTin();  
                listPerSon.remove(i);
                          
            }            
        }
    }
    public void sapXepTheoHoTen(){
        for(int i=0;i<listPerSon.size()-1;i++){
            for(int j =i+1;j<listPerSon.size();j++){
                if(listPerSon.get(i).getName().compareTo(listPerSon.get(j).getName())>0) {
                    person tam = new person();
                    tam = listPerSon.get(i);
                    listPerSon.set(i, listPerSon.get(j));
                    listPerSon.set(j, tam);
                }
            }
        }
        for (int i = 0; i < listPerSon.size(); i++) {
            listPerSon.get(i).hienThongTin();
        }
    }

    
}
