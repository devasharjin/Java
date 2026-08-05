class Phone {
  String brand;
  int price;
  static String name;

  public Phone(String brand, int price) {
    this.brand = brand;
    this.price = price;
  }

  static{
    System.out.println("in static");
  }

  // public static void add(String n){
  //   name = n;
  // }

}

public class P22_static_methods {
  public static void main(String args[]) throws ClassNotFoundException {
    // Phone obj1 = new Phone("iphone", 1000);
    // // Phone.add("smartphonne");
    
    // System.out.println(obj1.brand + " : " + obj1.price + " : " + Phone.name);

    Class.forName("Phone"); // to load the class without or before creating the object

  }
}
