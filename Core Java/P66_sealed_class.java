sealed class A permits B, C {
  int a = 10;
}

non-sealed class B extends A {
  int b = 10;
}

final class C extends A {

}

final class D extends B {
  int c = a;
}

public class P66_sealed_class {
  public static void main(String args[]) {
    var ab=new D();
    System.out.println(ab.a);
  }
}
