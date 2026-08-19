// import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class P54_Map {
  public static void main(String args[]) {
    Map<String, Integer> a = new TreeMap<String, Integer>();
    
    a.put("deva", 19);
    a.put("adhi", 1);
    a.put("aravind", 4);
    a.put("ayyalu", 7);

    // int value = a.get("deva");
    // System.out.println(value);

    Set<String> keys = a.keySet();

    System.out.println(keys);

    for (String i : keys){
      System.out.println(i + " : " + a.get(i));
    }

  }
}
