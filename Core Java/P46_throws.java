
class A {
  static {
    System.out.println("class loaded");
  }
}

class B  {
  void show () throws Exception{
    Class.forName("c");
  }
}

public class P46_throws {
  public static void main (String args []){
    B obj = new B();
    try {
      obj.show();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
