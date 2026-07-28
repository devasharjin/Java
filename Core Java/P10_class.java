

class Calculator {
  public int add(int a, int b) {
    int r = a + b;
    return r;
  }
}

public class P10_class {
 public static void main (String args[]){
   int num1 = 20;
  int num2 = 10;

  Calculator data = new Calculator();

  int result = data.add(num1, num2);

  System.out.println(result);
 }
}
