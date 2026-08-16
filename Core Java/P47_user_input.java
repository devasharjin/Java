// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class P47_user_input {
  public static void main (String args[]) throws NumberFormatException, IOException{
    // InputStreamReader in = new InputStreamReader(System.in);
    // BufferedReader bf = new BufferedReader(in);

    // int b = Integer.parseInt(bf.readLine());
    // System.out.println(b);

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(a);
    sc.close();

  }
}
