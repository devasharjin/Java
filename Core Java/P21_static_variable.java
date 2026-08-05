class Phone {
  String brand;
  int price;
  static String name;

  Phone(String brand, int price) {
    this.brand = brand;
    this.price = price;
  }

}

public class P21_static_variable {
  public static void main(String args[]) {
    Phone obj1 = new Phone("iphone", 1500);
    Phone obj2 = new Phone("samsung", 1700);

    Phone.name = "smart Phone";

    System.out.println(obj1.brand + " : " + obj1.price + " : " + Phone.name);
    System.out.println(obj2.brand + " : " + obj2.price + " : " + Phone.name);
  }
}
