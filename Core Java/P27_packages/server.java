package P27_packages;

import P27_packages.calc.calc;;

public class server {
  public static void main(String[] args) {
  calc obj = new calc();
  int r1 = obj.add(1 , 3);
  int r2 = obj.mul(1 , 3);
  int r3 = obj.power(1 , 3);


  System.out.println(r1);
  System.out.println(r2);
  System.out.println(r3);
}
}
