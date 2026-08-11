interface A {
  int a =10;
  void show ();
}

interface B extends A {
  void config ();
}


class demo implements B {
  public void show() {
   System.out.println("running..");
  }

  public void config(){
    System.out.println("playing...");
  }
 
}

public class P37_interface {
  public static void main(String args[]){
    B obj = new demo();
    obj.show();
    obj.config();
    System.out.println(obj.a);
  }  
}
