import java.util.ArrayList;
import java.util.List;

public class P62_method_reference {
  public static void main(String[] args) {
    List<String> names = List.of("deva", "hari", "abi");
    List<String> studs = new ArrayList<>();

    studs = names.stream()
        .map(String::toUpperCase)
        .toList();
    studs.forEach(System.out::println);
  }
}
