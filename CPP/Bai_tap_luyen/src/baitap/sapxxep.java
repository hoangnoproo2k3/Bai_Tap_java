package baitap;

import java.util.Comparator;

/**
 *
 * @author AS
 */
public class sapxxep implements Comparator<sinhVien>  {
    public int compare(sinhVien o1, sinhVien o2) {
  int id1 = o1.getId();
  int id2 = o2.getId();
  if(id1>id2){
   return 1;
  }else if(id1==id2){
   return 0;
  }else{
   return -1;
  }
 }
}
