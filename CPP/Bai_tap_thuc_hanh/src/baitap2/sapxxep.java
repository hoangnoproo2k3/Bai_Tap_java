package baitap2;
import java.util.Comparator;
/**
 *
 * @author AS
 */
public class sapxxep implements Comparator<tulanh>{
    public int compare(tulanh o1, tulanh o2) {
  int sl1 = o1.getSoluong();
  int sl2 = o2.getSoluong();
  if(sl1<sl2){
   return 1;
  }else if(sl1==sl2){
   return 0;
  }else{
   return -1;
  }
 }
}
