
class A{
  public A(){
    this.hello();
    System.out.println("in A");
  }

  public A(int b){
    this();
    System.out.println("in A int");
  }

  public void hello(){
    System.out.println("In A function");
  }
}

class B extends A {
  public B(){
   this(0);
    System.out.println("in B");
  }

public B(int b){
  super(b);
  System.out.println("in B int");
}

public void hello() {
  super.hello();
  System.out.println("In B function");
}
}

public class P25_this_and_super {
  public static void main (String args []){
    B obj = new B();
  }
}
