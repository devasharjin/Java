class Calculator {
  public int add(int n1 , int n2){
    return n1 + n2;
  }

  public int add(int n1, int n2, int n3){
    return n1 + n2 + n3;
  }

  public String add(String s){
    return s;
  }
}

public class P12_methods_overloading {
  public static void main (String args[]){
    Calculator obj = new Calculator();

    int result1 = obj.add(2, 3,5);
    String result2 = obj.add("Added");

    System.out.println(result1);
    System.out.println(result2);
  }
}
