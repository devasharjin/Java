import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//comparable must be used in the Student Class because we want to compare with 2 students

class Students implements Comparable<Students>  {
  int age;
  String name;

  public Students(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Students [age=" + age + ", name=" + name + "]";
  }

  @Override
  public int compareTo(Students that) {
    return (this.age > that.age) ? 1 : -1;
  }

}

public class P57_comparable {
  public static void main(String[] args) {
    List <Students> studs = new ArrayList<>();
    studs.add(new Students(18, "Kholi"));
    studs.add(new Students(17, "abd"));
    studs.add(new Students(33, "hardik"));
    studs.add(new Students(77, "Gill"));
  
    Collections.sort(studs);
  
  for (Students s : studs)
    System.out.println(s);
  }
}
