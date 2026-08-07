package P28_access_specifier;

import P28_access_specifier.dir2.sample2;

public class demo extends sample2 {
  void display(){
    System.out.println(this.a);
  }
  public static void main(String[] args) {
    // sample2 obj = new sample2();

    // System.out.println(obj.a);

    // demo obj = new demo();
    // System.out.println(obj.a);

    new demo().display();

  }
}
