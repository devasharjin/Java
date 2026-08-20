import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P55_comparetor_1 {
  public static void main (String args []){
    List <Integer> nums = new ArrayList<>();
    nums.add(29);
    nums.add(47);
    nums.add(38);
    nums.add(96);

    Comparator<Integer> comp = new Comparator<>() {
      public int compare(Integer i , Integer j){
        if (i%10 > j%10)
          return 1;
        else
          return -1;
      }
    };

    Collections.sort(nums,comp);

    System.out.println(nums);

  }
}
