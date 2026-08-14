
@FunctionalInterface
interface A {
  int add(int a, int b);
}

public class P44_lambda_expressions_with_return {
  public static void main(String[] args) {
    // A obj = (a,b)->{
    //   return a+b;
    // };
    A obj = (a, b) -> a + b;
    int result = obj.add(2, 4);
    System.out.println(result);
  }
}
