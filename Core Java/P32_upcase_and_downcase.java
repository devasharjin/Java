
class A{
  public void show1 (){
    System.out.println("in A");
  }
}

class B extends A {
  public void show2 (){
    System.out.println("in B");
  }
}

public class P32_upcase_and_downcase {
  public static void main(String[] args) {
    A obj = new B();
    obj.show1();

    
    B obj2 = (B)obj;
    obj2.show2();
  }  
}