package bai15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author AS
 */
public class test {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        DSHocSinh x = new DSHocSinh();
        File fname = new File("testDShocSinh.txt");
        x.nhapDS();
//        x.hienDs();
//        x.XLtimKiem();
//        x.ghiFile();
        x.docFile();
        x.hienTudocfile();
    }
}
