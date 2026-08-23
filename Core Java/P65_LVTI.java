import java.util.ArrayList;

class A {
  private int data = 10;

  @Override
  public String toString() {
    return "A [data=" + data + "]";
  }

}

public class P65_LVTI {
  public static void main(String args[]) {
    var a = 10;
    var b = "Deva";
    var c = new int[10];
    var d = new ArrayList<>();
    var e = new A();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}
