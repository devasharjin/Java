
abstract class A {
  abstract void show();
}

public class P36_anonymous_inner_class {
  public static void main(String[] args) {
    A obj = new A(){
      void show(){
        System.out.println("anonymous inner class");
      }
    };
    obj.show();

    
  }
}
