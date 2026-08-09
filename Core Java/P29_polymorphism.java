
class A {
  void show(){
    System.out.println("in A");
  }
}

class B extends A {
  void show (){
    System.out.println("in B");
  }
}

class C extends A {
  void show (){
    System.out.println("in c");
  }
}


public class P29_polymorphism {
   public static void main(String[] args) {
    A obj = new C();
    obj.show();
   }
  
}