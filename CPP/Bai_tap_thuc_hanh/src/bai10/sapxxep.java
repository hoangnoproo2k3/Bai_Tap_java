package bai10;

import java.util.Comparator;

/**
 *
 * @author AS
 */
public class sapxxep implements Comparator<tulanh> {
    public int compare(tulanh tl1, tulanh tl2) {
        int sl1 = tl1.getSoluong();
        int sl2 = tl2.getSoluong();
        if (sl1 < sl2) {
            return 1;
        } else if (sl1 == sl2) {
            return 0;
        } else {
            return -1;
        }
    }
}
