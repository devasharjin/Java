public class P05_logical_operator {
  public static void main (String args []){
    int a = 5;
    int b = 10;
    int x = 8;
    int y = 12;

    // boolean result = a > b && x > y;
    // boolean result = a>b || x<y;
    boolean result = !(a >b);
    System.out.println(result);
  }
}
