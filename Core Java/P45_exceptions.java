
public class P45_exceptions {
  public static void main(String args[]) {

    int i = 2;
    int j = 0;
    int a[] = new int[5];
    String s = null;

    try {
      j = 18 / i;
      System.out.println(s.length());
      System.out.println(a[1]);
      System.out.println(a[5]);
    } 
    catch (ArithmeticException e) {
      System.out.println("divided by zero");
    } 
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("limit is over");
    } 
    catch (Exception e) {
      System.out.println("Something went wrong.." + e.getMessage());
    }

    System.out.println(j);
    System.out.println("bye");
  }
}
