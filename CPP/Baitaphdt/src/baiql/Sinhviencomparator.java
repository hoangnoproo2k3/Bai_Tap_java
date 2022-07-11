package baiql;

/**
 *
 * @author AS
 */

import java.util.Comparator;
public class Sinhviencomparator  implements Comparator <Sinhvien>{

    @Override
    public int compare(Sinhvien o1, Sinhvien o2) {
        if(o1.Diemhocphan() == o2.Diemhocphan())
            return 0;
        else if (o1.Diemhocphan() > o2.Diemhocphan())
            return 1;
        else
            return -1;
    }
}
