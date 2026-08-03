public class P18_StringBuffer {

  //mutable = changeable
  //immmutable = unchangeable

  //string = immutable
  //stringbuffer = muttable

  public static void main(String[] args) {
    StringBuffer a = new StringBuffer("Deva");
    // a.append(" sharjin");
    a.insert(2, "sh");
    a.delete(2,3);
    int d =a.length();

    System.out.println(a);
    System.out.println(d);

  }
  
}
