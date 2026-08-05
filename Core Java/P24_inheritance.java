
class Calc {
  int add(int a, int b) {
    return a + b;
  }

  int sub(int a, int b) {
    return a - b;
  }
}

class advCalc extends Calc {
  int mul(int a, int b) {
    return a * b;
  }

  int div(int a, int b) {
    return a / b;
  }
}

// single inheritance

class sciAdvCalc extends advCalc {
  int power(int a, int b) {
    return (int) (Math.pow(2, 4));
  }
}

// multilevel inheritance

public class P24_inheritance {
  public static void main(String args[]) {
    // Calc obj = new Calc();
    // advCalc obj = new advCalc();
    sciAdvCalc obj = new sciAdvCalc();

    int r1 = obj.add(2, 4);
    int r2 = obj.sub(3, 2);
    int r3 = obj.mul(2, 4);
    int r4 = obj.div(4, 2);
    int r5 = obj.power(2, 4);

    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

  }
}
