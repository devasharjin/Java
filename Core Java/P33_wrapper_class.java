
class demo {
  private int a = 10;
  Integer num1 = a;

  private double b = 10.25;
  Double num2 = b;

  String c = "12";

  int result4 = Integer.parseInt(c);
  int result5 = num2.hashCode();
}

public class P33_wrapper_class {
  public static void main(String[] args) {
    demo obj = new demo();

    int result1 = obj.num1;
    double result2 = obj.num2;
    String result3 = obj.c;

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(obj.result4);
    System.out.println(obj.result5);
  }

}