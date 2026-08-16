import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P48_finally_and_resources {
  public static void main(String[] args) throws IOException {

    try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {

      int b = Integer.parseInt(bf.readLine());
      System.out.println("You entered: " + b);

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
