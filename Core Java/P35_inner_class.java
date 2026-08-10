
class A {
  void show1() {
    System.out.println("in A");
  }

  class B {
    void show2() {
      System.out.println("in B");
    }
  }
}

public class P35_inner_class {
  public static void main(String args[]) {
    A obj1 = new A();
    obj1.show1();

    A.B obj2 = obj1.new B();
    obj2.show2();

  }
}
