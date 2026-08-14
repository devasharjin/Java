@FunctionalInterface
interface A {
  void show();
}

// lambda expressions work only on the functionnal interrfaces


public class P43_lambda_expression {
  public static void main(String[] args) {
    A obj = () -> System.out.println("bye");

    obj.show();
  }
}