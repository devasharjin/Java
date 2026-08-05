
class Hello {
  Hello(){
    System.out.println("In constructor");
  }
  public void get(){
    System.out.println("In function");
  }
}

public class P23_ananymous_class {
  public static void main (String args[]){
    new Hello().get();
  }
}
