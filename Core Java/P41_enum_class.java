enum Computer {
  macBook(1500), victus(), vivobook(500), nitro(800);

  private int price;

  Computer() {
    this.price = 700;
  }

  Computer(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

}

public class P41_enum_class {
  public static void main(String[] args) {
    Computer obj[] = Computer.values();

    for (Computer lap : obj) {
      System.out.println(lap + " : " + lap.getPrice());
    }

  }
}
