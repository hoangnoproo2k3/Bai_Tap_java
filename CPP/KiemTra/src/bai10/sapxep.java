package bai10;

import java.util.Comparator;

/**
 *
 * @author AS
 */
public class sapxep implements Comparator<tuLanh> {
    public int compare(tuLanh o1, tuLanh o2) {
        int tl1 = o1.getSoLuong();
        int tl2 = o2.getSoLuong();
        if (tl1 < tl2) {
            return 1;
        } else if (tl1 == tl2) {
            return 0;
        } else {
            return -1;
        }
    }
    
}
