
class Laptop {
  public String brand;
  public int price;

  public String toString() {
    return "hi";
  }

  public boolean equals (Laptop that){
    return (this.brand.equals(that.brand) && (this.price == that.price));
  }

}

public class P31_object_class {
  public static void main(String[] args) {
    Laptop obj = new Laptop();
    obj.brand = "apple";
    obj.price = 12;

    Laptop obj2 = new Laptop();
    obj2.brand = "apple";
    obj2.price = 12;

    boolean result = obj.equals(obj2);

    System.out.println(result);
  }
}
