// import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class P53_Set {
  public static void main(String args[]) {
    Set<Integer> a = new TreeSet<Integer>();
    a.add(182);
    a.add(835);
    a.add(345);
    a.add(285);
    a.add(285);

    // System.out.println(a.isEmpty());
    // System.out.println(a.size());
    // System.out.println(a);

    for (int value : a) {
      System.out.println(value);
    }
  }
}
