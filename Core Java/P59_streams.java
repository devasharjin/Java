import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class P59_streams {
  public static void main(String args[]) {
    List<Integer> nums = Arrays.asList(2, 1, 4, 7, 6, 9);

    // Stream <Integer> a = nums.stream();
    // Stream <Integer> b = a.filter(n-> n%2==0);
    // Stream <Integer> c = b.map(n-> n*2);
    // int sum = c.reduce(0, (total,count)-> total + count);

    // System.out.println(sum);

    // int sum = nums.stream()
    // .filter(n -> n % 2 == 0)
    // .map(n -> n * 2)
    // .reduce(0, (c, s) -> c + s);

    // System.out.println(sum);

    Stream<Integer> sortedNums = nums.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .sorted();

    sortedNums.forEach(n -> System.out.println(n));

  }
}
