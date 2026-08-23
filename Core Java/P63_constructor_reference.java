import java.util.ArrayList;
import java.util.List;

class Students {
  private int age;
  private String name;

  public Students(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Students [age=" + age + ", name=" + name + "]";
  }

}

public class P63_constructor_reference {
  public static void main(String args[]) {
    List<String> names = List.of("deva", "hari", "tom");
    List<Students> studs = new ArrayList<>();

    // for (String s : names)
    // studs.add(new Students(s));

    studs = names.stream()
        // .map(n -> new Students(n))
        .map(Students::new)
        .toList();

    System.out.println(studs);
  }
}