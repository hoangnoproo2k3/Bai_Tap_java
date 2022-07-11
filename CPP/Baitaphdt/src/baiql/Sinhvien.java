package baiql;

import java.util.Scanner;

/**
 *
 * @author AS
 */
public class Sinhvien  {
    private String MaSV;
    private String sHoten;
    private String sNgaysinh;
    private String sLopHC;
    private float fDiemCK,fDiemGK,fDiemThi;
    public Sinhvien ()
    {}
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap ma sinh vien: ");
        MaSV = sc.nextLine();
        System.out.print("\n Nhap ho ten: ");
        sHoten = sc.nextLine();
        System.out.print("\n Nhap ngay sinh: ");
        sNgaysinh = sc.nextLine();
        System.out.print("\n Nhap lop hanh chinh: ");
        sLopHC = sc.nextLine();
        System.out.print("\n Nhap diem chuyen can: ");
        fDiemCK = sc.nextFloat();
        System.out.print("\n Nhap diem giua ki: ");
        fDiemGK = sc.nextFloat();
        System.out.print("\n Nhap diem thi: ");
        fDiemThi = sc.nextFloat();
    }
    public void Xuat()
    {
        System.out.printf("\n %10s", MaSV );
        System.out.printf(" %15s", sHoten);
        System.out.printf(" %12s", sNgaysinh);
        System.out.printf(" %10s", sLopHC);
        System.out.printf(" %6.1f", fDiemCK);
        System.out.printf(" %6.1f", fDiemGK);
        System.out.printf(" %6.1f", fDiemCK);
    }
    public float Diemhocphan()
    {
        return 0.1f*fDiemCK+0.2f*fDiemGK+0.7f*fDiemThi;
    }
    public String getTen()
    {
        return sHoten;
    }
}
