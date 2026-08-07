
class calc {
  public int add(int a, int b) {
    return a + b;
  }
}

class advCalc extends calc {
  @Override
  public int add(int a, int b) {
    return a + b + 1;
  }
}

public class P26_method_overriding {
  public static void main(String args[]) {
    advCalc obj = new advCalc();
    int r = obj.add(2,3);
    System.out.println(r);

  }
}
