
class A {
    void show(){
      System.out.println("in A");
    }
}

class B extends A {
  @Override
  void show(){
    System.out.println("in B");
  }
}

public class P42_annotations {
  public static void main (String args[]){
    A obj = new B();
    obj.show();
  }
}
