package bai12;

import java.util.Comparator;

/**
 *
 * @author AS
 */
public class sapxep implements Comparator<hocSinh> {

    public int compare(hocSinh o1, hocSinh o2) {
        String sl1 = o1.getLop();
        String sl2 = o2.getLop();
        if (sl1.compareTo(sl2) > 0) {
            return 1;
        } else if (sl1.compareTo(sl2) == 0) {
            return 0;
        } else {
            return -1;
        }
    }

}
