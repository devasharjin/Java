class Computer {

  public void playMusic() {
    System.out.println("Playing");
  }

  public String getBooks(int cost) {
    if (cost > 10) {
      return "Purchased";
    } else {
      return "purchased";
    }
  }
}

public class P11_methods {

  public static void main(String[] args) {
    Computer obj = new Computer();
    obj.playMusic();
    String result = obj.getBooks(20);
    System.out.println(result);
  }
}
