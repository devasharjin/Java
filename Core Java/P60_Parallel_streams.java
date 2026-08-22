import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P60_Parallel_streams {
  public static void main(String args[]) {
    int size = 10_000;
    List<Integer> nums = new ArrayList<>(size);

    Random rand = new Random();
    for (int i = 1; i <= size; i++)
      nums.add(rand.nextInt(100));

    // System.out.println(nums);

    // int sum1 = nums.stream()
    // .map(i -> i*2)
    // .reduce(0, (c,s)->c+s);

    long seqstart = System.currentTimeMillis();
    int sum2 = nums.stream()
        .map(i -> {
          try {
            Thread.sleep(1);
          } catch (Exception e) {
            // TODO: handle exception
          }
          return i * 2;
        })
        .mapToInt(i -> i)
        .sum();
    long seqEnd = System.currentTimeMillis();

    long parStart = System.currentTimeMillis();
    int sum3 = nums.parallelStream()
        .map(i -> {
          try {
            Thread.sleep(1);
          } catch (Exception e) {
            // TODO: handle exception
          }
          return i * 2;
        })
        .mapToInt(i -> i)
        .sum();
    long parEnd = System.currentTimeMillis();

    // System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
    System.out.println("seq time " + " : " + (seqEnd - seqstart));
    System.out.println("par time " + " : " + (parEnd - parStart));

  }
}
